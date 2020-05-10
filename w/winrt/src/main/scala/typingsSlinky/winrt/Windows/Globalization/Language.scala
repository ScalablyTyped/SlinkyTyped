package typingsSlinky.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected () extends ILanguage {
  def this(languageTag: String) = this()
}

/* static members */
@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  var currentInputMethodLanguageTag: String = js.native
  def isWellFormed(languageTag: String): Boolean = js.native
}

