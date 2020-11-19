package typingsSlinky.wordpressEditPost.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import typingsSlinky.wordpressEditPost.pluginPrePublishPanelMod.PluginPrePublishPanel.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginPrePublishPanel {
  
  @JSImport("@wordpress/edit-post", "PluginPrePublishPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PluginPrePublishPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Slot {
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel.Slot")
    @js.native
    object component extends js.Object
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, js.Dictionary.empty))()
  }
}
