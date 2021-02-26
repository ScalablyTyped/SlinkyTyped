package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationSubscriberDeliveryPreference extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationSubscriberDeliveryPreference")
@js.native
object NotificationSubscriberDeliveryPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSubscriberDeliveryPreference with Double] = js.native
  
  @js.native
  sealed trait EachMember extends NotificationSubscriberDeliveryPreference
  /* 2 */ val EachMember: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberDeliveryPreference.EachMember with Double = js.native
  
  @js.native
  sealed trait NoDelivery extends NotificationSubscriberDeliveryPreference
  /* -1 */ val NoDelivery: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberDeliveryPreference.NoDelivery with Double = js.native
  
  @js.native
  sealed trait None extends NotificationSubscriberDeliveryPreference
  /* 0 */ val None: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberDeliveryPreference.None with Double = js.native
  
  @js.native
  sealed trait NotSet extends NotificationSubscriberDeliveryPreference
  /* -2147483648 */ val NotSet: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberDeliveryPreference.NotSet with Double = js.native
  
  /**
    * Deliver notifications to the subscriber's preferred email address.
    */
  @js.native
  sealed trait PreferredEmailAddress extends NotificationSubscriberDeliveryPreference
  /* 1 */ val PreferredEmailAddress: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberDeliveryPreference.PreferredEmailAddress with Double = js.native
}
