package typingsSlinky.vexdb

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.vexdb.anon.LiveRequestObjectAwardsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectEventsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectMatchesR
import typingsSlinky.vexdb.anon.LiveRequestObjectRankings
import typingsSlinky.vexdb.anon.LiveRequestObjectSeasonRa
import typingsSlinky.vexdb.anon.LiveRequestObjectSkillsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectTeamsReq
import typingsSlinky.vexdb.anon.Prefetch
import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.EventsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.MatchesRequestObject
import typingsSlinky.vexdb.requestObjectsMod.RankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.RequestObject
import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.TeamsRequestObject
import typingsSlinky.vexdb.responseObjectsMod.AwardsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.EventsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.MatchesResponseObject
import typingsSlinky.vexdb.responseObjectsMod.RankingsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import typingsSlinky.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.SkillsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.TeamsResponseObject
import typingsSlinky.vexdb.vexdbStrings.awards
import typingsSlinky.vexdb.vexdbStrings.events
import typingsSlinky.vexdb.vexdbStrings.fetch
import typingsSlinky.vexdb.vexdbStrings.item
import typingsSlinky.vexdb.vexdbStrings.matches
import typingsSlinky.vexdb.vexdbStrings.prefetch
import typingsSlinky.vexdb.vexdbStrings.rankings
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import typingsSlinky.vexdb.vexdbStrings.skills
import typingsSlinky.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/live", JSImport.Namespace)
@js.native
object liveMod extends js.Object {
  
  def default(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("default")
  def default_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("default")
  def default_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("default")
  def default_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("default")
  def default_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("default")
  def default_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("default")
  def default_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("default")
  def default_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  
  @js.native
  trait LiveEventEmitter[Q, R] extends EventEmitter {
    
    def close(): Unit = js.native
    
    def current(): js.Array[R] = js.native
    
    def fetch(): js.Promise[Boolean] = js.native
    
    @JSName("on")
    def on_fetch(event: fetch, callback: js.Function1[/* newItems */ js.Array[R], Unit]): this.type = js.native
    @JSName("on")
    def on_item(event: item, callback: js.Function1[/* item */ R, Unit]): this.type = js.native
    @JSName("on")
    def on_prefetch(event: prefetch, callback: js.Function1[/* results */ js.Array[R], Unit]): this.type = js.native
    
    def params(updateParameters: Q): Q = js.native
  }
  
  type LiveRequestObject[T] = T with Prefetch
}
