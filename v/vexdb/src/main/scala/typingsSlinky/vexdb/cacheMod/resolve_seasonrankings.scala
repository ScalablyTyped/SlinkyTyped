package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_seasonrankings extends js.Object {
  
  def apply(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = js.native
}
