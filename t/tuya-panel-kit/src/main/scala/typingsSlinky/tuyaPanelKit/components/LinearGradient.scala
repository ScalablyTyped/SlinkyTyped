package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Record
import typingsSlinky.tuyaPanelKit.mod.LinearGradientProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("tuya-panel-kit", "LinearGradient")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.LinearGradient] {
    
    @scala.inline
    def gradientId(value: String): this.type = set("gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stops(value: Record[String, String]): this.type = set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def x1(value: String): this.type = set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x2(value: String): this.type = set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y1(value: String): this.type = set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y2(value: String): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinearGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LinearGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
