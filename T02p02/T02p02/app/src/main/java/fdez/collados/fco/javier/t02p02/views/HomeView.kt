package fdez.collados.fco.javier.t02p02.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t02p02.R
import fdez.collados.fco.javier.t02p02.views.componentes.LemonadeStep
import fdez.collados.fco.javier.t02p02.views.componentes.TopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(modifier: Modifier = Modifier) {

    var currentStep by remember { mutableIntStateOf(1) }
    var squeezeCount by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.lemonade),
                topAppBarColor = TopAppBarDefaults.largeTopAppBarColors(
                    MaterialTheme.colorScheme.surfaceDim
                ),
                modifier = modifier
            )
        }

    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.secondaryContainer),
            color = MaterialTheme.colorScheme.background
        ) {
            when (currentStep) {

                1 -> {
                    LemonadeStep(
                        stepCommentaryResourceId = R.string.lemon_tree,
                        drawableResourceId = R.drawable.lemon_tree,
                        contentDescriptionResourceId = R.string.lemon_tree_content_description,
                        onImageClick = {
                            //Set random SqueezeCount:
                            squeezeCount = (2..4).random()

                            //go to next step:
                            currentStep = 2
                        }
                    )
                }

                2 -> {
                    LemonadeStep(
                        stepCommentaryResourceId = R.string.lemon_squeeze,
                        drawableResourceId = R.drawable.lemon_squeeze,
                        contentDescriptionResourceId = R.string.lemon_squeeze_content_description,
                        onImageClick = {

                            //go to next step when squeezeCount = 0
                            --squeezeCount

                            if (squeezeCount == 0) {
                                currentStep = 3
                            }
                        }
                    )
                }

                3 -> {
                    LemonadeStep(
                        stepCommentaryResourceId = R.string.lemonade_drink,
                        drawableResourceId = R.drawable.lemon_drink,
                        contentDescriptionResourceId = R.string.lemonade_drink_content_description,
                        onImageClick = {
                            //go to next step
                            currentStep = 4
                        }
                    )
                }

                4 -> {
                    LemonadeStep(
                        stepCommentaryResourceId = R.string.empty_glass,
                        drawableResourceId = R.drawable.lemon_restart,
                        contentDescriptionResourceId = R.string.empty_glass_content_description,
                        onImageClick = {
                            //go to start
                            currentStep = 1
                        }
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomeViewPreview() {

    HomeView()

}