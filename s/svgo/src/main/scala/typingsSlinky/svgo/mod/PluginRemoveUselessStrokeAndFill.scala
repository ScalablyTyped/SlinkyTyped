package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveUselessStrokeAndFill extends PluginConfig {
  var removeUselessStrokeAndFill: Boolean | js.Object = js.native
}

object PluginRemoveUselessStrokeAndFill {
  @scala.inline
  def apply(removeUselessStrokeAndFill: Boolean | js.Object): PluginRemoveUselessStrokeAndFill = {
    val __obj = js.Dynamic.literal(removeUselessStrokeAndFill = removeUselessStrokeAndFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessStrokeAndFill]
  }
  @scala.inline
  implicit class PluginRemoveUselessStrokeAndFillOps[Self <: PluginRemoveUselessStrokeAndFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveUselessStrokeAndFill(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUselessStrokeAndFill")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

