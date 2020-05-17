package typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains arguments that are available from the event object during the CommandsRequested event. */
@js.native
trait SettingsPaneCommandsRequestedEventArgs extends js.Object {
  /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
  var request: SettingsPaneCommandsRequest = js.native
}

object SettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
  }
  @scala.inline
  implicit class SettingsPaneCommandsRequestedEventArgsOps[Self <: SettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: SettingsPaneCommandsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

