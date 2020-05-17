package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait IdType extends js.Object

object IdType {
  @scala.inline
  implicit def apply(value: Double): IdType = value.asInstanceOf[IdType]
  @scala.inline
  implicit def apply(value: String): IdType = value.asInstanceOf[IdType]
}

