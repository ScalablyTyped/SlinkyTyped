package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CallHierarchyIncomingCall")
@js.native
class CallHierarchyIncomingCall protected () extends StObject {
  /**
    * Create a new call object.
    *
    * @param item The item making the call.
    * @param fromRanges The ranges at which the calls appear.
    */
  def this(item: CallHierarchyItem, fromRanges: js.Array[Range]) = this()
  
  /**
    * The item that makes the call.
    */
  var from: CallHierarchyItem = js.native
  
  /**
    * The range at which at which the calls appears. This is relative to the caller
    * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
    */
  var fromRanges: js.Array[Range] = js.native
}
