package typingsSlinky.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for depth frame source removed events. */
@js.native
trait PerceptionDepthFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the depth frame source that was removed. */
  var frameSource: PerceptionDepthFrameSource = js.native
}

object PerceptionDepthFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionDepthFrameSource): PerceptionDepthFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrameSourceRemovedEventArgs]
  }
  @scala.inline
  implicit class PerceptionDepthFrameSourceRemovedEventArgsOps[Self <: PerceptionDepthFrameSourceRemovedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameSource(value: PerceptionDepthFrameSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

