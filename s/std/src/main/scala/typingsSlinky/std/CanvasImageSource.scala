package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLOrSVGImageElement
  - typingsSlinky.std.HTMLVideoElement
  - typingsSlinky.std.HTMLCanvasElement
  - typingsSlinky.std.ImageBitmap
  - typingsSlinky.std.OffscreenCanvas
*/
trait CanvasImageSource extends ImageBitmapSource

object CanvasImageSource {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLCanvasElement): CanvasImageSource = value.asInstanceOf[CanvasImageSource]
  @scala.inline
  implicit def apply(value: HTMLOrSVGImageElement): CanvasImageSource = value.asInstanceOf[CanvasImageSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLVideoElement): CanvasImageSource = value.asInstanceOf[CanvasImageSource]
  @scala.inline
  implicit def apply(value: ImageBitmap): CanvasImageSource = value.asInstanceOf[CanvasImageSource]
  @scala.inline
  implicit def apply(value: OffscreenCanvas): CanvasImageSource = value.asInstanceOf[CanvasImageSource]
}

