package fdez.collados.fco.javier.t02p03.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t02p03.R

@Composable
fun DisplayController(
    onBtnPrevClick : () -> Unit,
    onBtnNextClick : () -> Unit,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .padding(dimensionResource(R.dimen.sixteen_dp))
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        OutlinedButton(
            onClick = onBtnPrevClick,
            modifier = Modifier
                .width(dimensionResource(R.dimen.one_hundred_twenty_eight_dp))
                .padding(start = dimensionResource(R.dimen.eight_dp))
        ) {
            Text(
                text = stringResource(R.string.previous)
            )
        }

        OutlinedButton(
            onBtnNextClick,
            modifier = Modifier
                .width(dimensionResource(R.dimen.one_hundred_twenty_eight_dp))
                .padding(end = dimensionResource(R.dimen.eight_dp))
        ) {
            Text(
                text = stringResource(R.string.next)
            )
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun DisplayControllerPreview() {

    DisplayController(
        onBtnPrevClick = {},
        onBtnNextClick = {},
    )
}