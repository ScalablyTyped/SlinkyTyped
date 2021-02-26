package typingsSlinky.vexdb

import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.EventsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.MatchesRequestObject
import typingsSlinky.vexdb.requestObjectsMod.RankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.TeamsRequestObject
import typingsSlinky.vexdb.responseObjectsMod.AwardsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.EventsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.MatchesResponseObject
import typingsSlinky.vexdb.responseObjectsMod.RankingsResponseObject
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_events(endpoint: events, params: EventsRequestObject): js.Promise[js.Array[EventsResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[js.Array[MatchesResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[js.Array[RankingsResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[js.Array[SeasonRankingsResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
  @JSImport("vexdb/out/methods/get", JSImport.Default)
  @js.native
  def default_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[js.Array[TeamsResponseObject]] = js.native
}
