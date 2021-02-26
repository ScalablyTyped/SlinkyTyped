package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardUploadScoreMethod extends StObject
@JSImport("steam-client", "ELeaderboardUploadScoreMethod")
@js.native
object ELeaderboardUploadScoreMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardUploadScoreMethod with Double] = js.native
  
  @js.native
  sealed trait ForceUpdate extends ELeaderboardUploadScoreMethod
  /* 2 */ val ForceUpdate: typingsSlinky.steamClient.mod.ELeaderboardUploadScoreMethod.ForceUpdate with Double = js.native
  
  @js.native
  sealed trait KeepBest extends ELeaderboardUploadScoreMethod
  /* 1 */ val KeepBest: typingsSlinky.steamClient.mod.ELeaderboardUploadScoreMethod.KeepBest with Double = js.native
  
  @js.native
  sealed trait None extends ELeaderboardUploadScoreMethod
  /* 0 */ val None: typingsSlinky.steamClient.mod.ELeaderboardUploadScoreMethod.None with Double = js.native
}
