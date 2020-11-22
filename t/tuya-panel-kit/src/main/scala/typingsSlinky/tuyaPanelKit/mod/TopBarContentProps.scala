package typingsSlinky.tuyaPanelKit.mod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.left
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopBarContentProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var position: js.UndefOr[left | center | right] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var subTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object TopBarContentProps {
  
  @scala.inline
  def apply(): TopBarContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopBarContentProps]
  }
  
  @scala.inline
  implicit class TopBarContentPropsOps[Self <: TopBarContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setPosition(value: left | center | right): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setSubTitleStyle(value: StyleProp[TextStyle]): Self = this.set("subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleStyle: Self = this.set("subTitleStyle", js.undefined)
    
    @scala.inline
    def setSubTitleStyleNull: Self = this.set("subTitleStyle", null)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
  }
}
