package typingsSlinky.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "tuple")
@js.native
object tuple extends js.Object {
  
  /**
    * Validate that a value is a tuple with entries of specific types.
    */
  def apply[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
}
