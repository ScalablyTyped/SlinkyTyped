package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// array.js
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgJs.mod.Array
  - js.Array[scala.Double]
  - java.lang.String
*/
trait ArrayAlias extends js.Object

object ArrayAlias {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ArrayAlias = value.asInstanceOf[ArrayAlias]
  @scala.inline
  implicit def apply(value: Array): ArrayAlias = value.asInstanceOf[ArrayAlias]
  @scala.inline
  implicit def apply(value: String): ArrayAlias = value.asInstanceOf[ArrayAlias]
}

