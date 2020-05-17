package typingsSlinky.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Awards extends js.Object {
  var awards: js.Array[String] = js.native
  var events: js.Array[String] = js.native
  var matches: js.Array[String] = js.native
  var rankings: js.Array[String] = js.native
  var season_rankings: js.Array[String] = js.native
  var skills: js.Array[String] = js.native
  var teams: js.Array[String] = js.native
}

object Awards {
  @scala.inline
  def apply(
    awards: js.Array[String],
    events: js.Array[String],
    matches: js.Array[String],
    rankings: js.Array[String],
    season_rankings: js.Array[String],
    skills: js.Array[String],
    teams: js.Array[String]
  ): Awards = {
    val __obj = js.Dynamic.literal(awards = awards.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], rankings = rankings.asInstanceOf[js.Any], season_rankings = season_rankings.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Awards]
  }
  @scala.inline
  implicit class AwardsOps[Self <: Awards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwards(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRankings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason_rankings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season_rankings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkills(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

