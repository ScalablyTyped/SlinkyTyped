package typingsSlinky.tslint.blockExclusionMod

import typingsSlinky.tslint.completedDocsRuleMod.Visibility
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlockExclusionDescriptor extends ExclusionDescriptor {
  var visibilities: js.UndefOr[js.Array[Visibility]] = js.undefined
}

object IBlockExclusionDescriptor {
  @scala.inline
  def apply(visibilities: js.Array[Visibility] = null): IBlockExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (visibilities != null) __obj.updateDynamic("visibilities")(visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockExclusionDescriptor]
  }
}

