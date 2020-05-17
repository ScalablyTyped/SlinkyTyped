package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.CanvasRenderingContext2D
  - typingsSlinky.std.ImageBitmapRenderingContext
  - typingsSlinky.std.WebGLRenderingContext
  - typingsSlinky.std.WebGL2RenderingContext
*/
trait RenderingContext extends js.Object

object RenderingContext {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.CanvasRenderingContext2D): RenderingContext = value.asInstanceOf[RenderingContext]
  @scala.inline
  implicit def apply(value: ImageBitmapRenderingContext): RenderingContext = value.asInstanceOf[RenderingContext]
  @scala.inline
  implicit def apply(value: WebGL2RenderingContext): RenderingContext = value.asInstanceOf[RenderingContext]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.WebGLRenderingContext): RenderingContext = value.asInstanceOf[RenderingContext]
}

