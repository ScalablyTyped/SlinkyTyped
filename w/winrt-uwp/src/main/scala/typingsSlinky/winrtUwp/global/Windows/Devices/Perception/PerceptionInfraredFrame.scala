package typingsSlinky.winrtUwp.global.Windows.Devices.Perception

import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a Windows.Media.VideoFrame with the infrared frame data. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrame")
@js.native
abstract class PerceptionInfraredFrame ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrame {
  /** Gets a Windows.Media.VideoFrame with the infrared frame data. */
  /* CompleteClass */
  override var videoFrame: VideoFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  /* CompleteClass */
  override def close(): Unit = js.native
}

