package typingsSlinky.vexdb

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.EventsRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.MatchesRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.RankingsRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.RequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.outConstantsRequestObjectsMod.TeamsRequestObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.AwardsResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.EventsResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.MatchesResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.RankingsResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.ResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.SeasonRankingsResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.SkillsResponseObject
import typingsSlinky.vexdb.outConstantsResponseObjectsMod.TeamsResponseObject
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
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/live", JSImport.Namespace)
@js.native
object outMethodsLiveMod extends js.Object {
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
  
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("live")
  def live_awards(endpoint: awards, params: LiveRequestObject[AwardsRequestObject]): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: events, params: LiveRequestObject[EventsRequestObject]): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: matches, params: LiveRequestObject[MatchesRequestObject]): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: rankings, params: LiveRequestObject[RankingsRequestObject]): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObject[SeasonRankingsRequestObject]): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: skills, params: LiveRequestObject[SkillsRequestObject]): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: teams, params: LiveRequestObject[TeamsRequestObject]): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  type LiveRequestObject[T] = T with Anon_Prefetch
}

