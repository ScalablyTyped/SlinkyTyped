package typingsSlinky.winrt.Windows.Globalization.Fonts

import typingsSlinky.winrt.Windows.UI.Text.FontStretch
import typingsSlinky.winrt.Windows.UI.Text.FontStyle
import typingsSlinky.winrt.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageFont extends ILanguageFont

object LanguageFont {
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    fontWeight: FontWeight,
    scaleFactor: Double
  ): LanguageFont = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageFont]
  }
}

