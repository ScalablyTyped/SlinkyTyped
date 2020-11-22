package typingsSlinky.superstruct.indexEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.es", "pattern")
@js.native
object pattern extends js.Object {
  
  /**
    * Refine a string struct to match a specific regexp pattern.
    */
  def apply[T /* <: String */](S: Struct_[T, _], regexp: js.RegExp): Struct_[T, _] = js.native
}
