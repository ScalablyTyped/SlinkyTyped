package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTags extends js.Object {
  var tags: AnonProperties = js.native
  var visibilities: AnonEnum = js.native
}

object AnonTags {
  @scala.inline
  def apply(tags: AnonProperties, visibilities: AnonEnum): AnonTags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTags]
  }
  @scala.inline
  implicit class AnonTagsOps[Self <: AnonTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

