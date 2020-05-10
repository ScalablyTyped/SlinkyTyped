package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCleanupIDs extends PluginConfig {
  var cleanupIDs: Boolean | js.Object = js.native
}

object PluginCleanupIDs {
  @scala.inline
  def apply(cleanupIDs: Boolean | js.Object): PluginCleanupIDs = {
    val __obj = js.Dynamic.literal(cleanupIDs = cleanupIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupIDs]
  }
  @scala.inline
  implicit class PluginCleanupIDsOps[Self <: PluginCleanupIDs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanupIDs(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupIDs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

