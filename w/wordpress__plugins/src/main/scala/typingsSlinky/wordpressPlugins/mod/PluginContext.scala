package typingsSlinky.wordpressPlugins.mod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/plugins.@wordpress/plugins.Plugin, 'render'> */
trait PluginContext extends js.Object {
  var icon: Icon | ReactComponentClass[js.Object]
  var name: String
}

object PluginContext {
  @scala.inline
  def apply(icon: Icon | ReactComponentClass[js.Object], name: String): PluginContext = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContext]
  }
}

