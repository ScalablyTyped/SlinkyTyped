package typingsSlinky.vexdb

import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.EventsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.MatchesRequestObject
import typingsSlinky.vexdb.requestObjectsMod.RankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.TeamsRequestObject
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

@JSImport("vexdb/out/methods/size", JSImport.Namespace)
@js.native
object sizeMod extends js.Object {
  
  @JSName("default")
  def default_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_events(endpoint: events, params: EventsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
  @JSName("default")
  def default_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[Double] = js.native
}
