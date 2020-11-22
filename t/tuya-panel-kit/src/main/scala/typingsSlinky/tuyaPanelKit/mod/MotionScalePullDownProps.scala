package typingsSlinky.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionScalePullDownProps extends MotionProps {
  
  var initScale: js.UndefOr[Double] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
}
object MotionScalePullDownProps {
  
  @scala.inline
  def apply(): MotionScalePullDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScalePullDownProps]
  }
  
  @scala.inline
  implicit class MotionScalePullDownPropsOps[Self <: MotionScalePullDownProps] (val x: Self) extends AnyVal {
    
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
    def setInitScale(value: Double): Self = this.set("initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitScale: Self = this.set("initScale", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = this.set("isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlign: Self = this.set("isAlign", js.undefined)
  }
}
