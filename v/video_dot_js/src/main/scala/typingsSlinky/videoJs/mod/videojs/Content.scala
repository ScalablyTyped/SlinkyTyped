package typingsSlinky.videoJs.mod.videojs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Element
  - typingsSlinky.std.Node
  - js.Function0[java.lang.String | typingsSlinky.std.Element | typingsSlinky.std.Node]
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: Element): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: js.Function0[String | Element | Node]): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: Node): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: String): Content = value.asInstanceOf[Content]
}

