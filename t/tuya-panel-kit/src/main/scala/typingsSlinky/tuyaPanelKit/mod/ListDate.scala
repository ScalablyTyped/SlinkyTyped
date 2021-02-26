package typingsSlinky.tuyaPanelKit.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDate extends TYFlatListData {
  
  var Icon: js.UndefOr[ReactElement] = js.native
  
  var styles: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var value: js.Any = js.native
}
object ListDate {
  
  @scala.inline
  def apply(value: js.Any): ListDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDate]
  }
  
  @scala.inline
  implicit class ListDateMutableBuilder[Self <: ListDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: ReactElement): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    @scala.inline
    def setStyles(value: StyleProp[ViewStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesNull: Self = StObject.set(x, "styles", null)
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
