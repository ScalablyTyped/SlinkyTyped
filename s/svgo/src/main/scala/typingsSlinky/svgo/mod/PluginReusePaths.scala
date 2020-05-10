package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginReusePaths extends PluginConfig {
  var reusePaths: Boolean | js.Object = js.native
}

object PluginReusePaths {
  @scala.inline
  def apply(reusePaths: Boolean | js.Object): PluginReusePaths = {
    val __obj = js.Dynamic.literal(reusePaths = reusePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginReusePaths]
  }
  @scala.inline
  implicit class PluginReusePathsOps[Self <: PluginReusePaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReusePaths(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reusePaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

