package typingsSlinky.vexdb.responseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResponseObject extends ResponseObject {
  var divisions: js.Array[String] = js.native
  var end: String = js.native
  var key: String = js.native
  var loc_address1: String = js.native
  var loc_address2: String = js.native
  var loc_city: String = js.native
  var loc_country: String = js.native
  var loc_postcode: String = js.native
  var loc_region: String = js.native
  var loc_venue: String = js.native
  var name: String = js.native
  var program: String = js.native
  var season: String = js.native
  var sku: String = js.native
  var start: String = js.native
}

object EventsResponseObject {
  @scala.inline
  def apply(
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
    program: String,
    season: String,
    sku: String,
    start: String
  ): EventsResponseObject = {
    val __obj = js.Dynamic.literal(divisions = divisions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc_address1 = loc_address1.asInstanceOf[js.Any], loc_address2 = loc_address2.asInstanceOf[js.Any], loc_city = loc_city.asInstanceOf[js.Any], loc_country = loc_country.asInstanceOf[js.Any], loc_postcode = loc_postcode.asInstanceOf[js.Any], loc_region = loc_region.asInstanceOf[js.Any], loc_venue = loc_venue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsResponseObject]
  }
  @scala.inline
  implicit class EventsResponseObjectOps[Self <: EventsResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivisions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_address1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_address2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_city(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_postcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_region(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoc_venue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc_venue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

