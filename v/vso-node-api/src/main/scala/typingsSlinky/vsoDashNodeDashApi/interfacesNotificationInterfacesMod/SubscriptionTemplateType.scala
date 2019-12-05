package typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends js.Object {
  @js.native
  sealed trait Both extends SubscriptionTemplateType
  
  @js.native
  sealed trait None extends SubscriptionTemplateType
  
  @js.native
  sealed trait Team extends SubscriptionTemplateType
  
  @js.native
  sealed trait User extends SubscriptionTemplateType
  
  /* 2 */ val Both: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.Both with Double = js.native
  /* 3 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.None with Double = js.native
  /* 1 */ val Team: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.Team with Double = js.native
  /* 0 */ val User: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.User with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType with Double] = js.native
}

