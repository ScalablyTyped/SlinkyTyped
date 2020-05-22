package typingsSlinky.wordpressPlugins.mod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSettings extends js.Object {
  /**
    * An icon to be shown in the UI. It can be a slug of the Dashicon, or an
    * element (or function returning an element) if you choose to render your
    * own SVG.
    */
  var icon: Icon | ReactComponentClass[js.Object]
  /**
    * A component containing the UI elements to be rendered.
    */
  var render: ReactComponentClass[js.Object]
}

object PluginSettings {
  @scala.inline
  def apply(icon: Icon | ReactComponentClass[js.Object], render: ReactComponentClass[js.Object]): PluginSettings = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSettings]
  }
}

