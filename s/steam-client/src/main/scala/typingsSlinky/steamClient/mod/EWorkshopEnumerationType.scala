package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EWorkshopEnumerationType extends StObject
@JSImport("steam-client", "EWorkshopEnumerationType")
@js.native
object EWorkshopEnumerationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EWorkshopEnumerationType with Double] = js.native
  
  @js.native
  sealed trait ContentByFriends extends EWorkshopEnumerationType
  /* 5 */ val ContentByFriends: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.ContentByFriends with Double = js.native
  
  @js.native
  sealed trait FavoriteOfFriends extends EWorkshopEnumerationType
  /* 3 */ val FavoriteOfFriends: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.FavoriteOfFriends with Double = js.native
  
  @js.native
  sealed trait RankedByVote extends EWorkshopEnumerationType
  /* 0 */ val RankedByVote: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.RankedByVote with Double = js.native
  
  @js.native
  sealed trait Recent extends EWorkshopEnumerationType
  /* 1 */ val Recent: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.Recent with Double = js.native
  
  @js.native
  sealed trait RecentFromFollowedUsers extends EWorkshopEnumerationType
  /* 6 */ val RecentFromFollowedUsers: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.RecentFromFollowedUsers with Double = js.native
  
  @js.native
  sealed trait Trending extends EWorkshopEnumerationType
  /* 2 */ val Trending: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.Trending with Double = js.native
  
  @js.native
  sealed trait VotedByFriends extends EWorkshopEnumerationType
  /* 4 */ val VotedByFriends: typingsSlinky.steamClient.mod.EWorkshopEnumerationType.VotedByFriends with Double = js.native
}
