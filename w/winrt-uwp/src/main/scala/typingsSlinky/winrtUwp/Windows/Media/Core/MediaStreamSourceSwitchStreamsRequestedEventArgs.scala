package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
@js.native
trait MediaStreamSourceSwitchStreamsRequestedEventArgs extends js.Object {
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest = js.native
}

object MediaStreamSourceSwitchStreamsRequestedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceSwitchStreamsRequest): MediaStreamSourceSwitchStreamsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestedEventArgs]
  }
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestedEventArgsOps[Self <: MediaStreamSourceSwitchStreamsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: MediaStreamSourceSwitchStreamsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

