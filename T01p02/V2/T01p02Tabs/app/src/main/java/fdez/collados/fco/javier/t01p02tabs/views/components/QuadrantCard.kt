package fdez.collados.fco.javier.t01p02tabs.views.components

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun QuadrantCard(
    titleCard: String,
    paragraphCard: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = titleCard,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )

        Text(
            text = paragraphCard,
            textAlign = TextAlign.Justify
        )

    }


}