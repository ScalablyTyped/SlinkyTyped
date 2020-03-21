package typingsSlinky.webpack.nextMod.webpackAugmentingMod.Stats

import typingsSlinky.webpack.mod.Stats.Preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToStringOptionsObject extends js.Object {
  /**
    * preset for the default values
    */
  var preset: js.UndefOr[Preset] = js.undefined
}

object ToStringOptionsObject {
  @scala.inline
  def apply(preset: Preset = null): ToStringOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToStringOptionsObject]
  }
}

