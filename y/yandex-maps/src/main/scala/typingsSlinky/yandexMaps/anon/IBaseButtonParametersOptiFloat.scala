package typingsSlinky.yandexMaps.anon

import typingsSlinky.yandexMaps.mod.IClassConstructor
import typingsSlinky.yandexMaps.mod.ISelectableControlLayout
import typingsSlinky.yandexMaps.yandexMapsStrings.left
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import typingsSlinky.yandexMaps.yandexMapsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yandex-maps.yandex-maps.control.IBaseButtonParametersOptions & {  noPlacemark :boolean | undefined} */
@js.native
trait IBaseButtonParametersOptiFloat extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  
  var float: js.UndefOr[none | left | right] = js.native
  
  var floatIndex: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.native
  
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.native
  
  var noPlacemark: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object IBaseButtonParametersOptiFloat {
  
  @scala.inline
  def apply(): IBaseButtonParametersOptiFloat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonParametersOptiFloat]
  }
  
  @scala.inline
  implicit class IBaseButtonParametersOptiFloatMutableBuilder[Self <: IBaseButtonParametersOptiFloat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    @scala.inline
    def setFloat(value: none | left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setLayout(value: IClassConstructor[ISelectableControlLayout] | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setNoPlacemark(value: Boolean): Self = StObject.set(x, "noPlacemark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoPlacemarkUndefined: Self = StObject.set(x, "noPlacemark", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
