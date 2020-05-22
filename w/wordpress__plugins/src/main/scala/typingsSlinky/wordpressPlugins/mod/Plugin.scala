package typingsSlinky.wordpressPlugins.mod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends PluginSettings {
  /**
    * A string identifying the plugin. Must be unique across all registered
    * plugins.
    */
  var name: String
}

object Plugin {
  @scala.inline
  def apply(icon: Icon | ReactComponentClass[js.Object], name: String, render: ReactComponentClass[js.Object]): Plugin = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

