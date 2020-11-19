package typingsSlinky.weakNapi.mod

import typingsSlinky.weakNapi.weakNapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weak-napi", "isNearDeath")
@js.native
object isNearDeath extends js.Object {
  
  /**
    * Checks to see if ref is "near death". This will be true exactly during the weak reference callback function, and false any other time.
    * @param ref weak reference object
    */
  def apply(ref: WeakRef[_]): `false` = js.native
}
