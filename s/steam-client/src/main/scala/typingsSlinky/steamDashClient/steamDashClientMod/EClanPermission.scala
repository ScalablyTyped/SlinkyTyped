package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanPermission extends js.Object

@JSImport("steam-client", "EClanPermission")
@js.native
object EClanPermission extends js.Object {
   // 15
  @js.native
  sealed trait AllMembers extends EClanPermission
  
   // 143
  @js.native
  sealed trait Anybody extends EClanPermission
  
  @js.native
  sealed trait Member extends EClanPermission
  
   // 132
  @js.native
  sealed trait MemberAllowed extends EClanPermission
  
  @js.native
  sealed trait Moderator extends EClanPermission
  
   // 140
  @js.native
  sealed trait ModeratorAllowed extends EClanPermission
  
  @js.native
  sealed trait Nobody extends EClanPermission
  
  @js.native
  sealed trait NonMember extends EClanPermission
  
  @js.native
  sealed trait OGGGameOwner extends EClanPermission
  
  @js.native
  sealed trait Officer extends EClanPermission
  
   // 142
  @js.native
  sealed trait OfficerAllowed extends EClanPermission
  
  @js.native
  sealed trait Owner extends EClanPermission
  
   // 143
  @js.native
  sealed trait OwnerAllowed extends EClanPermission
  
  @js.native
  sealed trait OwnerAndOfficer extends EClanPermission
  
   // 11
  @js.native
  sealed trait OwnerOfficerModerator extends EClanPermission
  
  /* 1 | 2 | 8 | 4 */ val AllMembers: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.AllMembers with Double = js.native
  /* 128 | 4 | 8 | 2 | 1 */ val Anybody: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Anybody with Double = js.native
  /* 4 */ val Member: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Member with Double = js.native
  /* 128 | 4 */ val MemberAllowed: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.MemberAllowed with Double = js.native
  /* 8 */ val Moderator: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Moderator with Double = js.native
  /* 128 | 4 | 8 */ val ModeratorAllowed: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.ModeratorAllowed with Double = js.native
  /* 0 */ val Nobody: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Nobody with Double = js.native
  /* 128 */ val NonMember: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.NonMember with Double = js.native
  /* 16 */ val OGGGameOwner: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.OGGGameOwner with Double = js.native
  /* 2 */ val Officer: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Officer with Double = js.native
  /* 128 | 4 | 8 | 2 */ val OfficerAllowed: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.OfficerAllowed with Double = js.native
  /* 1 */ val Owner: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.Owner with Double = js.native
  /* 128 | 4 | 8 | 2 | 1 */ val OwnerAllowed: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.OwnerAllowed with Double = js.native
  /* 3 */ val OwnerAndOfficer: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.OwnerAndOfficer with Double = js.native
  /* 1 | 2 | 8 */ val OwnerOfficerModerator: typingsSlinky.steamDashClient.steamDashClientMod.EClanPermission.OwnerOfficerModerator with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission with Double] = js.native
}

