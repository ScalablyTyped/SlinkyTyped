package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the VoiceCommandCompleted event. */
@js.native
trait VoiceCommandCompletedEventArgs extends js.Object {
  /** The reason the voice command completed. */
  var reason: VoiceCommandCompletionReason = js.native
}

object VoiceCommandCompletedEventArgs {
  @scala.inline
  def apply(reason: VoiceCommandCompletionReason): VoiceCommandCompletedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandCompletedEventArgs]
  }
  @scala.inline
  implicit class VoiceCommandCompletedEventArgsOps[Self <: VoiceCommandCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: VoiceCommandCompletionReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

