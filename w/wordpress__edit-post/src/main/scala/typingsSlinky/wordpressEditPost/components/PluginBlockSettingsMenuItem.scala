package typingsSlinky.wordpressEditPost.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressEditPost.pluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginBlockSettingsMenuItem {
  
  @JSImport("@wordpress/edit-post", "PluginBlockSettingsMenuItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def allowedBlocksVarargs(value: String*): this.type = set("allowedBlocks", js.Array(value :_*))
    
    @scala.inline
    def allowedBlocks(value: js.Array[String]): this.type = set("allowedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement | Icon): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(label: String, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
