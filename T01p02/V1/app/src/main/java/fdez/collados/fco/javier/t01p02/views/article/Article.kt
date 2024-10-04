package fdez.collados.fco.javier.t01p02.views.article

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.t01p02.R

@Composable
fun Article(
    painter: Painter,
    title: String,
    shortParagraph: String,
    paragraphComposeUi: String,
    modifier: Modifier = Modifier

) {

    Column(
        modifier = modifier
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ArticlePreview() {
    val title = stringResource(R.string.title)
    val shortParagraph = stringResource(R.string.short_paragraph)
    val paragraphComposeUi = stringResource(R.string.paragraph_compose_ui)

    Article(
        painterResource(R.drawable.bg_compose_background),
        title,
        shortParagraph,
        paragraphComposeUi
    )

}