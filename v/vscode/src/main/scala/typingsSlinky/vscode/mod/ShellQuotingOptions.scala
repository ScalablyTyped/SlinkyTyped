package typingsSlinky.vscode.mod

import typingsSlinky.vscode.AnonCharsToEscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellQuotingOptions extends js.Object {
  /**
  		 * The character used to do character escaping. If a string is provided only spaces
  		 * are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
  		 * in `charsToEscape` are escaped using the `escapeChar`.
  		 */
  var escape: js.UndefOr[String | AnonCharsToEscape] = js.native
  /**
  		 * The character used for strong quoting. The string's length must be 1.
  		 */
  var strong: js.UndefOr[String] = js.native
  /**
  		 * The character used for weak quoting. The string's length must be 1.
  		 */
  var weak: js.UndefOr[String] = js.native
}

object ShellQuotingOptions {
  @scala.inline
  def apply(): ShellQuotingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellQuotingOptions]
  }
  @scala.inline
  implicit class ShellQuotingOptionsOps[Self <: ShellQuotingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscape(value: String | AnonCharsToEscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withStrong(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
    @scala.inline
    def withWeak(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(js.undefined)
        ret
    }
  }
  
}

