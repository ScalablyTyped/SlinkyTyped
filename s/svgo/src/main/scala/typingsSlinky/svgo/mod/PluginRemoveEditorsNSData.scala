package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveEditorsNSData extends PluginConfig {
  var removeEditorsNSData: Boolean | js.Object = js.native
}

object PluginRemoveEditorsNSData {
  @scala.inline
  def apply(removeEditorsNSData: Boolean | js.Object): PluginRemoveEditorsNSData = {
    val __obj = js.Dynamic.literal(removeEditorsNSData = removeEditorsNSData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEditorsNSData]
  }
  @scala.inline
  implicit class PluginRemoveEditorsNSDataOps[Self <: PluginRemoveEditorsNSData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveEditorsNSData(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEditorsNSData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

