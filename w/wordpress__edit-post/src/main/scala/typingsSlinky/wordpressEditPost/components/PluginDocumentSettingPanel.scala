package typingsSlinky.wordpressEditPost.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import typingsSlinky.wordpressEditPost.pluginDocumentSettingPanelMod.PluginDocumentSettingPanel.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginDocumentSettingPanel {
  
  @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: Icon | ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PluginDocumentSettingPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Slot {
    
    @JSImport("@wordpress/edit-post", "PluginDocumentSettingPanel.Slot")
    @js.native
    object component extends js.Object
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, js.Dictionary.empty))()
  }
}
