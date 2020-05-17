package typingsSlinky.turndown.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.Document
  - typingsSlinky.std.DocumentFragment
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: Document): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: DocumentFragment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: HTMLElement): Node = value.asInstanceOf[Node]
}

