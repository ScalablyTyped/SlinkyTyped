package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the infrared frame data. */
@js.native
trait PerceptionInfraredFrame extends js.Object {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  
  /** Gets a Windows.Media.VideoFrame with the infrared frame data. */
  var videoFrame: VideoFrame = js.native
}
object PerceptionInfraredFrame {
  
  @scala.inline
  def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionInfraredFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrame]
  }
  
  @scala.inline
  implicit class PerceptionInfraredFrameOps[Self <: PerceptionInfraredFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVideoFrame(value: VideoFrame): Self = this.set("videoFrame", value.asInstanceOf[js.Any])
  }
}
