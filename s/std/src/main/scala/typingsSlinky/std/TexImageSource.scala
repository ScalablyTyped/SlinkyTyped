package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ImageBitmap
  - typingsSlinky.std.ImageData
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.HTMLCanvasElement
  - typingsSlinky.std.HTMLVideoElement
  - typingsSlinky.std.OffscreenCanvas
*/
trait TexImageSource extends js.Object

object TexImageSource {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLCanvasElement): TexImageSource = value.asInstanceOf[TexImageSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLImageElement): TexImageSource = value.asInstanceOf[TexImageSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLVideoElement): TexImageSource = value.asInstanceOf[TexImageSource]
  @scala.inline
  implicit def apply(value: ImageBitmap): TexImageSource = value.asInstanceOf[TexImageSource]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.ImageData): TexImageSource = value.asInstanceOf[TexImageSource]
  @scala.inline
  implicit def apply(value: OffscreenCanvas): TexImageSource = value.asInstanceOf[TexImageSource]
}

