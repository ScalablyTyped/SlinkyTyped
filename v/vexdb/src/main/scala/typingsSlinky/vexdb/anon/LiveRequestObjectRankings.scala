package typingsSlinky.vexdb.anon

import typingsSlinky.vexdb.requestObjectsMod.NumberRequest
import typingsSlinky.vexdb.requestObjectsMod.StringRequest
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.RankingsRequestObject> */
@js.native
trait LiveRequestObjectRankings extends js.Object {
  var ap: js.UndefOr[NumberRequest] = js.native
  var ccwm: js.UndefOr[NumberRequest] = js.native
  var division: js.UndefOr[StringRequest] = js.native
  var dpr: js.UndefOr[NumberRequest] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var losses: js.UndefOr[NumberRequest] = js.native
  var max_score: js.UndefOr[NumberRequest] = js.native
  var opr: js.UndefOr[NumberRequest] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var rank: js.UndefOr[StringRequest] = js.native
  var season: js.UndefOr[StringRequest] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[StringRequest] = js.native
  var sp: js.UndefOr[NumberRequest] = js.native
  var team: js.UndefOr[StringRequest] = js.native
  var ties: js.UndefOr[NumberRequest] = js.native
  var trsp: js.UndefOr[NumberRequest] = js.native
  var wins: js.UndefOr[NumberRequest] = js.native
  var wp: js.UndefOr[NumberRequest] = js.native
}

object LiveRequestObjectRankings {
  @scala.inline
  def apply(): LiveRequestObjectRankings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectRankings]
  }
  @scala.inline
  implicit class LiveRequestObjectRankingsOps[Self <: LiveRequestObjectRankings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAp(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ap")(js.undefined)
        ret
    }
    @scala.inline
    def withCcwmFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccwm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCcwm(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcwm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccwm")(js.undefined)
        ret
    }
    @scala.inline
    def withDivisionFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDivisionRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivision(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(js.undefined)
        ret
    }
    @scala.inline
    def withDprFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDpr(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpr")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_number")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit_start")(js.undefined)
        ret
    }
    @scala.inline
    def withLossesFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLosses(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLosses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("losses")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_scoreFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_score")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMax_score(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_score: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_score")(js.undefined)
        ret
    }
    @scala.inline
    def withOprFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpr(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opr")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withRankFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRankRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeasonRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(js.undefined)
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSkuRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(js.undefined)
        ret
    }
    @scala.inline
    def withSpFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSp(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sp")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTeamRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.undefined)
        ret
    }
    @scala.inline
    def withTiesFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ties")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTies(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ties")(js.undefined)
        ret
    }
    @scala.inline
    def withTrspFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trsp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrsp(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trsp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trsp")(js.undefined)
        ret
    }
    @scala.inline
    def withWinsFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWins(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wins")(js.undefined)
        ret
    }
    @scala.inline
    def withWpFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWp(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wp")(js.undefined)
        ret
    }
  }
  
}

