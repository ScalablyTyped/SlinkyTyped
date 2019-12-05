package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAuthSessionResponse extends js.Object

@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends js.Object {
  @js.native
  sealed trait AuthTicketCanceled extends EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalid extends EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed extends EAuthSessionResponse
  
  @js.native
  sealed trait LoggedInElseWhere extends EAuthSessionResponse
  
  @js.native
  sealed trait NoLicenseOrExpired extends EAuthSessionResponse
  
  @js.native
  sealed trait OK extends EAuthSessionResponse
  
  @js.native
  sealed trait PublisherIssuedBan extends EAuthSessionResponse
  
  @js.native
  sealed trait UserNotConnectedToSteam extends EAuthSessionResponse
  
  @js.native
  sealed trait VACBanned extends EAuthSessionResponse
  
  @js.native
  sealed trait VACCheckTimedOut extends EAuthSessionResponse
  
  /* 6 */ val AuthTicketCanceled: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.AuthTicketCanceled with Double = js.native
  /* 8 */ val AuthTicketInvalid: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.AuthTicketInvalid with Double = js.native
  /* 7 */ val AuthTicketInvalidAlreadyUsed: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.AuthTicketInvalidAlreadyUsed with Double = js.native
  /* 4 */ val LoggedInElseWhere: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.LoggedInElseWhere with Double = js.native
  /* 2 */ val NoLicenseOrExpired: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.NoLicenseOrExpired with Double = js.native
  /* 0 */ val OK: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.OK with Double = js.native
  /* 9 */ val PublisherIssuedBan: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.PublisherIssuedBan with Double = js.native
  /* 1 */ val UserNotConnectedToSteam: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.UserNotConnectedToSteam with Double = js.native
  /* 3 */ val VACBanned: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.VACBanned with Double = js.native
  /* 5 */ val VACCheckTimedOut: typingsSlinky.steamDashClient.steamDashClientMod.EAuthSessionResponse.VACCheckTimedOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse with Double] = js.native
}

