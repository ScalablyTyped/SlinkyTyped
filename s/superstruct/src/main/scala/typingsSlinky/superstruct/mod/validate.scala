package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "validate")
@js.native
object validate extends js.Object {
  
  def apply[T](value: js.Any, struct: Struct[T, _]): js.Tuple2[js.UndefOr[typingsSlinky.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
  def apply[T](value: js.Any, struct: Struct[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[typingsSlinky.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
}
