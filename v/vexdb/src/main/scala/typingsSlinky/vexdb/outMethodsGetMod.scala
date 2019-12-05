package typingsSlinky.vexdb

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
import typingsSlinky.vexdb.vexdbStrings.matches
import typingsSlinky.vexdb.vexdbStrings.rankings
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import typingsSlinky.vexdb.vexdbStrings.skills
import typingsSlinky.vexdb.vexdbStrings.teams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/get", JSImport.Namespace)
@js.native
object outMethodsGetMod extends js.Object {
  def get(endpoint: String, params: RequestObject): js.Promise[js.Array[ResponseObject]] = js.native
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
  def size(endpoint: String, params: RequestObject): js.Promise[Double] = js.native
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
}

