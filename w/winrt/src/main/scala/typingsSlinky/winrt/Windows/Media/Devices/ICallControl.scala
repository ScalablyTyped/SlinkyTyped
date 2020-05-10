package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICallControl extends js.Object {
  var hasRinger: Boolean = js.native
  var onanswerrequested: js.Any = js.native
  var onaudiotransferrequested: js.Any = js.native
  var ondialrequested: js.Any = js.native
  var onhanguprequested: js.Any = js.native
  var onkeypadpressed: js.Any = js.native
  var onredialrequested: js.Any = js.native
  def endCall(callToken: Double): Unit = js.native
  def indicateActiveCall(callToken: Double): Unit = js.native
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
  def indicateNewOutgoingCall(): Double = js.native
}

object ICallControl {
  @scala.inline
  def apply(
    endCall: Double => Unit,
    hasRinger: Boolean,
    indicateActiveCall: Double => Unit,
    indicateNewIncomingCall: (Boolean, String) => Double,
    indicateNewOutgoingCall: () => Double,
    onanswerrequested: js.Any,
    onaudiotransferrequested: js.Any,
    ondialrequested: js.Any,
    onhanguprequested: js.Any,
    onkeypadpressed: js.Any,
    onredialrequested: js.Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1(endCall), hasRinger = hasRinger.asInstanceOf[js.Any], indicateActiveCall = js.Any.fromFunction1(indicateActiveCall), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = js.Any.fromFunction0(indicateNewOutgoingCall), onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallControl]
  }
  @scala.inline
  implicit class ICallControlOps[Self <: ICallControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndCall(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasRinger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRinger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicateActiveCall(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicateActiveCall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndicateNewIncomingCall(value: (Boolean, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicateNewIncomingCall")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIndicateNewOutgoingCall(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicateNewOutgoingCall")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnanswerrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onanswerrequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnaudiotransferrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onaudiotransferrequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndialrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondialrequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnhanguprequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhanguprequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnkeypadpressed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypadpressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnredialrequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onredialrequested")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

