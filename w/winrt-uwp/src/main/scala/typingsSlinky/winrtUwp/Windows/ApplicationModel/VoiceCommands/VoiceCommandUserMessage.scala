package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The message that is spoken by Cortana and shown on the Cortana canvas. */
@js.native
trait VoiceCommandUserMessage extends js.Object {
  /** Gets or sets the message that is shown on the Cortana canvas. */
  var displayMessage: String = js.native
  /** The message that is spoken by Cortana. */
  var spokenMessage: String = js.native
}

object VoiceCommandUserMessage {
  @scala.inline
  def apply(displayMessage: String, spokenMessage: String): VoiceCommandUserMessage = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], spokenMessage = spokenMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandUserMessage]
  }
  @scala.inline
  implicit class VoiceCommandUserMessageOps[Self <: VoiceCommandUserMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpokenMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spokenMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

