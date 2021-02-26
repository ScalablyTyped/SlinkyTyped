package typingsSlinky.tuyaPanelKit.mod

import typingsSlinky.reactNative.mod.DefaultSectionT
import typingsSlinky.reactNative.mod.SectionListData
import typingsSlinky.reactNative.mod.SectionListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYSectionListProps extends SectionListProps[SectionDataProps, DefaultSectionT] {
  
  var contentContainStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var sectionListRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var useART: js.UndefOr[Boolean] = js.native
}
object TYSectionListProps {
  
  @scala.inline
  def apply(sections: js.Array[SectionListData[SectionDataProps, DefaultSectionT]]): TYSectionListProps = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYSectionListProps]
  }
  
  @scala.inline
  implicit class TYSectionListPropsMutableBuilder[Self <: TYSectionListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentContainStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainStyleNull: Self = StObject.set(x, "contentContainStyle", null)
    
    @scala.inline
    def setContentContainStyleUndefined: Self = StObject.set(x, "contentContainStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setSectionListRef(value: () => Unit): Self = StObject.set(x, "sectionListRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSectionListRefUndefined: Self = StObject.set(x, "sectionListRef", js.undefined)
    
    @scala.inline
    def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
    
    @scala.inline
    def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    
    @scala.inline
    def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
  }
}
