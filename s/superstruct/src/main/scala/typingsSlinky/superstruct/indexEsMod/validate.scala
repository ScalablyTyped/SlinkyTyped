package typingsSlinky.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "validate")
@js.native
object validate extends js.Object {
  
  /**
    * Validate a value against a `Struct`, returning an error if invalid.
    */
  def apply[T](value: js.Any, struct: Struct_[T, _]): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  def apply[T](value: js.Any, struct: Struct_[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
}
