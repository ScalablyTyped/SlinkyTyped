package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorPlugins extends js.Object {
  val mimeTypes: MimeTypeArray = js.native
  val plugins: PluginArray = js.native
  def javaEnabled(): scala.Boolean = js.native
}

object NavigatorPlugins {
  @scala.inline
  def apply(javaEnabled: () => scala.Boolean, mimeTypes: MimeTypeArray, plugins: PluginArray): NavigatorPlugins = {
    val __obj = js.Dynamic.literal(javaEnabled = js.Any.fromFunction0(javaEnabled), mimeTypes = mimeTypes.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorPlugins]
  }
  @scala.inline
  implicit class NavigatorPluginsOps[Self <: NavigatorPlugins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJavaEnabled(value: () => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMimeTypes(value: MimeTypeArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: PluginArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

