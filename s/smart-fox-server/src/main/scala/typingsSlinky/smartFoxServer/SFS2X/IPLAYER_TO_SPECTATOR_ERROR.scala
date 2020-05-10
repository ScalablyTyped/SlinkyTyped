package typingsSlinky.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPLAYER_TO_SPECTATOR_ERROR extends js.Object {
  var errorCode: Double = js.native
  var errorMessage: String = js.native
}

object IPLAYER_TO_SPECTATOR_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IPLAYER_TO_SPECTATOR_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR_ERROR]
  }
  @scala.inline
  implicit class IPLAYER_TO_SPECTATOR_ERROROps[Self <: IPLAYER_TO_SPECTATOR_ERROR] (val x: Self) extends AnyVal {
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
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

