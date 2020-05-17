package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgJs.mod.Number
  - scala.Double
  - java.lang.String
*/
trait NumberAlias extends js.Object

object NumberAlias {
  @scala.inline
  implicit def apply(value: Double): NumberAlias = value.asInstanceOf[NumberAlias]
  @scala.inline
  implicit def apply(value: Number): NumberAlias = value.asInstanceOf[NumberAlias]
  @scala.inline
  implicit def apply(value: String): NumberAlias = value.asInstanceOf[NumberAlias]
}

