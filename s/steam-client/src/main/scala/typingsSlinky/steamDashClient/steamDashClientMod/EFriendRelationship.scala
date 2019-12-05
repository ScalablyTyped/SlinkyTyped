package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFriendRelationship extends js.Object

@JSImport("steam-client", "EFriendRelationship")
@js.native
object EFriendRelationship extends js.Object {
  @js.native
  sealed trait Blocked extends EFriendRelationship
  
  @js.native
  sealed trait Friend extends EFriendRelationship
  
  @js.native
  sealed trait Ignored extends EFriendRelationship
  
  @js.native
  sealed trait IgnoredFriend extends EFriendRelationship
  
  @js.native
  sealed trait Max extends EFriendRelationship
  
  @js.native
  sealed trait None extends EFriendRelationship
  
  @js.native
  sealed trait RequestInitiator extends EFriendRelationship
  
  @js.native
  sealed trait RequestRecipient extends EFriendRelationship
  
  @js.native
  sealed trait SuggestedFriend extends EFriendRelationship
  
  /* 1 */ val Blocked: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.Blocked with Double = js.native
  /* 3 */ val Friend: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.Friend with Double = js.native
  /* 5 */ val Ignored: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.Ignored with Double = js.native
  /* 6 */ val IgnoredFriend: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.IgnoredFriend with Double = js.native
  /* 8 */ val Max: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.Max with Double = js.native
  /* 0 */ val None: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.None with Double = js.native
  /* 4 */ val RequestInitiator: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.RequestInitiator with Double = js.native
  /* 2 */ val RequestRecipient: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.RequestRecipient with Double = js.native
  /* 7 */ val SuggestedFriend: typingsSlinky.steamDashClient.steamDashClientMod.EFriendRelationship.SuggestedFriend with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship with Double] = js.native
}

