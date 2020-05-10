package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveDimensions extends PluginConfig {
  var removeDimensions: Boolean | js.Object = js.native
}

object PluginRemoveDimensions {
  @scala.inline
  def apply(removeDimensions: Boolean | js.Object): PluginRemoveDimensions = {
    val __obj = js.Dynamic.literal(removeDimensions = removeDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDimensions]
  }
  @scala.inline
  implicit class PluginRemoveDimensionsOps[Self <: PluginRemoveDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveDimensions(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDimensions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

