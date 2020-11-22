package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.ToastProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("tuya-panel-kit", "Toast")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Toast] {
    
    @scala.inline
    def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyleNull: this.type = set("contentStyle", null)
    
    @scala.inline
    def image(value: Double): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageStyle(value: StyleProp[ImageStyle]): this.type = set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageStyleNull: this.type = set("imageStyle", null)
    
    @scala.inline
    def showPosition(value: top | bottom | center): this.type = set("showPosition", value.asInstanceOf[js.Any])
    
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
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onFinish: () => Unit, show: Boolean): Builder = {
    val __props = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
}
