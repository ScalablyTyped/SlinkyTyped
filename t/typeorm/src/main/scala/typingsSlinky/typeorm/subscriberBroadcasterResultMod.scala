package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/subscriber/BroadcasterResult", JSImport.Namespace)
@js.native
object subscriberBroadcasterResultMod extends js.Object {
  
  @js.native
  class BroadcasterResult () extends js.Object {
    
    /**
      * Number of executed listeners and subscribers.
      */
    var count: Double = js.native
    
    /**
      * Promises returned by listeners and subscribers which needs to be awaited.
      */
    var promises: js.Array[js.Promise[_]] = js.native
  }
}
