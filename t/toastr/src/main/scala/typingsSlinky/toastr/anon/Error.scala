package typingsSlinky.toastr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  /**
  		 * Icon to use on error toasts.
  		 * @default toast-error
  		 */
  var error: String = js.native
  /**
  		 * Icon to use on info toasts.
  		 * @default toast-info
  		 */
  var info: String = js.native
  /**
  		 * Icon to use on success toasts.
  		 * @default toast-success
  		 */
  var success: String = js.native
  /**
  		 * Icon to use on warning toasts.
  		 * @default toast-warning
  		 */
  var warning: String = js.native
}

object Error {
  @scala.inline
  def apply(error: String, info: String, success: String, warning: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

