package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomEnterResponse extends js.Object

@JSImport("steam-client", "EChatRoomEnterResponse")
@js.native
object EChatRoomEnterResponse extends js.Object {
  @js.native
  sealed trait Banned extends EChatRoomEnterResponse
  
  @js.native
  sealed trait ClanDisabled extends EChatRoomEnterResponse
  
  @js.native
  sealed trait CommunityBan extends EChatRoomEnterResponse
  
  @js.native
  sealed trait DoesntExist extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Error extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Full extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Limited extends EChatRoomEnterResponse
  
  @js.native
  sealed trait MemberBlockedYou extends EChatRoomEnterResponse
  
  // these appear to have been removed
   // removed
  @js.native
  sealed trait NoRankingDataLobby extends EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait NoRankingDataUser extends EChatRoomEnterResponse
  
  @js.native
  sealed trait NotAllowed extends EChatRoomEnterResponse
  
   // removed
  @js.native
  sealed trait RankOutOfRange extends EChatRoomEnterResponse
  
  @js.native
  sealed trait Success extends EChatRoomEnterResponse
  
  @js.native
  sealed trait YouBlockedMember extends EChatRoomEnterResponse
  
  /* 6 */ val Banned: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.Banned with Double = js.native
  /* 8 */ val ClanDisabled: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.ClanDisabled with Double = js.native
  /* 9 */ val CommunityBan: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.CommunityBan with Double = js.native
  /* 2 */ val DoesntExist: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.DoesntExist with Double = js.native
  /* 5 */ val Error: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.Error with Double = js.native
  /* 4 */ val Full: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.Full with Double = js.native
  /* 7 */ val Limited: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.Limited with Double = js.native
  /* 10 */ val MemberBlockedYou: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.MemberBlockedYou with Double = js.native
  /* 12 */ val NoRankingDataLobby: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.NoRankingDataLobby with Double = js.native
  /* 13 */ val NoRankingDataUser: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.NoRankingDataUser with Double = js.native
  /* 3 */ val NotAllowed: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.NotAllowed with Double = js.native
  /* 14 */ val RankOutOfRange: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.RankOutOfRange with Double = js.native
  /* 1 */ val Success: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.Success with Double = js.native
  /* 11 */ val YouBlockedMember: typingsSlinky.steamDashClient.steamDashClientMod.EChatRoomEnterResponse.YouBlockedMember with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomEnterResponse with Double] = js.native
}

