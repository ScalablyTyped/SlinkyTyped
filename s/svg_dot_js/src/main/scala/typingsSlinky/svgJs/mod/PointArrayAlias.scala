package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.svgJs.mod.ArrayPoint | scala.Double]
  - typingsSlinky.svgJs.mod.PointArray
  - java.lang.String
*/
trait PointArrayAlias extends js.Object

object PointArrayAlias {
  @scala.inline
  implicit def apply(value: js.Array[ArrayPoint | Double]): PointArrayAlias = value.asInstanceOf[PointArrayAlias]
  @scala.inline
  implicit def apply(value: PointArray): PointArrayAlias = value.asInstanceOf[PointArrayAlias]
  @scala.inline
  implicit def apply(value: String): PointArrayAlias = value.asInstanceOf[PointArrayAlias]
}

