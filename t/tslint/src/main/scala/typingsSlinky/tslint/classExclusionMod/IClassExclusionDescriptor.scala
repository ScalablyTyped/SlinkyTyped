package typingsSlinky.tslint.classExclusionMod

import typingsSlinky.tslint.completedDocsRuleMod.Location
import typingsSlinky.tslint.completedDocsRuleMod.Privacy
import typingsSlinky.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassExclusionDescriptor extends ExclusionDescriptor {
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  var privacies: js.UndefOr[js.Array[Privacy]] = js.undefined
}

object IClassExclusionDescriptor {
  @scala.inline
  def apply(locations: js.Array[Location] = null, privacies: js.Array[Privacy] = null): IClassExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (privacies != null) __obj.updateDynamic("privacies")(privacies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassExclusionDescriptor]
  }
}

