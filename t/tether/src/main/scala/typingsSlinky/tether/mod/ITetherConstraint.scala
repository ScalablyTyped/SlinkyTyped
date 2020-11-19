package typingsSlinky.tether.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITetherConstraint extends js.Object {
  
  var attachment: js.UndefOr[String] = js.native
  
  var outOfBoundsClass: js.UndefOr[String] = js.native
  
  var pin: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var pinnedClass: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String | HTMLElement | js.Array[Double]] = js.native
}
object ITetherConstraint {
  
  @scala.inline
  def apply(): ITetherConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITetherConstraint]
  }
  
  @scala.inline
  implicit class ITetherConstraintOps[Self <: ITetherConstraint] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: String): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setOutOfBoundsClass(value: String): Self = this.set("outOfBoundsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutOfBoundsClass: Self = this.set("outOfBoundsClass", js.undefined)
    
    @scala.inline
    def setPinVarargs(value: String*): Self = this.set("pin", js.Array(value :_*))
    
    @scala.inline
    def setPin(value: Boolean | js.Array[String]): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    
    @scala.inline
    def setPinnedClass(value: String): Self = this.set("pinnedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinnedClass: Self = this.set("pinnedClass", js.undefined)
    
    @scala.inline
    def setToVarargs(value: Double*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setToHTMLElement(value: HTMLElement): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String | HTMLElement | js.Array[Double]): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
