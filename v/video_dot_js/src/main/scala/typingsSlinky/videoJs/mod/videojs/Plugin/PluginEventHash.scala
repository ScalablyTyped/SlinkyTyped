package typingsSlinky.videoJs.mod.videojs.Plugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginEventHash extends js.Object {
  /**
    * For basic plugins, the return value of the plugin function. For
    * advanced plugins, the plugin instance on which the event is fired.
    */
  var instance: typingsSlinky.videoJs.mod.videojs.Plugin = js.native
  /**
    * The name of the plugin.
    */
  var name: String = js.native
  /**
    * For basic plugins, the plugin function. For advanced plugins, the
    * plugin class/constructor.
    */
  var plugin: String = js.native
}

object PluginEventHash {
  @scala.inline
  def apply(instance: typingsSlinky.videoJs.mod.videojs.Plugin, name: String, plugin: String): PluginEventHash = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginEventHash]
  }
  @scala.inline
  implicit class PluginEventHashOps[Self <: PluginEventHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: typingsSlinky.videoJs.mod.videojs.Plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

