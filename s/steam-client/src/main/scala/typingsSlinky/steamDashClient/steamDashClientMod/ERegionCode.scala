package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERegionCode extends js.Object

@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends js.Object {
  @js.native
  sealed trait Africa extends ERegionCode
  
  @js.native
  sealed trait Asia extends ERegionCode
  
  @js.native
  sealed trait Australia extends ERegionCode
  
  @js.native
  sealed trait Europe extends ERegionCode
  
  @js.native
  sealed trait MiddleEast extends ERegionCode
  
  @js.native
  sealed trait SouthAmerica extends ERegionCode
  
  @js.native
  sealed trait USEast extends ERegionCode
  
  @js.native
  sealed trait USWest extends ERegionCode
  
  @js.native
  sealed trait World extends ERegionCode
  
  /* 0x07 */ val Africa: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.Africa with Double = js.native
  /* 0x04 */ val Asia: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.Asia with Double = js.native
  /* 0x05 */ val Australia: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.Australia with Double = js.native
  /* 0x03 */ val Europe: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.Europe with Double = js.native
  /* 0x06 */ val MiddleEast: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.MiddleEast with Double = js.native
  /* 0x02 */ val SouthAmerica: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.SouthAmerica with Double = js.native
  /* 0x00 */ val USEast: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.USEast with Double = js.native
  /* 0x01 */ val USWest: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.USWest with Double = js.native
  /* 0xFF */ val World: typingsSlinky.steamDashClient.steamDashClientMod.ERegionCode.World with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode with Double] = js.native
}

