package typingsSlinky.tuyaPanelKit.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.ActiveSize
import typingsSlinky.tuyaPanelKit.anon.Margin
import typingsSlinky.tuyaPanelKit.mod.SwitchButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchButton {
  
  @scala.inline
  def apply(onValueChange: Boolean => Unit): Builder = {
    val __props = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[SwitchButtonProps]))
  }
  
  @JSImport("tuya-panel-kit", "SwitchButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.SwitchButton] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: Boolean): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offText(value: String): this.type = set("offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offTextStyle(value: StyleProp[TextStyle]): this.type = set("offTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offTextStyleNull: this.type = set("offTextStyle", null)
    
    @scala.inline
    def onText(value: String): this.type = set("onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTextStyle(value: StyleProp[TextStyle]): this.type = set("onTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTextStyleNull: this.type = set("onTextStyle", null)
    
    @scala.inline
    def onThumbTintColor(value: String): this.type = set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTintColor(value: String | StringDictionary[String]): this.type = set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: ActiveSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def theme(value: Margin): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyleNull: this.type = set("thumbStyle", null)
    
    @scala.inline
    def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String | StringDictionary[String]): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Boolean): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
