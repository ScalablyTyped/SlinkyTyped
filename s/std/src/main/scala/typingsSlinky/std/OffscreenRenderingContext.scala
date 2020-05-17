package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.OffscreenCanvasRenderingContext2D
  - typingsSlinky.std.ImageBitmapRenderingContext
  - typingsSlinky.std.WebGLRenderingContext
  - typingsSlinky.std.WebGL2RenderingContext
*/
trait OffscreenRenderingContext extends js.Object

object OffscreenRenderingContext {
  @scala.inline
  implicit def apply(value: ImageBitmapRenderingContext): OffscreenRenderingContext = value.asInstanceOf[OffscreenRenderingContext]
  @scala.inline
  implicit def apply(value: OffscreenCanvasRenderingContext2D): OffscreenRenderingContext = value.asInstanceOf[OffscreenRenderingContext]
  @scala.inline
  implicit def apply(value: WebGL2RenderingContext): OffscreenRenderingContext = value.asInstanceOf[OffscreenRenderingContext]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.WebGLRenderingContext): OffscreenRenderingContext = value.asInstanceOf[OffscreenRenderingContext]
}

