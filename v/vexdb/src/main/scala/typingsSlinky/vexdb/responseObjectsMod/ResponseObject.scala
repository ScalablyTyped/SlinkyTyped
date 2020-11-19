package typingsSlinky.vexdb.responseObjectsMod

import typingsSlinky.vexdb.requestObjectsMod.Grades
import typingsSlinky.vexdb.requestObjectsMod.Programs
import typingsSlinky.vexdb.requestObjectsMod.Seasons
import typingsSlinky.vexdb.requestObjectsMod.SkillsType
import typingsSlinky.vexdb.vexdbNumbers.`0`
import typingsSlinky.vexdb.vexdbNumbers.`16`
import typingsSlinky.vexdb.vexdbNumbers.`1`
import typingsSlinky.vexdb.vexdbNumbers.`2`
import typingsSlinky.vexdb.vexdbNumbers.`3`
import typingsSlinky.vexdb.vexdbNumbers.`4`
import typingsSlinky.vexdb.vexdbNumbers.`5`
import typingsSlinky.vexdb.vexdbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vexdb.responseObjectsMod.TeamsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.EventsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.MatchesResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.RankingsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.SeasonRankingsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.AwardsResponseObject
  - typingsSlinky.vexdb.responseObjectsMod.SkillsResponseObject
*/
trait ResponseObject extends js.Object
object ResponseObject {
  
  @scala.inline
  def EventsResponseObject(
    divisions: js.Array[String],
    end: String,
    key: String,
    loc_address1: String,
    loc_address2: String,
    loc_city: String,
    loc_country: String,
    loc_postcode: String,
    loc_region: String,
    loc_venue: String,
    name: String,
    program: Programs,
    season: Seasons,
    sku: String,
    start: String
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(divisions = divisions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc_address1 = loc_address1.asInstanceOf[js.Any], loc_address2 = loc_address2.asInstanceOf[js.Any], loc_city = loc_city.asInstanceOf[js.Any], loc_country = loc_country.asInstanceOf[js.Any], loc_postcode = loc_postcode.asInstanceOf[js.Any], loc_region = loc_region.asInstanceOf[js.Any], loc_venue = loc_venue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def SkillsResponseObject(
    attempts: Double,
    program: Programs,
    rank: Double,
    score: Double,
    sku: String,
    team: String,
    `type`: SkillsType
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def RankingsResponseObject(
    ap: Double,
    ccwm: Double,
    division: String,
    dpr: Double,
    losses: Double,
    max_score: Double,
    opr: Double,
    rank: Double,
    sku: String,
    sp: Double,
    team: String,
    ties: Double,
    trsp: Double,
    wins: Double,
    wp: Double
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], ccwm = ccwm.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], opr = opr.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], ties = ties.asInstanceOf[js.Any], trsp = trsp.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def AwardsResponseObject(name: String, order: Double, qualifies: js.Array[String], sku: String, team: String): ResponseObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], qualifies = qualifies.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def MatchesResponseObject(
    blue1: String,
    blue2: String,
    blue3: String,
    bluescore: Double,
    bluesit: String,
    division: String,
    field: String,
    instance: Double,
    matchnum: Double,
    red1: String,
    red2: String,
    red3: String,
    redscore: Double,
    redsit: String,
    round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
    scheduled: String,
    scored: `0` | `1`,
    sku: String
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(blue1 = blue1.asInstanceOf[js.Any], blue2 = blue2.asInstanceOf[js.Any], blue3 = blue3.asInstanceOf[js.Any], bluescore = bluescore.asInstanceOf[js.Any], bluesit = bluesit.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], matchnum = matchnum.asInstanceOf[js.Any], red1 = red1.asInstanceOf[js.Any], red2 = red2.asInstanceOf[js.Any], red3 = red3.asInstanceOf[js.Any], redscore = redscore.asInstanceOf[js.Any], redsit = redsit.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], scored = scored.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def TeamsResponseObject(
    city: String,
    country: String,
    grade: Grades,
    is_registered: `0` | `1`,
    number: String,
    organisation: String,
    program: Programs,
    region: String,
    robot_name: String,
    team_name: String
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], grade = grade.asInstanceOf[js.Any], is_registered = is_registered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organisation = organisation.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], robot_name = robot_name.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  def SeasonRankingsResponseObject(program: Programs, season: Seasons, team: String, vrating: Double, vrating_rank: Double): ResponseObject = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}
