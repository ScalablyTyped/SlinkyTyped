package typingsSlinky.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twoJs.mod.SVGRenderer
  - typingsSlinky.twoJs.mod.WebGLRenderer
  - typingsSlinky.twoJs.mod.CanvasRenderer
*/
trait Renderer extends js.Object

object Renderer {
  @scala.inline
  implicit def apply(value: CanvasRenderer): Renderer = value.asInstanceOf[Renderer]
  @scala.inline
  implicit def apply(value: SVGRenderer): Renderer = value.asInstanceOf[Renderer]
  @scala.inline
  implicit def apply(value: WebGLRenderer): Renderer = value.asInstanceOf[Renderer]
}

