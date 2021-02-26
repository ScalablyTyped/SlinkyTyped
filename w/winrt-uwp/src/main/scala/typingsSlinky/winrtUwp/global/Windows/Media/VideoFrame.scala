package typingsSlinky.winrtUwp.global.Windows.Media

import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single frame of video data. */
@JSGlobal("Windows.Media.VideoFrame")
@js.native
class VideoFrame protected ()
  extends typingsSlinky.winrtUwp.Windows.Media.VideoFrame {
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double) = this()
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    * @param alpha The alpha mode of the video frame.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode) = this()
}
