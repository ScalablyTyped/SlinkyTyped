package typingsSlinky.w3cImageCapture

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.raw.Blob
import typingsSlinky.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageCapture extends StObject {
  
  def getPhotoCapabilities(): js.Promise[PhotoCapabilities] = js.native
  
  def getPhotoSettings(): js.Promise[PhotoSettings] = js.native
  
  def grabFrame(): js.Promise[ImageBitmap] = js.native
  
  def takePhoto(): js.Promise[Blob] = js.native
  def takePhoto(photoSettings: PhotoSettings): js.Promise[Blob] = js.native
  
  val track: MediaStreamTrack = js.native
}
