package typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a new voice mail message on a phone line. */
@js.native
trait PhoneNewVoicemailMessageTriggerDetails extends js.Object {
  /** Gets the ID of the phone line for which the new voice mail arrived. */
  var lineId: String = js.native
  /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
  var operatorMessage: String = js.native
  /** Gets the new count of voice mail messages for the phone line. */
  var voicemailCount: Double = js.native
}

object PhoneNewVoicemailMessageTriggerDetails {
  @scala.inline
  def apply(lineId: String, operatorMessage: String, voicemailCount: Double): PhoneNewVoicemailMessageTriggerDetails = {
    val __obj = js.Dynamic.literal(lineId = lineId.asInstanceOf[js.Any], operatorMessage = operatorMessage.asInstanceOf[js.Any], voicemailCount = voicemailCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNewVoicemailMessageTriggerDetails]
  }
  @scala.inline
  implicit class PhoneNewVoicemailMessageTriggerDetailsOps[Self <: PhoneNewVoicemailMessageTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoicemailCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voicemailCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

