package typingsSlinky.tesseractJs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.HTMLCanvasElement
  - typingsSlinky.std.HTMLVideoElement
  - typingsSlinky.std.CanvasRenderingContext2D
  - typingsSlinky.std.File
  - typingsSlinky.std.Blob
  - typingsSlinky.std.ImageData
  - typingsSlinky.node.Buffer
*/
trait ImageLike extends js.Object

object ImageLike {
  @scala.inline
  implicit def apply(value: Blob): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: Buffer): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: CanvasRenderingContext2D): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: File): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: HTMLCanvasElement): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: HTMLImageElement): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: HTMLVideoElement): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: ImageData): ImageLike = value.asInstanceOf[ImageLike]
  @scala.inline
  implicit def apply(value: String): ImageLike = value.asInstanceOf[ImageLike]
}

