package fdez.collados.fco.javier.simpleimagetextapp.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.simpleimagetextapp.R

@Composable
fun Home(message: String, from: String, modifier: Modifier = Modifier) {
    PartyImage(
        message,
        from
    )

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomePreview() {
    val message = stringResource(R.string.message)
    val from = stringResource(R.string.signature)
    Home(message, from)
}