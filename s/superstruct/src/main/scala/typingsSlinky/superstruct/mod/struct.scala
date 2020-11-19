package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import typingsSlinky.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "struct")
@js.native
object struct extends js.Object {
  
  def apply[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = js.native
}
