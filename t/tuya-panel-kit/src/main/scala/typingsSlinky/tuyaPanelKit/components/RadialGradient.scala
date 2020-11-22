package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.RadialGradientProps
import typingsSlinky.tuyaPanelKit.themeMod.StopsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialGradient {
  
  @JSImport("tuya-panel-kit", "RadialGradient")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.RadialGradient] {
    
    @scala.inline
    def cx(value: String): this.type = set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cy(value: String): this.type = set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fx(value: String): this.type = set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fy(value: String): this.type = set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientId(value: String): this.type = set("gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rx(value: String): this.type = set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ry(value: String): this.type = set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopsVarargs(value: StopsProps*): this.type = set("stops", js.Array(value :_*))
    
    @scala.inline
    def stops(value: js.Array[StopsProps]): this.type = set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: RadialGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadialGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
