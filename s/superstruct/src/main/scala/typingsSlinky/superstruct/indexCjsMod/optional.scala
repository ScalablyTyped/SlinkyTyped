package typingsSlinky.superstruct.indexCjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "optional")
@js.native
object optional extends js.Object {
  
  /**
    * Augment a struct to make it optionally accept `undefined` values.
    */
  def apply[T](S: Struct_[T, _]): Struct_[js.UndefOr[T], _] = js.native
}
