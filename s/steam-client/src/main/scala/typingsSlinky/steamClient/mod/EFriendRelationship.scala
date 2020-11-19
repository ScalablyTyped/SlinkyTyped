package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EFriendRelationship extends js.Object
@JSImport("steam-client", "EFriendRelationship")
@js.native
object EFriendRelationship extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFriendRelationship with Double] = js.native
  
  @js.native
  sealed trait Blocked extends EFriendRelationship
  /* 1 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  @js.native
  sealed trait Friend extends EFriendRelationship
  /* 3 */ @js.native
  object Friend extends TopLevel[Friend with Double]
  
  @js.native
  sealed trait Ignored extends EFriendRelationship
  /* 5 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  @js.native
  sealed trait IgnoredFriend extends EFriendRelationship
  /* 6 */ @js.native
  object IgnoredFriend extends TopLevel[IgnoredFriend with Double]
  
  @js.native
  sealed trait Max extends EFriendRelationship
  /* 8 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait None extends EFriendRelationship
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait RequestInitiator extends EFriendRelationship
  /* 4 */ @js.native
  object RequestInitiator extends TopLevel[RequestInitiator with Double]
  
  @js.native
  sealed trait RequestRecipient extends EFriendRelationship
  /* 2 */ @js.native
  object RequestRecipient extends TopLevel[RequestRecipient with Double]
  
  @js.native
  sealed trait SuggestedFriend extends EFriendRelationship
  /* 7 */ @js.native
  object SuggestedFriend extends TopLevel[SuggestedFriend with Double]
}
