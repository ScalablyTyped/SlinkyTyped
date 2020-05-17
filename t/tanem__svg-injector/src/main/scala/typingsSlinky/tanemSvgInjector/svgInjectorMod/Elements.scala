package typingsSlinky.tanemSvgInjector.svgInjectorMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.std.HTMLCollectionOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLCollectionOf[typingsSlinky.std.Element]
  - typingsSlinky.std.NodeListOf[typingsSlinky.std.Element]
  - typingsSlinky.std.Element
  - scala.Null
*/
trait Elements extends js.Object

object Elements {
  @scala.inline
  implicit def apply(value: Element): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: HTMLCollectionOf[Element]): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: NodeListOf[Element with Node]): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: Null): Elements = value.asInstanceOf[Elements]
}

