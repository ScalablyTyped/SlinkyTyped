package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveEmptyAttrs extends PluginConfig {
  var removeEmptyAttrs: Boolean | js.Object = js.native
}

object PluginRemoveEmptyAttrs {
  @scala.inline
  def apply(removeEmptyAttrs: Boolean | js.Object): PluginRemoveEmptyAttrs = {
    val __obj = js.Dynamic.literal(removeEmptyAttrs = removeEmptyAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEmptyAttrs]
  }
  @scala.inline
  implicit class PluginRemoveEmptyAttrsOps[Self <: PluginRemoveEmptyAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveEmptyAttrs(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmptyAttrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

