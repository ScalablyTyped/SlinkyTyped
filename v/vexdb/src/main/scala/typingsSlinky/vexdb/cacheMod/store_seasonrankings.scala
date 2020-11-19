package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_seasonrankings extends js.Object {
  
  def apply(
    endpoint: season_rankings,
    params: SeasonRankingsRequestObject,
    data: APIResponse[SeasonRankingsResponseObject]
  ): js.Promise[Boolean] = js.native
}
