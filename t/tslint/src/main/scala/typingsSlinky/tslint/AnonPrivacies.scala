package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrivacies extends js.Object {
  var locations: AnonEnum = js.native
  var overloads: AnonType = js.native
  var privacies: AnonEnum = js.native
  var tags: AnonProperties = js.native
}

object AnonPrivacies {
  @scala.inline
  def apply(locations: AnonEnum, overloads: AnonType, privacies: AnonEnum, tags: AnonProperties): AnonPrivacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivacies]
  }
  @scala.inline
  implicit class AnonPrivaciesOps[Self <: AnonPrivacies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverloads(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacies(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: AnonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

