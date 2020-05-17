package typingsSlinky.styletronEngineAtomic.mod

import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.std.HTMLCollectionOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLCollectionOf[typingsSlinky.std.HTMLStyleElement]
  - js.Array[typingsSlinky.std.HTMLStyleElement]
  - typingsSlinky.std.NodeListOf[typingsSlinky.std.HTMLStyleElement]
*/
trait hydrateType extends js.Object

object hydrateType {
  @scala.inline
  implicit def apply(value: js.Array[HTMLStyleElement]): hydrateType = value.asInstanceOf[hydrateType]
  @scala.inline
  implicit def apply(value: HTMLCollectionOf[HTMLStyleElement]): hydrateType = value.asInstanceOf[hydrateType]
  @scala.inline
  implicit def apply(value: NodeListOf[HTMLStyleElement with Node]): hydrateType = value.asInstanceOf[hydrateType]
}

