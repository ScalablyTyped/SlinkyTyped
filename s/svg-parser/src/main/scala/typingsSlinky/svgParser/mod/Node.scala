package typingsSlinky.svgParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgParser.mod.TextNode
  - typingsSlinky.svgParser.mod.ElementNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: ElementNode): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TextNode): Node = value.asInstanceOf[Node]
}

