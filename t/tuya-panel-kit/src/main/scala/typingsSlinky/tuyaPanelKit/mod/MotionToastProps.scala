package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.tuyaPanelKit.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tuya-panel-kit.tuya-panel-kit.MotionProps, 'onHide'> */
@js.native
trait MotionToastProps extends js.Object {
  
  var animationConfig: js.UndefOr[Delay] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var hideDuration: js.UndefOr[Double] = js.native
  
  var initScale: js.UndefOr[Double] = js.native
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showDuration: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object MotionToastProps {
  
  @scala.inline
  def apply(): MotionToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionToastProps]
  }
  
  @scala.inline
  implicit class MotionToastPropsOps[Self <: MotionToastProps] (val x: Self) extends AnyVal {
    
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
    def setAnimationConfig(value: Delay): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHideDuration(value: Double): Self = this.set("hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDuration: Self = this.set("hideDuration", js.undefined)
    
    @scala.inline
    def setInitScale(value: Double): Self = this.set("initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitScale: Self = this.set("initScale", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowDuration(value: Double): Self = this.set("showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDuration: Self = this.set("showDuration", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
