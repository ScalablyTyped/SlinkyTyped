package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.Delay
import typingsSlinky.tuyaPanelKit.mod.MotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Motion {
  
  @JSImport("tuya-panel-kit", "Motion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Motion] {
    
    @scala.inline
    def animationConfig(value: Delay): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideDuration(value: Double): this.type = set("hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHide(value: () => Unit): this.type = set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showDuration(value: Double): this.type = set("showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Motion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
