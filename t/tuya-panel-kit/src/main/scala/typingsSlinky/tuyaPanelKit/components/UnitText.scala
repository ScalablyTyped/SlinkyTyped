package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.UnitTextProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.icon
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnitText {
  
  @JSImport("tuya-panel-kit", "UnitText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.UnitText] {
    
    @scala.inline
    def letterWidth(value: Double): this.type = set("letterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def svgMap(value: js.Object): this.type = set("svgMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def symbolWidth(value: Double): this.type = set("symbolWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def symbolsVarargs(value: String*): this.type = set("symbols", js.Array(value :_*))
    
    @scala.inline
    def symbols(value: js.Array[String]): this.type = set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: String): this.type = set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitColor(value: String): this.type = set("unitColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitPaddingLeft(value: Double): this.type = set("unitPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitPaddingTop(value: Double): this.type = set("unitPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitSize(value: Double): this.type = set("unitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitType(value: icon | text): this.type = set("unitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useART(value: Boolean): this.type = set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueColor(value: String): this.type = set("valueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueColorsVarargs(value: String*): this.type = set("valueColors", js.Array(value :_*))
    
    @scala.inline
    def valueColors(value: js.Array[String]): this.type = set("valueColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueSize(value: Double): this.type = set("valueSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UnitTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: String | Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UnitTextProps]))
  }
}
