package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveEmptyContainers extends PluginConfig {
  var removeEmptyContainers: Boolean | js.Object = js.native
}

object PluginRemoveEmptyContainers {
  @scala.inline
  def apply(removeEmptyContainers: Boolean | js.Object): PluginRemoveEmptyContainers = {
    val __obj = js.Dynamic.literal(removeEmptyContainers = removeEmptyContainers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyContainers]
  }
  @scala.inline
  implicit class PluginRemoveEmptyContainersOps[Self <: PluginRemoveEmptyContainers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveEmptyContainers(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyContainers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

