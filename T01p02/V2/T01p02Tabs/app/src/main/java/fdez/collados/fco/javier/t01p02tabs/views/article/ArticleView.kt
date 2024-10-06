package fdez.collados.fco.javier.t01p02tabs.views.article

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.t01p02tabs.views.components.ArticleImage

@Composable
fun ArticleView(
    painter: Painter,
    title: String,
    shortParagraph: String,
    paragraphComposeUi: String,
    modifier: Modifier = Modifier

) {

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        ArticleImage(
            painter,
            null
        )

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = shortParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )

        Text(
            text = paragraphComposeUi,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }

}