package typingsSlinky.winrt.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Fonts")
@js.native
object Fonts extends js.Object {
  @js.native
  class LanguageFont ()
    extends typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFont
  
  @js.native
  class LanguageFontGroup protected ()
    extends typingsSlinky.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
    def this(languageTag: String) = this()
  }
  
}

