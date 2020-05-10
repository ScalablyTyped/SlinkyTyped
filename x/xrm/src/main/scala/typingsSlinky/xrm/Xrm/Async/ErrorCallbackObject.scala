package typingsSlinky.xrm.Xrm.Async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to ErrorCallbackDelegate.
  */
@js.native
trait ErrorCallbackObject extends js.Object {
  /**
    * The error code.
    */
  var errorCode: Double = js.native
  /**
    * An error message describing the issue.
    */
  var message: String = js.native
}

object ErrorCallbackObject {
  @scala.inline
  def apply(errorCode: Double, message: String): ErrorCallbackObject = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackObject]
  }
  @scala.inline
  implicit class ErrorCallbackObjectOps[Self <: ErrorCallbackObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

