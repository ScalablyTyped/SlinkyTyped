package typingsSlinky.yargs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yargs.mod.RequiredOptionType[O]
  - js.UndefOr[scala.Nothing]
  - scala.Double
*/
trait InferredOptionType[O /* <: Options | PositionalOptions */] extends js.Object

object InferredOptionType {
  @scala.inline
  implicit def apply[O](value: Double): InferredOptionType[O] = value.asInstanceOf[InferredOptionType[O]]
  @scala.inline
  implicit def apply[O](value: RequiredOptionType[O]): InferredOptionType[O] = value.asInstanceOf[InferredOptionType[O]]
  @scala.inline
  implicit def fromUndef[O, T](value: js.UndefOr[T])(implicit ev: T => InferredOptionType[O]): InferredOptionType[O] = value.asInstanceOf[InferredOptionType[O]]
}

