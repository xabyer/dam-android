package fdez.collados.fco.javier.simpleimagetextapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fdez.collados.fco.javier.simpleimagetextapp.R

@Composable
fun PartyImage(message: String, from: String, modifier: Modifier = Modifier) {
    Box(

    ) {
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentDescription = "Colorful image from a Happy Birthday Card.",
            contentScale = ContentScale.Crop,
            alpha = 0.5F

        )

        MessageText(
            message,
            from,
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun PartyImagePreview() {
    val message = stringResource(R.string.message)
    val from = stringResource(R.string.signature)
    PartyImage(message, from)
}