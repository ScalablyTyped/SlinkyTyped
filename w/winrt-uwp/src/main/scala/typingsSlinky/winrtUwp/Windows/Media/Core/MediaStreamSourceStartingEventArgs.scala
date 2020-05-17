package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Starting event. */
@js.native
trait MediaStreamSourceStartingEventArgs extends js.Object {
  /** Gets the object that represents the request to start accumulating MediaStreamSample data. */
  var request: MediaStreamSourceStartingRequest = js.native
}

object MediaStreamSourceStartingEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceStartingRequest): MediaStreamSourceStartingEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingEventArgs]
  }
  @scala.inline
  implicit class MediaStreamSourceStartingEventArgsOps[Self <: MediaStreamSourceStartingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: MediaStreamSourceStartingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

