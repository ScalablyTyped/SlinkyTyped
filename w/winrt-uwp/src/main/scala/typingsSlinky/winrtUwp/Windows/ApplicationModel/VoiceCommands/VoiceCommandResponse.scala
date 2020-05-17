package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
@js.native
trait VoiceCommandResponse extends js.Object {
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String = js.native
  /** The initial message that is spoken by Cortana and shown on the Cortana canvas. */
  var message: VoiceCommandUserMessage = js.native
  /** The secondary message (for disambiguation and confirmation screens only) that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood. */
  var repeatMessage: VoiceCommandUserMessage = js.native
  /** The collection of assets, containing image and text data, provided by the background app service for display on the Cortana canvas. */
  var voiceCommandContentTiles: IVector[VoiceCommandContentTile] = js.native
}

object VoiceCommandResponse {
  @scala.inline
  def apply(
    appLaunchArgument: String,
    message: VoiceCommandUserMessage,
    repeatMessage: VoiceCommandUserMessage,
    voiceCommandContentTiles: IVector[VoiceCommandContentTile]
  ): VoiceCommandResponse = {
    val __obj = js.Dynamic.literal(appLaunchArgument = appLaunchArgument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeatMessage = repeatMessage.asInstanceOf[js.Any], voiceCommandContentTiles = voiceCommandContentTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandResponse]
  }
  @scala.inline
  implicit class VoiceCommandResponseOps[Self <: VoiceCommandResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppLaunchArgument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: VoiceCommandUserMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatMessage(value: VoiceCommandUserMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceCommandContentTiles(value: IVector[VoiceCommandContentTile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceCommandContentTiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

