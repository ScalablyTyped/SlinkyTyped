package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveMetadata extends PluginConfig {
  var removeMetadata: Boolean | js.Object = js.native
}

object PluginRemoveMetadata {
  @scala.inline
  def apply(removeMetadata: Boolean | js.Object): PluginRemoveMetadata = {
    val __obj = js.Dynamic.literal(removeMetadata = removeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveMetadata]
  }
  @scala.inline
  implicit class PluginRemoveMetadataOps[Self <: PluginRemoveMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveMetadata(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

