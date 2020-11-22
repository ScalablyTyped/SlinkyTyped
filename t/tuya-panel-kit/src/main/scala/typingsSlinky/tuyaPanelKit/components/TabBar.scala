package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.mod.TabBarArr
import typingsSlinky.tuyaPanelKit.mod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  @JSImport("tuya-panel-kit", "TabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.tuyaPanelKit.mod.TabBar] {
    
    @scala.inline
    def activeColor(value: String): this.type = set("activeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKey(value: String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveIndex(value: Double): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isUnderlineCenter(value: Boolean): this.type = set("isUnderlineCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* index */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def tabActiveStyle(value: StyleProp[ViewStyle]): this.type = set("tabActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveStyleNull: this.type = set("tabActiveStyle", null)
    
    @scala.inline
    def tabActiveTextStyle(value: StyleProp[TextStyle]): this.type = set("tabActiveTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabActiveTextStyleNull: this.type = set("tabActiveTextStyle", null)
    
    @scala.inline
    def tabStyle(value: StyleProp[ViewStyle]): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabStyleNull: this.type = set("tabStyle", null)
    
    @scala.inline
    def tabTextStyle(value: StyleProp[TextStyle]): this.type = set("tabTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabTextStyleNull: this.type = set("tabTextStyle", null)
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyle(value: StyleProp[ViewStyle]): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineStyleNull: this.type = set("underlineStyle", null)
    
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: TabBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(tabs: js.Array[TabBarArr]): Builder = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabBarProps]))
  }
}
