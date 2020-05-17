package typingsSlinky.winrtUwp.Windows.Devices.Sms

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of calling SmsDevice2.SendMessageAndGetResultAsync . */
@js.native
trait SmsSendMessageResult extends js.Object {
  /** Gets the cellular class used in the send operation. */
  var cellularClass: CellularClass = js.native
  /** Gets a boolean value indicating whether the send operation has encountered a transient error. */
  var isErrorTransient: Boolean = js.native
  /** Gets a value indicating whether the send operation was successful. */
  var isSuccessful: Boolean = js.native
  /** Gets a list of message numbers sent. */
  var messageReferenceNumbers: IVectorView[Double] = js.native
  /** Gets the error code for a modem error associated with the send operation. */
  var modemErrorCode: SmsModemErrorCode = js.native
  /** Gets the error code for a network error associated with the send operation. */
  var networkCauseCode: Double = js.native
  /** Gets the error code for a transport failure associated with the send operation. */
  var transportFailureCause: Double = js.native
}

object SmsSendMessageResult {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    isErrorTransient: Boolean,
    isSuccessful: Boolean,
    messageReferenceNumbers: IVectorView[Double],
    modemErrorCode: SmsModemErrorCode,
    networkCauseCode: Double,
    transportFailureCause: Double
  ): SmsSendMessageResult = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], isErrorTransient = isErrorTransient.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], messageReferenceNumbers = messageReferenceNumbers.asInstanceOf[js.Any], modemErrorCode = modemErrorCode.asInstanceOf[js.Any], networkCauseCode = networkCauseCode.asInstanceOf[js.Any], transportFailureCause = transportFailureCause.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsSendMessageResult]
  }
  @scala.inline
  implicit class SmsSendMessageResultOps[Self <: SmsSendMessageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsErrorTransient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isErrorTransient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuccessful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageReferenceNumbers(value: IVectorView[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageReferenceNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModemErrorCode(value: SmsModemErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modemErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkCauseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkCauseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportFailureCause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportFailureCause")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

