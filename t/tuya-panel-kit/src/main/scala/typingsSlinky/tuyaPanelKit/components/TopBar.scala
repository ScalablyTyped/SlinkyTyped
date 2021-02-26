package typingsSlinky.tuyaPanelKit.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.Color
import typingsSlinky.tuyaPanelKit.mod.TopBarActionProps
import typingsSlinky.tuyaPanelKit.mod.TopBarProps
import typingsSlinky.tuyaPanelKit.themeMod.BackgroundProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TopBar {
  
  @JSImport("tuya-panel-kit", "TopBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.TopBar] {
    
    @scala.inline
    def actions(value: js.Array[TopBarActionProps]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsVarargs(value: TopBarActionProps*): this.type = set("actions", js.Array(value :_*))
    
    @scala.inline
    def background(value: BackgroundProps): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyleNull: this.type = set("contentStyle", null)
    
    @scala.inline
    def leftActions(value: js.Array[TopBarActionProps]): this.type = set("leftActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftActionsVarargs(value: TopBarActionProps*): this.type = set("leftActions", js.Array(value :_*))
    
    @scala.inline
    def onBack(value: /* repeated */ js.Any => Unit): this.type = set("onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def position(value: left | center | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def subTitle(value: String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleStyle(value: StyleProp[TextStyle]): this.type = set("subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleStyleNull: this.type = set("subTitleStyle", null)
    
    @scala.inline
    def theme(value: Color): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
  }
  
  implicit def make(companion: TopBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TopBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
