package typingsSlinky.vexdb.anon

import typingsSlinky.vexdb.requestObjectsMod.NumberRequest
import typingsSlinky.vexdb.requestObjectsMod.StringRequest
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.SeasonRankingsRequestObject> */
@js.native
trait LiveRequestObjectSeasonRa extends js.Object {
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var program: js.UndefOr[StringRequest] = js.native
  var season: js.UndefOr[StringRequest] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var team: js.UndefOr[StringRequest] = js.native
  var vrating: js.UndefOr[NumberRequest] = js.native
  var vrating_rank: js.UndefOr[NumberRequest] = js.native
}

object LiveRequestObjectSeasonRa {
  @scala.inline
  def apply(): LiveRequestObjectSeasonRa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectSeasonRa]
  }
  @scala.inline
  implicit class LiveRequestObjectSeasonRaOps[Self <: LiveRequestObjectSeasonRa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVratingFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVrating(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVrating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating")(js.undefined)
        ret
    }
    @scala.inline
    def withVrating_rankFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating_rank")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVrating_rank(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating_rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVrating_rank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrating_rank")(js.undefined)
        ret
    }
  }
  
}

