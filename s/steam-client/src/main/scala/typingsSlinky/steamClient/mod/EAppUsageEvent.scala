package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppUsageEvent extends StObject
@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent with Double] = js.native
  
  @js.native
  sealed trait GameLaunch extends EAppUsageEvent
  /* 1 */ val GameLaunch: typingsSlinky.steamClient.mod.EAppUsageEvent.GameLaunch with Double = js.native
  
  @js.native
  sealed trait GameLaunchFreeWeekend extends EAppUsageEvent
  /* 8 */ val GameLaunchFreeWeekend: typingsSlinky.steamClient.mod.EAppUsageEvent.GameLaunchFreeWeekend with Double = js.native
  
  @js.native
  sealed trait GameLaunchTrial extends EAppUsageEvent
  /* 2 */ val GameLaunchTrial: typingsSlinky.steamClient.mod.EAppUsageEvent.GameLaunchTrial with Double = js.native
  
  @js.native
  sealed trait InGameAdViewed extends EAppUsageEvent
  /* 7 */ val InGameAdViewed: typingsSlinky.steamClient.mod.EAppUsageEvent.InGameAdViewed with Double = js.native
  
  @js.native
  sealed trait MarketingMessageView extends EAppUsageEvent
  /* 6 */ val MarketingMessageView: typingsSlinky.steamClient.mod.EAppUsageEvent.MarketingMessageView with Double = js.native
  
  @js.native
  sealed trait Media extends EAppUsageEvent
  /* 3 */ val Media: typingsSlinky.steamClient.mod.EAppUsageEvent.Media with Double = js.native
  
  @js.native
  sealed trait PreloadFinish extends EAppUsageEvent
  /* 5 */ val PreloadFinish: typingsSlinky.steamClient.mod.EAppUsageEvent.PreloadFinish with Double = js.native
  
  @js.native
  sealed trait PreloadStart extends EAppUsageEvent
  /* 4 */ val PreloadStart: typingsSlinky.steamClient.mod.EAppUsageEvent.PreloadStart with Double = js.native
}
