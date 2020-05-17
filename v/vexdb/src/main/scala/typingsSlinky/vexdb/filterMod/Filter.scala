package typingsSlinky.vexdb.filterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - js.Array[scala.Double | java.lang.String]
  - typingsSlinky.vexdb.filterMod.FilterFunction
  - scala.Double
  - java.lang.String
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: Double): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: FilterFunction): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: js.RegExp): Filter = value.asInstanceOf[Filter]
  @scala.inline
  implicit def apply(value: String): Filter = value.asInstanceOf[Filter]
}

