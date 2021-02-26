package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.IconFontProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bevel
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.butt
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.miter
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.round
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconFont {
  
  @JSImport("tuya-panel-kit", "IconFont")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.IconFont] {
    
    @scala.inline
    def ascent(value: Double): this.type = set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: js.Any): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def d(value: String): this.type = set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descent(value: Double): this.type = set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hFlip(value: Boolean): this.type = set("hFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: String | Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleX(value: Double): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleY(value: Double): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spaceOffset(value: Double): this.type = set("spaceOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeCap(value: round | butt | square): this.type = set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDash(value: js.Array[Double]): this.type = set("strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashVarargs(value: Double*): this.type = set("strokeDash", js.Array(value :_*))
    
    @scala.inline
    def strokeJoin(value: round | miter | bevel): this.type = set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def unitsPerEm(value: Double): this.type = set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useART(value: `true`): this.type = set("useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vFlip(value: Boolean): this.type = set("vFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: IconFont.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconFontProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
