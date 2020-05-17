package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.CanvasImageSource
  - typingsSlinky.std.Blob
  - typingsSlinky.std.ImageData
*/
trait ImageBitmapSource extends js.Object

object ImageBitmapSource {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.Blob): ImageBitmapSource = value.asInstanceOf[ImageBitmapSource]
  @scala.inline
  implicit def apply(value: CanvasImageSource): ImageBitmapSource = value.asInstanceOf[ImageBitmapSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.ImageData): ImageBitmapSource = value.asInstanceOf[ImageBitmapSource]
}

