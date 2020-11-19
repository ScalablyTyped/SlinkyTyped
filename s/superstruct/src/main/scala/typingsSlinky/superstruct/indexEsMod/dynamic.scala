package typingsSlinky.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "dynamic")
@js.native
object dynamic extends js.Object {
  
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  def apply[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct_[T, _]]): Struct_[T, _] = js.native
}
