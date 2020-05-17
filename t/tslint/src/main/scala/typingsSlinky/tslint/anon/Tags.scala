package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  var tags: Properties = js.native
  var visibilities: Enum = js.native
}

object Tags {
  @scala.inline
  def apply(tags: Properties, visibilities: Enum): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilities(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

