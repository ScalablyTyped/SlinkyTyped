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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopBarContentProps extends StObject {
  
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
  implicit class TopBarContentPropsMutableBuilder[Self <: TopBarContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPosition(value: left | center | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyleNull: Self = StObject.set(x, "subTitleStyle", null)
    
    @scala.inline
    def setSubTitleStyleUndefined: Self = StObject.set(x, "subTitleStyle", js.undefined)
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
