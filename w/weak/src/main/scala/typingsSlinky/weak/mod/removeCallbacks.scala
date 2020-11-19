package typingsSlinky.weak.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weak", "removeCallbacks")
@js.native
object removeCallbacks extends js.Object {
  
  /**
    * Empties the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    */
  def apply(ref: WeakRef[_]): EventEmitter = js.native
}
