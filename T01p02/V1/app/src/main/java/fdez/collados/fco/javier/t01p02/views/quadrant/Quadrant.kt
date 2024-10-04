package fdez.collados.fco.javier.t01p02.views.quadrant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t01p02.R
import fdez.collados.fco.javier.t01p02.ui.theme.quadrantColor1
import fdez.collados.fco.javier.t01p02.ui.theme.quadrantColor2
import fdez.collados.fco.javier.t01p02.ui.theme.quadrantColor3
import fdez.collados.fco.javier.t01p02.ui.theme.quadrantColor4

@Composable
fun Quadrant(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantCard(
                stringResource(R.string.quadrant_one_title),
                stringResource(R.string.quadrant_one_description),
                quadrantColor1,
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                stringResource(R.string.quadrant_two_title),
                stringResource(R.string.quadrant_two_description),
                quadrantColor2,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadrantCard(
                stringResource(R.string.quadrant_three_title),
                stringResource(R.string.quadrant_three_description),
                quadrantColor3,
                modifier = Modifier.weight(1f)
            )

            QuadrantCard(
                stringResource(R.string.quadrant_four_title),
                stringResource(R.string.quadrant_four_description),
                quadrantColor4,
                modifier = Modifier.weight(1f)
            )
        }

    }

}

@Preview
@Composable
private fun QuadrantPreview() {

    Quadrant()

}