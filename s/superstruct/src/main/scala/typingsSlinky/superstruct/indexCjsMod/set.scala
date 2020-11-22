package typingsSlinky.superstruct.indexCjsMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "set")
@js.native
object set extends js.Object {
  
  /**
    * Validate that a set of values matches a specific type.
    */
  def apply[T](Element: Struct_[T, _]): Struct_[Set[T], _] = js.native
}
