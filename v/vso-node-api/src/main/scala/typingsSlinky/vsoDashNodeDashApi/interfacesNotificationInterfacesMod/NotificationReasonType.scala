package typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationReasonType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends js.Object {
  @js.native
  sealed trait AliasMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait DirectMember extends NotificationReasonType
  
  @js.native
  sealed trait DirectMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait Follows extends NotificationReasonType
  
  @js.native
  sealed trait GroupAlias extends NotificationReasonType
  
  @js.native
  sealed trait InDirectMemberGroupRole extends NotificationReasonType
  
  @js.native
  sealed trait IndirectMember extends NotificationReasonType
  
  @js.native
  sealed trait Personal extends NotificationReasonType
  
  @js.native
  sealed trait PersonalAlias extends NotificationReasonType
  
  @js.native
  sealed trait SingleRole extends NotificationReasonType
  
  @js.native
  sealed trait SubscriptionAlias extends NotificationReasonType
  
  @js.native
  sealed trait Unknown extends NotificationReasonType
  
  /* 11 */ val AliasMemberGroupRole: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.AliasMemberGroupRole with Double = js.native
  /* 4 */ val DirectMember: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.DirectMember with Double = js.native
  /* 9 */ val DirectMemberGroupRole: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.DirectMemberGroupRole with Double = js.native
  /* 1 */ val Follows: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.Follows with Double = js.native
  /* 6 */ val GroupAlias: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.GroupAlias with Double = js.native
  /* 10 */ val InDirectMemberGroupRole: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.InDirectMemberGroupRole with Double = js.native
  /* 5 */ val IndirectMember: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.IndirectMember with Double = js.native
  /* 2 */ val Personal: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.Personal with Double = js.native
  /* 3 */ val PersonalAlias: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.PersonalAlias with Double = js.native
  /* 8 */ val SingleRole: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.SingleRole with Double = js.native
  /* 7 */ val SubscriptionAlias: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.SubscriptionAlias with Double = js.native
  /* 0 */ val Unknown: typingsSlinky.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.NotificationReasonType.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType with Double] = js.native
}

