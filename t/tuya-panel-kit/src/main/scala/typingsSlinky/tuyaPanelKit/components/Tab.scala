package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.TabProps
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("tuya-panel-kit", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.Tab] {
    
    @scala.inline
    def activeKey(value: String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def distanceToChangeTab(value: Double): this.type = set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* activeKey */ js.UndefOr[Double | String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    @scala.inline
    def tabBarBackgroundColor(value: String): this.type = set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarPosition(value: top | bottom): this.type = set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarStyleNull: this.type = set("tabBarStyle", null)
    
    @scala.inline
    def tabBarUnderlineStyle(value: StyleProp[ViewStyle]): this.type = set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabBarUnderlineStyleNull: this.type = set("tabBarUnderlineStyle", null)
    
    @scala.inline
    def tabContentStyle(value: StyleProp[ViewStyle]): this.type = set("tabContentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabContentStyleNull: this.type = set("tabContentStyle", null)
    
    @scala.inline
    def tabDefaultColor(value: String): this.type = set("tabDefaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabNavAccessibilityLabel(value: String): this.type = set("tabNavAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyleNull: this.type = set("tabStyle", null)
    
    @scala.inline
    def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    @scala.inline
    def tabsContainerStyle(value: StyleProp[ViewStyle]): this.type = set("tabsContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabsContainerStyleNull: this.type = set("tabsContainerStyle", null)
    
    @scala.inline
    def useViewPagerOnAndroid(value: Boolean): this.type = set("useViewPagerOnAndroid", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
