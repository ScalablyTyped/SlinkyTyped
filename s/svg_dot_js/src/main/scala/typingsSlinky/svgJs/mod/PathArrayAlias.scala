package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgJs.mod.PathArray
  - js.Array[scala.Double | typingsSlinky.svgJs.mod.PathArrayPoint | java.lang.String]
  - java.lang.String
*/
trait PathArrayAlias extends js.Object

object PathArrayAlias {
  @scala.inline
  implicit def apply(value: js.Array[Double | PathArrayPoint | String]): PathArrayAlias = value.asInstanceOf[PathArrayAlias]
  @scala.inline
  implicit def apply(value: PathArray): PathArrayAlias = value.asInstanceOf[PathArrayAlias]
  @scala.inline
  implicit def apply(value: String): PathArrayAlias = value.asInstanceOf[PathArrayAlias]
}

