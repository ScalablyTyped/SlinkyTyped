package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Privacies extends js.Object {
  var locations: Enum = js.native
  var overloads: Type = js.native
  var privacies: Enum = js.native
  var tags: Properties = js.native
}

object Privacies {
  @scala.inline
  def apply(locations: Enum, overloads: Type, privacies: Enum, tags: Properties): Privacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privacies]
  }
  @scala.inline
  implicit class PrivaciesOps[Self <: Privacies] (val x: Self) extends AnyVal {
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
    def withOverloads(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloads")(value.asInstanceOf[js.Any])
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

