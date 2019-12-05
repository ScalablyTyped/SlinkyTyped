package typingsSlinky.sharepoint.SP.BusinessData

import typingsSlinky.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import typingsSlinky.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Infrastructure")
@js.native
object Infrastructure extends js.Object {
  @js.native
  class ExternalSubscriptionStore protected () extends ClientObject {
    def this(context: ClientRuntimeContext, web: Web) = this()
    def indexStore(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ExternalSubscriptionStore extends js.Object {
    def newObject(context: ClientRuntimeContext, web: Web): ExternalSubscriptionStore = js.native
  }
  
}

