package typingsSlinky.sharepoint.global.SP.BusinessData

import typingsSlinky.sharepoint.SP.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BusinessData.Runtime")
@js.native
object Runtime extends js.Object {
  
  @js.native
  object EntityEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType with Double] = js.native
    
    /* 1 */ val itemAdded: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemAdded with Double = js.native
    
    /* 3 */ val itemDeleted: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemDeleted with Double = js.native
    
    /* 2 */ val itemUpdated: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemUpdated with Double = js.native
    
    /* 0 */ val none: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.none with Double = js.native
  }
  
  @js.native
  class EntityFieldValueDictionary ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
  
  @js.native
  class EntityIdentity protected ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityIdentity {
    def this(context: ClientRuntimeContext, identifierValues: js.Array[_]) = this()
  }
  /* static members */
  @js.native
  object EntityIdentity extends js.Object {
    
    def newObject(context: ClientRuntimeContext, identifierValues: js.Array[_]): typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityIdentity = js.native
  }
  
  @js.native
  class EntityInstance ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityInstance
  
  @js.native
  class NotificationCallback protected ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.NotificationCallback {
    def this(context: ClientRuntimeContext, notificationEndpoint: String) = this()
  }
  /* static members */
  @js.native
  object NotificationCallback extends js.Object {
    
    def newObject(context: ClientRuntimeContext, notificationEndpoint: String): typingsSlinky.sharepoint.SP.BusinessData.Runtime.NotificationCallback = js.native
  }
  
  @js.native
  class Subscription protected ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.Subscription {
    def this(context: ClientRuntimeContext, id: js.Any, hash: String) = this()
  }
  /* static members */
  @js.native
  object Subscription extends js.Object {
    
    def newObject(context: ClientRuntimeContext, id: js.Any, hash: String): typingsSlinky.sharepoint.SP.BusinessData.Runtime.Subscription = js.native
  }
}
