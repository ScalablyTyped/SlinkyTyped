package typingsSlinky.tuyaPanelKit.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.BgBorder
import typingsSlinky.tuyaPanelKit.mod.BrickButtonProps
import typingsSlinky.tuyaPanelKit.themeMod.BackgroundProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.large
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.primary
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.primaryBorder
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.primaryGradient
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrickButton {
  
  @JSImport("tuya-panel-kit", "BrickButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.BrickButton] {
    
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: BackgroundProps): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColorTouched(value: String): this.type = set("backgroundColorTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingBackground(value: String): this.type = set("loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingColor(value: String): this.type = set("loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingSize(value: small | large | Double): this.type = set("loadingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingStrokeWidth(value: Double): this.type = set("loadingStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingStyle(value: StyleProp[ViewStyle]): this.type = set("loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingStyleNull: this.type = set("loadingStyle", null)
    
    @scala.inline
    def onChange(value: (/* eventName */ String, /* args */ js.Any) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def showUnderlay(value: Boolean): this.type = set("showUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    
    @scala.inline
    def theme(value: BgBorder): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: primary | primaryGradient | primaryBorder | normal | small): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  implicit def make(companion: BrickButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrickButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
