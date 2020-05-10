package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceAttribute extends js.Object {
  @JSName("app:id")
  var appColonid: String = js.native
  var iso3: String = js.native
  var locality: String = js.native
  var phone: String = js.native
  var postal_code: String = js.native
  var region: String = js.native
  var street_address: String = js.native
  var twitter: String = js.native
  var url: String = js.native
}

object PlaceAttribute {
  @scala.inline
  def apply(
    appColonid: String,
    iso3: String,
    locality: String,
    phone: String,
    postal_code: String,
    region: String,
    street_address: String,
    twitter: String,
    url: String
  ): PlaceAttribute = {
    val __obj = js.Dynamic.literal(iso3 = iso3.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street_address = street_address.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("app:id")(appColonid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAttribute]
  }
  @scala.inline
  implicit class PlaceAttributeOps[Self <: PlaceAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppColonid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app:id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreet_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

