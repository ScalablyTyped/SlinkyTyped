package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomEnterResponse extends StObject
@JSImport("steam-client", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomEnterResponse with Double] = js.native
  
  @js.native
  sealed trait Banned extends EChatRoomEnterResponse
  /* 6 */ val Banned: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.Banned with Double = js.native
  
  @js.native
  sealed trait ClanDisabled extends EChatRoomEnterResponse
  /* 8 */ val ClanDisabled: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.ClanDisabled with Double = js.native
  
  @js.native
  sealed trait CommunityBan extends EChatRoomEnterResponse
  /* 9 */ val CommunityBan: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.CommunityBan with Double = js.native
  
  @js.native
  sealed trait DoesntExist extends EChatRoomEnterResponse
  /* 2 */ val DoesntExist: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.DoesntExist with Double = js.native
  
  @js.native
  sealed trait Error extends EChatRoomEnterResponse
  /* 5 */ val Error: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.Error with Double = js.native
  
  @js.native
  sealed trait Full extends EChatRoomEnterResponse
  /* 4 */ val Full: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.Full with Double = js.native
  
  @js.native
  sealed trait Limited extends EChatRoomEnterResponse
  /* 7 */ val Limited: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.Limited with Double = js.native
  
  @js.native
  sealed trait MemberBlockedYou extends EChatRoomEnterResponse
  /* 10 */ val MemberBlockedYou: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.MemberBlockedYou with Double = js.native
  
  // these appear to have been removed
  @js.native
  sealed trait NoRankingDataLobby extends EChatRoomEnterResponse
  /* 12 */ val NoRankingDataLobby: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.NoRankingDataLobby with Double = js.native
  
  // removed
  @js.native
  sealed trait NoRankingDataUser extends EChatRoomEnterResponse
  /* 13 */ val NoRankingDataUser: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.NoRankingDataUser with Double = js.native
  
  @js.native
  sealed trait NotAllowed extends EChatRoomEnterResponse
  /* 3 */ val NotAllowed: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.NotAllowed with Double = js.native
  
  // removed
  @js.native
  sealed trait RankOutOfRange extends EChatRoomEnterResponse
  /* 14 */ val RankOutOfRange: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.RankOutOfRange with Double = js.native
  
  @js.native
  sealed trait Success extends EChatRoomEnterResponse
  /* 1 */ val Success: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.Success with Double = js.native
  
  @js.native
  sealed trait YouBlockedMember extends EChatRoomEnterResponse
  /* 11 */ val YouBlockedMember: typingsSlinky.steamClient.mod.EChatRoomEnterResponse.YouBlockedMember with Double = js.native
}
