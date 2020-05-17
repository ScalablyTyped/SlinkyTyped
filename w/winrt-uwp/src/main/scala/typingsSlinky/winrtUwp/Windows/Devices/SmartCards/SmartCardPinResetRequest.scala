package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a smart card personal identification number (PIN) reset request. */
@js.native
trait SmartCardPinResetRequest extends js.Object {
  /** Gets the smart card's challenge value. */
  var challenge: IBuffer = js.native
  /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
  var deadline: js.Date = js.native
  /**
    * Gets an instance of a wait time for a requested smart card personal identification number (PIN) reset.
    * @return An instance of a wait time for a requested smart card PIN reset.
    */
  def getDeferral(): SmartCardPinResetDeferral = js.native
  /**
    * Sets the response to a smart card authentication challenge/response operation.
    * @param response The response to a smart card authentication challenge/response operation.
    */
  def setResponse(response: IBuffer): Unit = js.native
}

object SmartCardPinResetRequest {
  @scala.inline
  def apply(
    challenge: IBuffer,
    deadline: js.Date,
    getDeferral: () => SmartCardPinResetDeferral,
    setResponse: IBuffer => Unit
  ): SmartCardPinResetRequest = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setResponse = js.Any.fromFunction1(setResponse))
    __obj.asInstanceOf[SmartCardPinResetRequest]
  }
  @scala.inline
  implicit class SmartCardPinResetRequestOps[Self <: SmartCardPinResetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenge(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => SmartCardPinResetDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetResponse(value: IBuffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

