package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLImageElement
  - typingsSlinky.std.SVGImageElement
*/
trait HTMLOrSVGImageElement extends CanvasImageSource

object HTMLOrSVGImageElement {
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.HTMLImageElement): HTMLOrSVGImageElement = value.asInstanceOf[HTMLOrSVGImageElement]
  @scala.inline
  implicit def apply(value: org.scalajs.dom.raw.SVGImageElement): HTMLOrSVGImageElement = value.asInstanceOf[HTMLOrSVGImageElement]
}

