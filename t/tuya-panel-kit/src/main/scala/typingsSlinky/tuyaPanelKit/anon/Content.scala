package typingsSlinky.tuyaPanelKit.anon

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var container: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var content: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentCenter: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentLeft: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentRight: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var subTitle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object Content {
  
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContent(value: StyleProp[ViewStyle]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCenter(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCenterNull: Self = StObject.set(x, "contentCenter", null)
    
    @scala.inline
    def setContentCenterUndefined: Self = StObject.set(x, "contentCenter", js.undefined)
    
    @scala.inline
    def setContentLeft(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLeftNull: Self = StObject.set(x, "contentLeft", null)
    
    @scala.inline
    def setContentLeftUndefined: Self = StObject.set(x, "contentLeft", js.undefined)
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentRight(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRightNull: Self = StObject.set(x, "contentRight", null)
    
    @scala.inline
    def setContentRightUndefined: Self = StObject.set(x, "contentRight", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setSubTitle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: StyleProp[TextStyle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
