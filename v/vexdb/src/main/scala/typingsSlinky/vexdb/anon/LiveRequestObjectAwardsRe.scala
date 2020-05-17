package typingsSlinky.vexdb.anon

import typingsSlinky.vexdb.requestObjectsMod.NumberRequest
import typingsSlinky.vexdb.requestObjectsMod.StringRequest
import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.AwardsRequestObject> */
@js.native
trait LiveRequestObjectAwardsRe extends js.Object {
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var name: js.UndefOr[StringRequest] = js.native
  var order: js.UndefOr[NumberRequest] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var season: js.UndefOr[StringRequest] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[StringRequest] = js.native
  var team: js.UndefOr[StringRequest] = js.native
}

object LiveRequestObjectAwardsRe {
  @scala.inline
  def apply(): LiveRequestObjectAwardsRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectAwardsRe]
  }
  @scala.inline
  implicit class LiveRequestObjectAwardsReOps[Self <: LiveRequestObjectAwardsRe] (val x: Self) extends AnyVal {
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
    def withNameFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNameRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFunction2(value: (/* itemValue */ Double, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOrder(value: NumberRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
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
  }
  
}

