package typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends js.Object {
  /**
    * Include the event type details like the fields and operators
    */
  @js.native
  sealed trait IncludeEventTypeInformation extends SubscriptionTemplateQueryFlags
  
  /**
    * Include group templates
    */
  @js.native
  sealed trait IncludeGroup extends SubscriptionTemplateQueryFlags
  
  /**
    * Include user templates
    */
  @js.native
  sealed trait IncludeUser extends SubscriptionTemplateQueryFlags
  
  /**
    * Include user and group templates
    */
  @js.native
  sealed trait IncludeUserAndGroup extends SubscriptionTemplateQueryFlags
  
  @js.native
  sealed trait None extends SubscriptionTemplateQueryFlags
  
  /* 22 */ val IncludeEventTypeInformation: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeEventTypeInformation with Double = js.native
  /* 2 */ val IncludeGroup: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeGroup with Double = js.native
  /* 1 */ val IncludeUser: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUser with Double = js.native
  /* 4 */ val IncludeUserAndGroup: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags.IncludeUserAndGroup with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateQueryFlags with Double] = js.native
}

