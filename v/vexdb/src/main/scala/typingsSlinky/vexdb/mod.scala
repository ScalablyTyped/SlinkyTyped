package typingsSlinky.vexdb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vexdb.anon.Awards
import typingsSlinky.vexdb.anon.LiveRequestObjectAwardsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectEventsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectMatchesR
import typingsSlinky.vexdb.anon.LiveRequestObjectRankings
import typingsSlinky.vexdb.anon.LiveRequestObjectSeasonRa
import typingsSlinky.vexdb.anon.LiveRequestObjectSkillsRe
import typingsSlinky.vexdb.anon.LiveRequestObjectTeamsReq
import typingsSlinky.vexdb.cacheMod.APIResponse
import typingsSlinky.vexdb.liveMod.LiveEventEmitter
import typingsSlinky.vexdb.liveMod.LiveRequestObject
import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.Endpoint
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
import typingsSlinky.vexdb.vexdbStrings.matches
import typingsSlinky.vexdb.vexdbStrings.rankings
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import typingsSlinky.vexdb.vexdbStrings.skills
import typingsSlinky.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("get")
  def get_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSName("get")
  def get_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSName("get")
  def get_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSName("get")
  def get_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSName("get")
  def get_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSName("get")
  def get_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSName("get")
  def get_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
  
  def live(endpoint: String, params: LiveRequestObject[RequestObject]): LiveEventEmitter[RequestObject, ResponseObject] = js.native
  @JSName("live")
  def live_awards(endpoint: awards, params: LiveRequestObjectAwardsRe): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
  @JSName("live")
  def live_events(endpoint: events, params: LiveRequestObjectEventsRe): LiveEventEmitter[EventsRequestObject, EventsResponseObject] = js.native
  @JSName("live")
  def live_matches(endpoint: matches, params: LiveRequestObjectMatchesR): LiveEventEmitter[MatchesRequestObject, MatchesResponseObject] = js.native
  @JSName("live")
  def live_rankings(endpoint: rankings, params: LiveRequestObjectRankings): LiveEventEmitter[RankingsRequestObject, RankingsResponseObject] = js.native
  @JSName("live")
  def live_seasonrankings(endpoint: season_rankings, params: LiveRequestObjectSeasonRa): LiveEventEmitter[SeasonRankingsRequestObject, SeasonRankingsResponseObject] = js.native
  @JSName("live")
  def live_skills(endpoint: skills, params: LiveRequestObjectSkillsRe): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
  @JSName("live")
  def live_teams(endpoint: teams, params: LiveRequestObjectTeamsReq): LiveEventEmitter[TeamsRequestObject, TeamsResponseObject] = js.native
  
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = js.native
  
  @JSName("size")
  def size_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSName("size")
  def size_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
  
  @js.native
  object cache extends js.Object {
    
    @JSName("resolve")
    def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = js.native
    @JSName("resolve")
    def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = js.native
    @JSName("resolve")
    def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = js.native
    @JSName("resolve")
    def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = js.native
    @JSName("resolve")
    def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = js.native
    @JSName("resolve")
    def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = js.native
    @JSName("resolve")
    def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = js.native
    
    @JSName("store")
    def store_awards(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_events(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_matches(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_rankings(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_seasonrankings(
      endpoint: season_rankings,
      params: SeasonRankingsRequestObject,
      data: APIResponse[SeasonRankingsResponseObject]
    ): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_skills(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = js.native
    @JSName("store")
    def store_teams(endpoint: teams, params: TeamsRequestObject, data: APIResponse[TeamsResponseObject]): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object constant extends js.Object {
    
    var SkillsType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof req.SkillsType */ js.Any = js.native
    
    var endpoints: js.Array[Endpoint] = js.native
    
    def header(headers: StringDictionary[String]): Unit = js.native
    
    var isBrowser: js.Function = js.native
    
    def param(params: RequestObject): Unit = js.native
    
    var passableParams: Awards = js.native
    
    var settings: typingsSlinky.vexdb.settingsMod.settings = js.native
  }
}
