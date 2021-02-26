package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationReasonType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType with Double] = js.native
  
  @js.native
  sealed trait AliasMemberGroupRole extends NotificationReasonType
  /* 11 */ val AliasMemberGroupRole: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.AliasMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait DirectMember extends NotificationReasonType
  /* 4 */ val DirectMember: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.DirectMember with Double = js.native
  
  @js.native
  sealed trait DirectMemberGroupRole extends NotificationReasonType
  /* 9 */ val DirectMemberGroupRole: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.DirectMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait Follows extends NotificationReasonType
  /* 1 */ val Follows: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Follows with Double = js.native
  
  @js.native
  sealed trait GroupAlias extends NotificationReasonType
  /* 6 */ val GroupAlias: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.GroupAlias with Double = js.native
  
  @js.native
  sealed trait InDirectMemberGroupRole extends NotificationReasonType
  /* 10 */ val InDirectMemberGroupRole: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.InDirectMemberGroupRole with Double = js.native
  
  @js.native
  sealed trait IndirectMember extends NotificationReasonType
  /* 5 */ val IndirectMember: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.IndirectMember with Double = js.native
  
  @js.native
  sealed trait Personal extends NotificationReasonType
  /* 2 */ val Personal: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Personal with Double = js.native
  
  @js.native
  sealed trait PersonalAlias extends NotificationReasonType
  /* 3 */ val PersonalAlias: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.PersonalAlias with Double = js.native
  
  @js.native
  sealed trait SingleRole extends NotificationReasonType
  /* 8 */ val SingleRole: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.SingleRole with Double = js.native
  
  @js.native
  sealed trait SubscriptionAlias extends NotificationReasonType
  /* 7 */ val SubscriptionAlias: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.SubscriptionAlias with Double = js.native
  
  @js.native
  sealed trait Unknown extends NotificationReasonType
  /* 0 */ val Unknown: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationReasonType.Unknown with Double = js.native
}
