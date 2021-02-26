package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAuthSessionResponse extends StObject
@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse with Double] = js.native
  
  @js.native
  sealed trait AuthTicketCanceled extends EAuthSessionResponse
  /* 6 */ val AuthTicketCanceled: typingsSlinky.steamClient.mod.EAuthSessionResponse.AuthTicketCanceled with Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalid extends EAuthSessionResponse
  /* 8 */ val AuthTicketInvalid: typingsSlinky.steamClient.mod.EAuthSessionResponse.AuthTicketInvalid with Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed extends EAuthSessionResponse
  /* 7 */ val AuthTicketInvalidAlreadyUsed: typingsSlinky.steamClient.mod.EAuthSessionResponse.AuthTicketInvalidAlreadyUsed with Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere extends EAuthSessionResponse
  /* 4 */ val LoggedInElseWhere: typingsSlinky.steamClient.mod.EAuthSessionResponse.LoggedInElseWhere with Double = js.native
  
  @js.native
  sealed trait NoLicenseOrExpired extends EAuthSessionResponse
  /* 2 */ val NoLicenseOrExpired: typingsSlinky.steamClient.mod.EAuthSessionResponse.NoLicenseOrExpired with Double = js.native
  
  @js.native
  sealed trait OK extends EAuthSessionResponse
  /* 0 */ val OK: typingsSlinky.steamClient.mod.EAuthSessionResponse.OK with Double = js.native
  
  @js.native
  sealed trait PublisherIssuedBan extends EAuthSessionResponse
  /* 9 */ val PublisherIssuedBan: typingsSlinky.steamClient.mod.EAuthSessionResponse.PublisherIssuedBan with Double = js.native
  
  @js.native
  sealed trait UserNotConnectedToSteam extends EAuthSessionResponse
  /* 1 */ val UserNotConnectedToSteam: typingsSlinky.steamClient.mod.EAuthSessionResponse.UserNotConnectedToSteam with Double = js.native
  
  @js.native
  sealed trait VACBanned extends EAuthSessionResponse
  /* 3 */ val VACBanned: typingsSlinky.steamClient.mod.EAuthSessionResponse.VACBanned with Double = js.native
  
  @js.native
  sealed trait VACCheckTimedOut extends EAuthSessionResponse
  /* 5 */ val VACCheckTimedOut: typingsSlinky.steamClient.mod.EAuthSessionResponse.VACCheckTimedOut with Double = js.native
}
