package typingsSlinky.wordpressEditor.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.ColorSetting
import typingsSlinky.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props
import typingsSlinky.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelColorSettings {
  
  @JSImport("@wordpress/editor", "PanelColorSettings")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: js.Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCustomColors(value: Boolean): this.type = set("disableCustomColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IconType[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onToggle(value: () => Unit): this.type = set("onToggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def opened(value: Boolean): this.type = set("opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(colorSettings: js.Array[ColorSetting]): Builder = {
    val __props = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
