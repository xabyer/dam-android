package fdez.collados.fco.javier.simpletextapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.simpletextapp.R

@Composable
fun Home(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Text(
            text = message,
            fontFamily = FontFamily.Serif,
            fontSize = 85.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomePreview() {
    val message = stringResource(R.string.message)
    val from = stringResource(R.string.signature)
    Home(message, from)
}