package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCleanupEnableBackground extends PluginConfig {
  var cleanupEnableBackground: Boolean | js.Object = js.native
}

object PluginCleanupEnableBackground {
  @scala.inline
  def apply(cleanupEnableBackground: Boolean | js.Object): PluginCleanupEnableBackground = {
    val __obj = js.Dynamic.literal(cleanupEnableBackground = cleanupEnableBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupEnableBackground]
  }
  @scala.inline
  implicit class PluginCleanupEnableBackgroundOps[Self <: PluginCleanupEnableBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanupEnableBackground(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupEnableBackground")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

