package typingsSlinky.yargs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Any
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Array[scala.Double | java.lang.String]
*/
trait RequiredOptionType[O /* <: Options | PositionalOptions */] extends InferredOptionType[O]

object RequiredOptionType {
  @scala.inline
  implicit def apply[O](value: js.Any): RequiredOptionType[O] = value.asInstanceOf[RequiredOptionType[O]]
  @scala.inline
  implicit def apply[O](value: js.Array[Double | String]): RequiredOptionType[O] = value.asInstanceOf[RequiredOptionType[O]]
  @scala.inline
  implicit def apply[O](value: Boolean): RequiredOptionType[O] = value.asInstanceOf[RequiredOptionType[O]]
  @scala.inline
  implicit def apply[O](value: Double): RequiredOptionType[O] = value.asInstanceOf[RequiredOptionType[O]]
  @scala.inline
  implicit def apply[O](value: String): RequiredOptionType[O] = value.asInstanceOf[RequiredOptionType[O]]
}

