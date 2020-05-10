package typingsSlinky.tslint.blockExclusionMod

import typingsSlinky.tslint.completedDocsRuleMod.Visibility
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockExclusionDescriptor extends ExclusionDescriptor {
  var visibilities: js.UndefOr[js.Array[Visibility]] = js.native
}

object IBlockExclusionDescriptor {
  @scala.inline
  def apply(): IBlockExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlockExclusionDescriptor]
  }
  @scala.inline
  implicit class IBlockExclusionDescriptorOps[Self <: IBlockExclusionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibilities(value: js.Array[Visibility]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilities")(js.undefined)
        ret
    }
  }
  
}

