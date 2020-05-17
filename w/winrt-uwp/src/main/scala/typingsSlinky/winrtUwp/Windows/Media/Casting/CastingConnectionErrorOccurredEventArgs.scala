package typingsSlinky.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for the ErrorOccurred event from the CastingConnection */
@js.native
trait CastingConnectionErrorOccurredEventArgs extends js.Object {
  /** Gets the particular error that triggered the casting error event, ErrorOccurred . */
  var errorStatus: CastingConnectionErrorStatus = js.native
  /** Gets human-readable message to accompany the error status code, ErrorStatus . */
  var message: String = js.native
}

object CastingConnectionErrorOccurredEventArgs {
  @scala.inline
  def apply(errorStatus: CastingConnectionErrorStatus, message: String): CastingConnectionErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorStatus = errorStatus.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingConnectionErrorOccurredEventArgs]
  }
  @scala.inline
  implicit class CastingConnectionErrorOccurredEventArgsOps[Self <: CastingConnectionErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorStatus(value: CastingConnectionErrorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStatus")(value.asInstanceOf[js.Any])
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

