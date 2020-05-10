package typingsSlinky.vexdb.requestObjectsMod

import typingsSlinky.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsRequestObject extends RequestObject {
  var city: js.UndefOr[StringRequest] = js.native
  var country: js.UndefOr[StringRequest] = js.native
  var date: js.UndefOr[StringRequest] = js.native
  var end: js.UndefOr[StringRequest] = js.native
  var key: js.UndefOr[StringRequest] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var loc_address1: js.UndefOr[StringRequest] = js.native
  var loc_address2: js.UndefOr[StringRequest] = js.native
  var loc_city: js.UndefOr[StringRequest] = js.native
  var loc_country: js.UndefOr[StringRequest] = js.native
  var loc_postcode: js.UndefOr[StringRequest] = js.native
  var loc_region: js.UndefOr[StringRequest] = js.native
  var loc_venue: js.UndefOr[StringRequest] = js.native
  var name: js.UndefOr[StringRequest] = js.native
  var program: js.UndefOr[StringRequest] = js.native
  var region: js.UndefOr[StringRequest] = js.native
  var season: js.UndefOr[StringRequest] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[StringRequest] = js.native
  var start: js.UndefOr[StringRequest] = js.native
  var status: js.UndefOr[StringRequest] = js.native
  var team: js.UndefOr[String] = js.native
}

object EventsRequestObject {
  @scala.inline
  def apply(): EventsRequestObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsRequestObject]
  }
  @scala.inline
  implicit class EventsRequestObjectOps[Self <: EventsRequestObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCityFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCityRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCountryRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDateRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withEndFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withLoc_address1Function2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address1")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_address1RegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_address1(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_address1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address1")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_address2Function2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_address2RegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_address2(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_address2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address2")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_cityFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_city")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_cityRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_city(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_city: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_city")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_countryFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_country")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_countryRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_country(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_country: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_country")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_postcodeFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_postcode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_postcodeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_postcode(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_postcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_postcode")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_regionFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_region")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_regionRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_region(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_region")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc_venueFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_venue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoc_venueRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_venue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_venue(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_venue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc_venue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_venue")(js.undefined)
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
    def withRegionFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegionRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
    def withStartFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusFunction2(value: (/* itemValue */ String, /* item */ ResponseObject) => js.Promise[Boolean] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStatusRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: StringRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam(value: String): Self = {
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

