package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import typingsSlinky.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "refinement")
@js.native
object refinement extends js.Object {
  
  def apply[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
}
