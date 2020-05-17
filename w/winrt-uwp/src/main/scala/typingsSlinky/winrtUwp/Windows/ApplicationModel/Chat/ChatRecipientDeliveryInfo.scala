package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represent the delivery info about a chat recipient. */
@js.native
trait ChatRecipientDeliveryInfo extends js.Object {
  /** Gets or sets the time the message was sent to the recipient. */
  var deliveryTime: js.Date = js.native
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  var isErrorPermanent: Boolean = js.native
  /** Gets or sets the time the recipient read the message. */
  var readTime: js.Date = js.native
  /** Gets the status of the message. */
  var status: ChatMessageStatus = js.native
  /** Gets or sets the transport address of the recipient. */
  var transportAddress: String = js.native
  /** Get the transport error code. */
  var transportErrorCode: Double = js.native
  /** Gets the category for the TransportErrorCode . */
  var transportErrorCodeCategory: ChatTransportErrorCodeCategory = js.native
  /** Gets the interpreted error code for the transport. */
  var transportInterpretedErrorCode: ChatTransportInterpretedErrorCode = js.native
}

object ChatRecipientDeliveryInfo {
  @scala.inline
  def apply(
    deliveryTime: js.Date,
    isErrorPermanent: Boolean,
    readTime: js.Date,
    status: ChatMessageStatus,
    transportAddress: String,
    transportErrorCode: Double,
    transportErrorCodeCategory: ChatTransportErrorCodeCategory,
    transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
  ): ChatRecipientDeliveryInfo = {
    val __obj = js.Dynamic.literal(deliveryTime = deliveryTime.asInstanceOf[js.Any], isErrorPermanent = isErrorPermanent.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transportAddress = transportAddress.asInstanceOf[js.Any], transportErrorCode = transportErrorCode.asInstanceOf[js.Any], transportErrorCodeCategory = transportErrorCodeCategory.asInstanceOf[js.Any], transportInterpretedErrorCode = transportInterpretedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRecipientDeliveryInfo]
  }
  @scala.inline
  implicit class ChatRecipientDeliveryInfoOps[Self <: ChatRecipientDeliveryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsErrorPermanent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isErrorPermanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ChatMessageStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportErrorCodeCategory(value: ChatTransportErrorCodeCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportErrorCodeCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportInterpretedErrorCode(value: ChatTransportInterpretedErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportInterpretedErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

