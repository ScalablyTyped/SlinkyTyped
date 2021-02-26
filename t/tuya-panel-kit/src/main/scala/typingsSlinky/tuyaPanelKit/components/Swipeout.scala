package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.SwipeoutAction
import typingsSlinky.tuyaPanelKit.mod.SwipeoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swipeout {
  
  @JSImport("tuya-panel-kit", "Swipeout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Swipeout] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonWidth(value: Double): this.type = set("buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: Boolean): this.type = set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: js.Array[SwipeoutAction]): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftVarargs(value: SwipeoutAction*): this.type = set("left", js.Array(value :_*))
    
    @scala.inline
    def onClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    
    @scala.inline
    def right(value: js.Array[SwipeoutAction]): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightVarargs(value: SwipeoutAction*): this.type = set("right", js.Array(value :_*))
    
    @scala.inline
    def rowID(value: Double): this.type = set("rowID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: /* value */ js.UndefOr[Boolean] => Unit): this.type = set("scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def sectionID(value: Double): this.type = set("sectionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sensitivity(value: Double): this.type = set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Swipeout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
