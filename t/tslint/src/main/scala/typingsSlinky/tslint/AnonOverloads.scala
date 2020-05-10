package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverloads extends js.Object {
  var overloads: AnonType = js.native
  var tags: AnonProperties = js.native
  var visibilities: AnonEnum = js.native
}

object AnonOverloads {
  @scala.inline
  def apply(overloads: AnonType, tags: AnonProperties, visibilities: AnonEnum): AnonOverloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverloads]
  }
  @scala.inline
  implicit class AnonOverloadsOps[Self <: AnonOverloads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverloads(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: AnonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilities(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

