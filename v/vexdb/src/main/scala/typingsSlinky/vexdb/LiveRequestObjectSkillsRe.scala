package typingsSlinky.vexdb

import typingsSlinky.vexdb.requestObjectsMod.NumberRequest
import typingsSlinky.vexdb.requestObjectsMod.StringRequest
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.SkillsRequestObject> */
@js.native
trait LiveRequestObjectSkillsRe extends js.Object {
  var attempts: js.UndefOr[NumberRequest] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var program: js.UndefOr[StringRequest] = js.native
  var rank: js.UndefOr[NumberRequest] = js.native
  var score: js.UndefOr[NumberRequest] = js.native
  var season: js.UndefOr[StringRequest] = js.native
  var season_rank: js.UndefOr[NumberRequest] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[StringRequest] = js.native
  var team: js.UndefOr[StringRequest] = js.native
  var `type`: js.UndefOr[NumberRequest] = js.native
}

object LiveRequestObjectSkillsRe {
  @scala.inline
  def apply(): LiveRequestObjectSkillsRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectSkillsRe]
  }
  @scala.inline
  implicit class LiveRequestObjectSkillsReOps[Self <: LiveRequestObjectSkillsRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptsFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttempts(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.undefined)
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
    def withProgramFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProgramRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withRankFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRank(value: NumberRequest): Self = {
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
    def withScoreFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScore(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
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
    def withSeason_rankFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season_rank")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSeason_rank(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season_rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeason_rank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season_rank")(js.undefined)
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
    def withTypeFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

