package typingsSlinky.winrtUwp.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@js.native
trait JapanesePhoneme extends js.Object {
  /** Gets the text to display for this Japanese word. */
  var displayText: String = js.native
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  var isPhraseStart: Boolean = js.native
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  var yomiText: String = js.native
}

object JapanesePhoneme {
  @scala.inline
  def apply(displayText: String, isPhraseStart: Boolean, yomiText: String): JapanesePhoneme = {
    val __obj = js.Dynamic.literal(displayText = displayText.asInstanceOf[js.Any], isPhraseStart = isPhraseStart.asInstanceOf[js.Any], yomiText = yomiText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JapanesePhoneme]
  }
  @scala.inline
  implicit class JapanesePhonemeOps[Self <: JapanesePhoneme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPhraseStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPhraseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYomiText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yomiText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

