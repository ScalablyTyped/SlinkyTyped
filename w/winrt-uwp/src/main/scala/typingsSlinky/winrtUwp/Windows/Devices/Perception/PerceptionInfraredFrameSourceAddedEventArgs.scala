package typingsSlinky.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for infrared frame source added events. */
@js.native
trait PerceptionInfraredFrameSourceAddedEventArgs extends js.Object {
  /** Gets the infrared frame source that was added. */
  var frameSource: PerceptionInfraredFrameSource = js.native
}

object PerceptionInfraredFrameSourceAddedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceAddedEventArgs]
  }
  @scala.inline
  implicit class PerceptionInfraredFrameSourceAddedEventArgsOps[Self <: PerceptionInfraredFrameSourceAddedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameSource(value: PerceptionInfraredFrameSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

