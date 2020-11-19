package typingsSlinky.sharepoint.global.SP.BusinessData

import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BusinessData.Infrastructure")
@js.native
object Infrastructure extends js.Object {
  
  @js.native
  class ExternalSubscriptionStore protected ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore {
    def this(context: ClientRuntimeContext, web: Web) = this()
  }
  /* static members */
  @js.native
  object ExternalSubscriptionStore extends js.Object {
    
    def newObject(context: ClientRuntimeContext, web: Web): typingsSlinky.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore = js.native
  }
}
