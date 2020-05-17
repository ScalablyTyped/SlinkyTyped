package typingsSlinky.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.svgJs.mod.MatrixLike
  - js.Array[scala.Double]
  - typingsSlinky.svgJs.mod.Element
  - java.lang.String
*/
trait MatrixAlias extends js.Object

object MatrixAlias {
  @scala.inline
  implicit def apply(value: js.Array[Double]): MatrixAlias = value.asInstanceOf[MatrixAlias]
  @scala.inline
  implicit def apply(value: Element): MatrixAlias = value.asInstanceOf[MatrixAlias]
  @scala.inline
  implicit def apply(value: MatrixLike): MatrixAlias = value.asInstanceOf[MatrixAlias]
  @scala.inline
  implicit def apply(value: String): MatrixAlias = value.asInstanceOf[MatrixAlias]
}

