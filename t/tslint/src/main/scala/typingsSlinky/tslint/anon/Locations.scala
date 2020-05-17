package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locations extends js.Object {
  var locations: Enum = js.native
  var privacies: Enum = js.native
  var tags: Properties = js.native
}

object Locations {
  @scala.inline
  def apply(locations: Enum, privacies: Enum, tags: Properties): Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
  @scala.inline
  implicit class LocationsOps[Self <: Locations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacies(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

