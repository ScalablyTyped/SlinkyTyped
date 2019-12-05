package typingsSlinky.w3cDashImageDashCapture

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.raw.Blob
import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageCapture")
@js.native
class ImageCapture protected () extends js.Object {
  def this(videoTrack: MediaStreamTrack) = this()
  val track: MediaStreamTrack = js.native
  def getPhotoCapabilities(): js.Promise[PhotoCapabilities] = js.native
  def getPhotoSettings(): js.Promise[PhotoSettings] = js.native
  def grabFrame(): js.Promise[ImageBitmap] = js.native
  def takePhoto(): js.Promise[Blob] = js.native
  def takePhoto(photoSettings: PhotoSettings): js.Promise[Blob] = js.native
}

