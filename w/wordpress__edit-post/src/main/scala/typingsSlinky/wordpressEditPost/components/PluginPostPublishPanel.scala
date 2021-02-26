package typingsSlinky.wordpressEditPost.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import typingsSlinky.wordpressEditPost.pluginPostPublishPanelMod.PluginPostPublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginPostPublishPanel {
  
  object Slot {
    
    @JSImport("@wordpress/edit-post", "PluginPostPublishPanel.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname_1548854944 = new SharedBuilder_OmitPropsname_1548854944(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/edit-post", "PluginPostPublishPanel")
  @js.native
  val component: js.Object = js.native
  
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
  
  implicit def make(companion: PluginPostPublishPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
