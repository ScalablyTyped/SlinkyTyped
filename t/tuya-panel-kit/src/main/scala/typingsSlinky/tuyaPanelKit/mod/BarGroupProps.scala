package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.divide
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.large
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.small
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.swiper
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.warp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGroupProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var size: js.UndefOr[large | normal | small | Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var swiperConfig: js.UndefOr[CarouselProps] = js.native
  
  var `type`: js.UndefOr[warp | swiper | divide] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object BarGroupProps {
  
  @scala.inline
  def apply(): BarGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGroupProps]
  }
  
  @scala.inline
  implicit class BarGroupPropsOps[Self <: BarGroupProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwiperConfig(value: CarouselProps): Self = this.set("swiperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwiperConfig: Self = this.set("swiperConfig", js.undefined)
    
    @scala.inline
    def setType(value: warp | swiper | divide): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
