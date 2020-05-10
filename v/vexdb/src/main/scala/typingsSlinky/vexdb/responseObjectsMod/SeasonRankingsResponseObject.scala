package typingsSlinky.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeasonRankingsResponseObject extends ResponseObject {
  var program: String = js.native
  var season: String = js.native
  var team: String = js.native
  var vrating: Double = js.native
  var vrating_rank: Double = js.native
}

object SeasonRankingsResponseObject {
  @scala.inline
  def apply(program: String, season: String, team: String, vrating: Double, vrating_rank: Double): SeasonRankingsResponseObject = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], vrating = vrating.asInstanceOf[js.Any], vrating_rank = vrating_rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeasonRankingsResponseObject]
  }
  @scala.inline
  implicit class SeasonRankingsResponseObjectOps[Self <: SeasonRankingsResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrating_rank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating_rank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

