package typingsSlinky.tslint.classExclusionMod

import typingsSlinky.tslint.completedDocsRuleMod.Location
import typingsSlinky.tslint.completedDocsRuleMod.Privacy
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClassExclusionDescriptor extends ExclusionDescriptor {
  var locations: js.UndefOr[js.Array[Location]] = js.native
  var privacies: js.UndefOr[js.Array[Privacy]] = js.native
}

object IClassExclusionDescriptor {
  @scala.inline
  def apply(): IClassExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClassExclusionDescriptor]
  }
  @scala.inline
  implicit class IClassExclusionDescriptorOps[Self <: IClassExclusionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacies(value: js.Array[Privacy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacies")(js.undefined)
        ret
    }
  }
  
}

