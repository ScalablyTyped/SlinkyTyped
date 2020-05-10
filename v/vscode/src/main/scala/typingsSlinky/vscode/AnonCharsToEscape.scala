package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharsToEscape extends js.Object {
  /**
  			 * The characters to escape.
  			 */
  var charsToEscape: String = js.native
  /**
  			 * The escape character.
  			 */
  var escapeChar: String = js.native
}

object AnonCharsToEscape {
  @scala.inline
  def apply(charsToEscape: String, escapeChar: String): AnonCharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape.asInstanceOf[js.Any], escapeChar = escapeChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharsToEscape]
  }
  @scala.inline
  implicit class AnonCharsToEscapeOps[Self <: AnonCharsToEscape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharsToEscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsToEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

