package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the depth frame data. */
@js.native
trait PerceptionDepthFrame extends js.Object {
  /** Gets a Windows.Media.VideoFrame with the depth frame data. */
  var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
}

object PerceptionDepthFrame {
  @scala.inline
  def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionDepthFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrame]
  }
  @scala.inline
  implicit class PerceptionDepthFrameOps[Self <: PerceptionDepthFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVideoFrame(value: VideoFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

