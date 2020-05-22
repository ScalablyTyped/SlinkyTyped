package typingsSlinky.wordpressPlugins.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluginArea {
  @JSImport("@wordpress/plugins", "PluginArea")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.wordpressPlugins.mod.PluginArea] = new Default[tag.type, typingsSlinky.wordpressPlugins.mod.PluginArea](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PluginArea.type): Default[tag.type, typingsSlinky.wordpressPlugins.mod.PluginArea] = new Default[tag.type, typingsSlinky.wordpressPlugins.mod.PluginArea](js.Array(this.component, js.Dictionary.empty))()
}

