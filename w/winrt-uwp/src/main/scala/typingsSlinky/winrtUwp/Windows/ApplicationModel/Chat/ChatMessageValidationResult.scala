package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides results for validation of chat messages. */
@js.native
trait ChatMessageValidationResult extends js.Object {
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  var maxPartCount: Double = js.native
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  var partCount: Double = js.native
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  var remainingCharacterCountInPart: Double = js.native
  /** Gets the message validation status code. */
  var status: ChatMessageValidationStatus = js.native
}

object ChatMessageValidationResult {
  @scala.inline
  def apply(
    maxPartCount: Double,
    partCount: Double,
    remainingCharacterCountInPart: Double,
    status: ChatMessageValidationStatus
  ): ChatMessageValidationResult = {
    val __obj = js.Dynamic.literal(maxPartCount = maxPartCount.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], remainingCharacterCountInPart = remainingCharacterCountInPart.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageValidationResult]
  }
  @scala.inline
  implicit class ChatMessageValidationResultOps[Self <: ChatMessageValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPartCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingCharacterCountInPart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingCharacterCountInPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ChatMessageValidationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

