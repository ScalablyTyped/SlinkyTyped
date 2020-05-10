package typingsSlinky.winrt.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettingsPaneCommandsRequestedEventArgs extends js.Object {
  var request: SettingsPaneCommandsRequest = js.native
}

object ISettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(request: SettingsPaneCommandsRequest): ISettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingsPaneCommandsRequestedEventArgs]
  }
  @scala.inline
  implicit class ISettingsPaneCommandsRequestedEventArgsOps[Self <: ISettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
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

