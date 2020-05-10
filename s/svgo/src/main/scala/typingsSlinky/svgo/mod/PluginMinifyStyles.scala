package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginMinifyStyles extends PluginConfig {
  var minifyStyles: Boolean | js.Object = js.native
}

object PluginMinifyStyles {
  @scala.inline
  def apply(minifyStyles: Boolean | js.Object): PluginMinifyStyles = {
    val __obj = js.Dynamic.literal(minifyStyles = minifyStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMinifyStyles]
  }
  @scala.inline
  implicit class PluginMinifyStylesOps[Self <: PluginMinifyStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinifyStyles(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minifyStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

