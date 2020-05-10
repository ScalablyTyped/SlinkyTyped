package typingsSlinky.tslint.tagExclusionMod

import typingsSlinky.tslint.AnonContent
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagExclusionDescriptor extends ExclusionDescriptor {
  var tags: js.UndefOr[AnonContent] = js.native
}

object ITagExclusionDescriptor {
  @scala.inline
  def apply(): ITagExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagExclusionDescriptor]
  }
  @scala.inline
  implicit class ITagExclusionDescriptorOps[Self <: ITagExclusionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: AnonContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

