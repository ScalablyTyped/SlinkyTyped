package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
@js.native
trait MediaStreamSourceSwitchStreamsRequest extends js.Object {
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor = js.native
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor = js.native
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral = js.native
}

object MediaStreamSourceSwitchStreamsRequest {
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceSwitchStreamsRequestDeferral,
    newStreamDescriptor: IMediaStreamDescriptor,
    oldStreamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSwitchStreamsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), newStreamDescriptor = newStreamDescriptor.asInstanceOf[js.Any], oldStreamDescriptor = oldStreamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequest]
  }
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestOps[Self <: MediaStreamSourceSwitchStreamsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeferral(value: () => MediaStreamSourceSwitchStreamsRequestDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStreamDescriptor(value: IMediaStreamDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStreamDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldStreamDescriptor(value: IMediaStreamDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStreamDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

