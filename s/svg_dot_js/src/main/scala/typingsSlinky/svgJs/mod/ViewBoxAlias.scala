package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// viewbox.js
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgJs.mod.ViewBoxLike
  - js.Array[scala.Double]
  - java.lang.String
  - typingsSlinky.svgJs.mod.Element
*/
trait ViewBoxAlias extends js.Object

object ViewBoxAlias {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ViewBoxAlias = value.asInstanceOf[ViewBoxAlias]
  @scala.inline
  implicit def apply(value: Element): ViewBoxAlias = value.asInstanceOf[ViewBoxAlias]
  @scala.inline
  implicit def apply(value: String): ViewBoxAlias = value.asInstanceOf[ViewBoxAlias]
  @scala.inline
  implicit def apply(value: ViewBoxLike): ViewBoxAlias = value.asInstanceOf[ViewBoxAlias]
}

