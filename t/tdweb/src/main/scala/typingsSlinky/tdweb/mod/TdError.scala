package typingsSlinky.tdweb.mod

import typingsSlinky.tdweb.tdwebStrings.error
import typingsSlinky.tdweb.tdwebStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdError extends js.Object {
  var `@extra`: js.UndefOr[string] = js.native
  var `@type`: error = js.native
  /**
    * Error code; subject to future changes. If the error code is 406, the error message
    * must not be processed in any way and must not be displayed to the user
    */
  var code: Double = js.native
  /** Error message; subject to future changes */
  var message: String = js.native
}

object TdError {
  @scala.inline
  def apply(`@type`: error, code: Double, message: String): TdError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdError]
  }
  @scala.inline
  implicit class TdErrorOps[Self <: TdError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@type`(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with@extra`(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without@extra`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@extra")(js.undefined)
        ret
    }
  }
  
}

