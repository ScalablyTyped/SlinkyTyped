package typingsSlinky.superstruct

import typingsSlinky.superstruct.structMod.Struct
import typingsSlinky.superstruct.structMod.StructContext
import typingsSlinky.superstruct.structMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/refinements", JSImport.Namespace)
@js.native
object refinementsMod extends js.Object {
  
  def empty[T /* <: String | js.Array[_] */](S: Struct[T, _]): Struct[T, _] = js.native
  
  def length[T /* <: String | js.Array[_] */](S: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  
  def pattern[T /* <: String */](S: Struct[T, _], regexp: js.RegExp): Struct[T, _] = js.native
  
  def refinement[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
}
