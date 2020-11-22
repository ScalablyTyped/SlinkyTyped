package typingsSlinky.tuyaPanelKit.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.Easing
import typingsSlinky.tuyaPanelKit.mod.TabDataSource
import typingsSlinky.tuyaPanelKit.mod.TabsProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("tuya-panel-kit", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Tabs] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKey(value: Double | String): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationConfig(value: Easing): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: Double | String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraSpace(value: Double): this.type = set("extraSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxItem(value: Double): this.type = set("maxItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* tab */ TabDataSource, /* idx */ Double) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def preload(value: Boolean): this.type = set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preloadTimeout(value: Double): this.type = set("preloadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderPlaceholder(value: (/* activeIndex */ Double, /* child */ ReactElement) => ReactElement): this.type = set("renderPlaceholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveStyle(value: StyleProp[ViewStyle]): this.type = set("tabActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveStyleNull: this.type = set("tabActiveStyle", null)
    
    @scala.inline
    def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    @scala.inline
    def tabContentStyle(value: StyleProp[ViewStyle]): this.type = set("tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabContentStyleNull: this.type = set("tabContentStyle", null)
    
    @scala.inline
    def tabPosition(value: top | bottom): this.type = set("tabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyleNull: this.type = set("tabStyle", null)
    
    @scala.inline
    def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    @scala.inline
    def underlineStyle(value: StyleProp[ViewStyle]): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyleNull: this.type = set("underlineStyle", null)
    
    @scala.inline
    def underlineWidth(value: Double): this.type = set("underlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def velocityThreshold(value: Double): this.type = set("velocityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(dataSource: js.Array[TabDataSource]): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
}
