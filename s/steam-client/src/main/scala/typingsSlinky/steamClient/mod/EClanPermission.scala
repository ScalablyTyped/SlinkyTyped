package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClanPermission extends StObject
@JSImport("steam-client", "EClanPermission")
@js.native
object EClanPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanPermission with Double] = js.native
  
  // 11
  @js.native
  sealed trait AllMembers extends EClanPermission
  /* 1 | 2 | 8 | 4 */ val AllMembers: typingsSlinky.steamClient.mod.EClanPermission.AllMembers with Double = js.native
  
  // 143
  @js.native
  sealed trait Anybody extends EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val Anybody: typingsSlinky.steamClient.mod.EClanPermission.Anybody with Double = js.native
  
  @js.native
  sealed trait Member extends EClanPermission
  /* 4 */ val Member: typingsSlinky.steamClient.mod.EClanPermission.Member with Double = js.native
  
  @js.native
  sealed trait MemberAllowed extends EClanPermission
  /* 128 | 4 */ val MemberAllowed: typingsSlinky.steamClient.mod.EClanPermission.MemberAllowed with Double = js.native
  
  @js.native
  sealed trait Moderator extends EClanPermission
  /* 8 */ val Moderator: typingsSlinky.steamClient.mod.EClanPermission.Moderator with Double = js.native
  
  // 132
  @js.native
  sealed trait ModeratorAllowed extends EClanPermission
  /* 128 | 4 | 8 */ val ModeratorAllowed: typingsSlinky.steamClient.mod.EClanPermission.ModeratorAllowed with Double = js.native
  
  @js.native
  sealed trait Nobody extends EClanPermission
  /* 0 */ val Nobody: typingsSlinky.steamClient.mod.EClanPermission.Nobody with Double = js.native
  
  @js.native
  sealed trait NonMember extends EClanPermission
  /* 128 */ val NonMember: typingsSlinky.steamClient.mod.EClanPermission.NonMember with Double = js.native
  
  // 15
  @js.native
  sealed trait OGGGameOwner extends EClanPermission
  /* 16 */ val OGGGameOwner: typingsSlinky.steamClient.mod.EClanPermission.OGGGameOwner with Double = js.native
  
  @js.native
  sealed trait Officer extends EClanPermission
  /* 2 */ val Officer: typingsSlinky.steamClient.mod.EClanPermission.Officer with Double = js.native
  
  // 140
  @js.native
  sealed trait OfficerAllowed extends EClanPermission
  /* 128 | 4 | 8 | 2 */ val OfficerAllowed: typingsSlinky.steamClient.mod.EClanPermission.OfficerAllowed with Double = js.native
  
  @js.native
  sealed trait Owner extends EClanPermission
  /* 1 */ val Owner: typingsSlinky.steamClient.mod.EClanPermission.Owner with Double = js.native
  
  // 142
  @js.native
  sealed trait OwnerAllowed extends EClanPermission
  /* 128 | 4 | 8 | 2 | 1 */ val OwnerAllowed: typingsSlinky.steamClient.mod.EClanPermission.OwnerAllowed with Double = js.native
  
  @js.native
  sealed trait OwnerAndOfficer extends EClanPermission
  /* 3 */ val OwnerAndOfficer: typingsSlinky.steamClient.mod.EClanPermission.OwnerAndOfficer with Double = js.native
  
  @js.native
  sealed trait OwnerOfficerModerator extends EClanPermission
  /* 1 | 2 | 8 */ val OwnerOfficerModerator: typingsSlinky.steamClient.mod.EClanPermission.OwnerOfficerModerator with Double = js.native
}
