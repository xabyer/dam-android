package fdez.collados.fco.javier.businesscard.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fdez.collados.fco.javier.businesscard.R
import fdez.collados.fco.javier.businesscard.views.components.ContactCard
import fdez.collados.fco.javier.businesscard.views.components.ProfileCard

@Composable
fun HomeView(modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
    ) {

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .weight(70F)
                .padding(top = 32.dp)
        ) {
            ProfileCard(
                painterResource(R.drawable.android_logo),
                stringResource(R.string.android_logo),
                stringResource(R.string.profile_name),
                stringResource(R.string.profile_title),
            )
        }

        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .weight(30F)
        ) {
            ContactCard()
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomeViewPreview() {
    HomeView()
}