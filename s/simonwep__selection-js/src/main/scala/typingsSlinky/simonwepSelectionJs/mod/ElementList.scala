package typingsSlinky.simonwepSelectionJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Element
  - js.Array[typingsSlinky.std.Element]
  - typingsSlinky.std.NodeList
  - typingsSlinky.std.HTMLCollection
*/
trait ElementList extends js.Object

object ElementList {
  @scala.inline
  implicit def apply(value: js.Array[Element]): ElementList = value.asInstanceOf[ElementList]
  @scala.inline
  implicit def apply(value: Element): ElementList = value.asInstanceOf[ElementList]
  @scala.inline
  implicit def apply(value: HTMLCollection): ElementList = value.asInstanceOf[ElementList]
  @scala.inline
  implicit def apply(value: NodeList): ElementList = value.asInstanceOf[ElementList]
}

