package typingsSlinky.sharepoint.global.Microsoft

import typingsSlinky.sharepoint.SP.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Office")
@js.native
object Office extends js.Object {
  
  @js.native
  object Server extends js.Object {
    
    @js.native
    object ReputationModel extends js.Object {
      
      @js.native
      class Reputation ()
        extends typingsSlinky.sharepoint.Microsoft.Office.Server.ReputationModel.Reputation
      /* static members */
      @js.native
      object Reputation extends js.Object {
        
        def setLike(context: ClientContext, listId: String, itemId: Double, like: Boolean): Unit = js.native
        
        def setRating(context: ClientContext, listId: String, itemId: Double, rating: Double): Unit = js.native
      }
    }
  }
}
