package typingsSlinky.uikit.mod

import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.NodeList
  - typingsSlinky.std.HTMLCollection
  - typingsSlinky.uikit.mod.UIkitNode
*/
trait UIkitNodes extends js.Object

object UIkitNodes {
  @scala.inline
  implicit def apply(value: HTMLCollection): UIkitNodes = value.asInstanceOf[UIkitNodes]
  @scala.inline
  implicit def apply(value: NodeList): UIkitNodes = value.asInstanceOf[UIkitNodes]
  @scala.inline
  implicit def apply(value: Node): UIkitNodes = value.asInstanceOf[UIkitNodes]
}

