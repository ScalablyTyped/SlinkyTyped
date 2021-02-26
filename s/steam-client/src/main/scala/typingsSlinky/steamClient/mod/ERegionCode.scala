package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERegionCode extends StObject
@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode with Double] = js.native
  
  @js.native
  sealed trait Africa extends ERegionCode
  /* 0x07 */ val Africa: typingsSlinky.steamClient.mod.ERegionCode.Africa with Double = js.native
  
  @js.native
  sealed trait Asia extends ERegionCode
  /* 0x04 */ val Asia: typingsSlinky.steamClient.mod.ERegionCode.Asia with Double = js.native
  
  @js.native
  sealed trait Australia extends ERegionCode
  /* 0x05 */ val Australia: typingsSlinky.steamClient.mod.ERegionCode.Australia with Double = js.native
  
  @js.native
  sealed trait Europe extends ERegionCode
  /* 0x03 */ val Europe: typingsSlinky.steamClient.mod.ERegionCode.Europe with Double = js.native
  
  @js.native
  sealed trait MiddleEast extends ERegionCode
  /* 0x06 */ val MiddleEast: typingsSlinky.steamClient.mod.ERegionCode.MiddleEast with Double = js.native
  
  @js.native
  sealed trait SouthAmerica extends ERegionCode
  /* 0x02 */ val SouthAmerica: typingsSlinky.steamClient.mod.ERegionCode.SouthAmerica with Double = js.native
  
  @js.native
  sealed trait USEast extends ERegionCode
  /* 0x00 */ val USEast: typingsSlinky.steamClient.mod.ERegionCode.USEast with Double = js.native
  
  @js.native
  sealed trait USWest extends ERegionCode
  /* 0x01 */ val USWest: typingsSlinky.steamClient.mod.ERegionCode.USWest with Double = js.native
  
  @js.native
  sealed trait World extends ERegionCode
  /* 0xFF */ val World: typingsSlinky.steamClient.mod.ERegionCode.World with Double = js.native
}
