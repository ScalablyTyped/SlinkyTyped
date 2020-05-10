package typingsSlinky.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the service has been resolved (or errored). If successful, the [socket](Titanium.Network.BonjourService.socket) property should now be available.
		 */
@js.native
trait BonjourServiceResolveEvent extends BonjourServiceBaseEvent {
  /**
  			 * Error code
  			 */
  var code: Double = js.native
  /**
  			 * Error message
  			 */
  var error: String = js.native
  /**
  			 * Reports if the resolve operation was successful
  			 */
  var success: Boolean = js.native
}

object BonjourServiceResolveEvent {
  @scala.inline
  def apply(code: Double, error: String, source: BonjourService, success: Boolean): BonjourServiceResolveEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceResolveEvent]
  }
  @scala.inline
  implicit class BonjourServiceResolveEventOps[Self <: BonjourServiceResolveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

