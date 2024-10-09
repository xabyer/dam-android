package fdez.collados.fco.javier.businesscard.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fdez.collados.fco.javier.businesscard.R

@Composable
fun ContactCard(modifier: Modifier = Modifier) {


        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()

        ) {
            ContactComponent(
                Icons.Rounded.Phone,
                stringResource(R.string.phone_icon),
                stringResource(R.string.phone_number)

            )
            ContactComponent(
                Icons.Rounded.Share,
                stringResource(R.string.share_icon),
                stringResource(R.string.share_text),
                modifier = modifier.padding(start = 4.dp)
            )
            ContactComponent(
                Icons.Rounded.Email,
                stringResource(R.string.email_icon),
                stringResource(R.string.email),
                modifier = modifier.padding(start = 32.dp)

            )

        }

}

@Composable
fun ContactComponent(
    imageVector: ImageVector,
    contentDescription: String,
    contactText: String,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(bottom = 16.dp)
            .fillMaxWidth()
    ) {

        Icon(
            imageVector,
            contentDescription,
            tint = Color(0xFF006D3B),
            modifier = Modifier
                .padding(end = 16.dp)
        )

        Text(
            text = contactText,
            textAlign = TextAlign.Start
        )

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ContactCardPreview() {

    ContactCard()
}