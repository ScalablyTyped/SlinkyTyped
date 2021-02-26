package typingsSlinky.winrtUwp.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a Windows.Media.VideoFrame with the color frame data. */
@js.native
trait PerceptionColorFrame extends StObject {
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  
  /** Gets a Windows.Media.VideoFrame with the color frame data. */
  var videoFrame: VideoFrame = js.native
}
object PerceptionColorFrame {
  
  @scala.inline
  def apply(close: () => Unit, videoFrame: VideoFrame): PerceptionColorFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), videoFrame = videoFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrame]
  }
  
  @scala.inline
  implicit class PerceptionColorFrameMutableBuilder[Self <: PerceptionColorFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVideoFrame(value: VideoFrame): Self = StObject.set(x, "videoFrame", value.asInstanceOf[js.Any])
  }
}
