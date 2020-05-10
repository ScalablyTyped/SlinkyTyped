package typingsSlinky.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankingsResponseObject extends ResponseObject {
  var ap: Double = js.native
  var ccwm: Double = js.native
  var division: String = js.native
  var dpr: Double = js.native
  var losses: Double = js.native
  var max_score: Double = js.native
  var opr: Double = js.native
  var rank: Double = js.native
  var sku: String = js.native
  var sp: Double = js.native
  var team: String = js.native
  var ties: Double = js.native
  var trsp: Double = js.native
  var wins: Double = js.native
  var wp: Double = js.native
}

object RankingsResponseObject {
  @scala.inline
  def apply(
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
  ): RankingsResponseObject = {
    val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], ccwm = ccwm.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], dpr = dpr.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], max_score = max_score.asInstanceOf[js.Any], opr = opr.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], ties = ties.asInstanceOf[js.Any], trsp = trsp.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankingsResponseObject]
  }
  @scala.inline
  implicit class RankingsResponseObjectOps[Self <: RankingsResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCcwm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDpr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLosses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrsp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trsp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

