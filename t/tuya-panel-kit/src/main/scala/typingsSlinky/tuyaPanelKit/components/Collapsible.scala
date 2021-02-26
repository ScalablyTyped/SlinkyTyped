package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.CollapsibleProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapsible {
  
  @JSImport("tuya-panel-kit", "Collapsible")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Collapsible] {
    
    @scala.inline
    def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsedHeight(value: Double): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String | js.Function0[Unit]): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easingFunction0(value: () => Unit): this.type = set("easing", js.Any.fromFunction0(value))
    
    @scala.inline
    def onChange(value: () => Unit): this.type = set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Collapsible.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsibleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
