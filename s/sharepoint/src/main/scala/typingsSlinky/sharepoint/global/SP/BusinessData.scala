package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BusinessData {
  
  @JSGlobal("SP.BusinessData.AppBdcCatalog")
  @js.native
  class AppBdcCatalog ()
    extends typingsSlinky.sharepoint.SP.BusinessData.AppBdcCatalog
  
  @JSGlobal("SP.BusinessData.Entity")
  @js.native
  class Entity ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Entity
  
  @JSGlobal("SP.BusinessData.EntityField")
  @js.native
  class EntityField ()
    extends typingsSlinky.sharepoint.SP.BusinessData.EntityField
  
  @JSGlobal("SP.BusinessData.EntityIdentifier")
  @js.native
  class EntityIdentifier ()
    extends typingsSlinky.sharepoint.SP.BusinessData.EntityIdentifier
  
  @JSGlobal("SP.BusinessData.EntityView")
  @js.native
  class EntityView ()
    extends typingsSlinky.sharepoint.SP.BusinessData.EntityView
  
  @JSGlobal("SP.BusinessData.Filter")
  @js.native
  class Filter ()
    extends typingsSlinky.sharepoint.SP.BusinessData.Filter
  
  object Infrastructure {
    
    @JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore")
    @js.native
    class ExternalSubscriptionStore protected ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore {
      def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
    }
    object ExternalSubscriptionStore {
      
      /* static member */
      @JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore.newObject")
      @js.native
      def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore = js.native
    }
  }
  
  @JSGlobal("SP.BusinessData.LobSystem")
  @js.native
  class LobSystem ()
    extends typingsSlinky.sharepoint.SP.BusinessData.LobSystem
  
  @JSGlobal("SP.BusinessData.LobSystemInstance")
  @js.native
  class LobSystemInstance ()
    extends typingsSlinky.sharepoint.SP.BusinessData.LobSystemInstance
  
  @JSGlobal("SP.BusinessData.MethodExecutionResult")
  @js.native
  class MethodExecutionResult ()
    extends typingsSlinky.sharepoint.SP.BusinessData.MethodExecutionResult
  
  object Runtime {
    
    @JSGlobal("SP.BusinessData.Runtime.EntityEventType")
    @js.native
    object EntityEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType with Double] = js.native
      
      /* 1 */ val itemAdded: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemAdded with Double = js.native
      
      /* 3 */ val itemDeleted: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemDeleted with Double = js.native
      
      /* 2 */ val itemUpdated: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemUpdated with Double = js.native
      
      /* 0 */ val none: typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityEventType.none with Double = js.native
    }
    
    @JSGlobal("SP.BusinessData.Runtime.EntityFieldValueDictionary")
    @js.native
    class EntityFieldValueDictionary ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
    
    @JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
    @js.native
    class EntityIdentity protected ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityIdentity {
      def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, identifierValues: js.Array[_]) = this()
    }
    object EntityIdentity {
      
      /* static member */
      @JSGlobal("SP.BusinessData.Runtime.EntityIdentity.newObject")
      @js.native
      def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, identifierValues: js.Array[_]): typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityIdentity = js.native
    }
    
    @JSGlobal("SP.BusinessData.Runtime.EntityInstance")
    @js.native
    class EntityInstance ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.EntityInstance
    
    @JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
    @js.native
    class NotificationCallback protected ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.NotificationCallback {
      def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, notificationEndpoint: String) = this()
    }
    object NotificationCallback {
      
      /* static member */
      @JSGlobal("SP.BusinessData.Runtime.NotificationCallback.newObject")
      @js.native
      def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, notificationEndpoint: String): typingsSlinky.sharepoint.SP.BusinessData.Runtime.NotificationCallback = js.native
    }
    
    @JSGlobal("SP.BusinessData.Runtime.Subscription")
    @js.native
    class Subscription protected ()
      extends typingsSlinky.sharepoint.SP.BusinessData.Runtime.Subscription {
      def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, id: js.Any, hash: String) = this()
    }
    object Subscription {
      
      /* static member */
      @JSGlobal("SP.BusinessData.Runtime.Subscription.newObject")
      @js.native
      def newObject(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, id: js.Any, hash: String): typingsSlinky.sharepoint.SP.BusinessData.Runtime.Subscription = js.native
    }
  }
  
  @JSGlobal("SP.BusinessData.TypeDescriptor")
  @js.native
  class TypeDescriptor ()
    extends typingsSlinky.sharepoint.SP.BusinessData.TypeDescriptor
}
