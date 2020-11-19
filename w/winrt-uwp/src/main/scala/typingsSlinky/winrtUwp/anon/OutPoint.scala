package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutPoint extends js.Object {
  
  /** The transformed input point. */ var outPoint: Point = js.native
  
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: Boolean = js.native
}
object OutPoint {
  
  @scala.inline
  def apply(outPoint: Point, returnValue: Boolean): OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPoint]
  }
  
  @scala.inline
  implicit class OutPointOps[Self <: OutPoint] (val x: Self) extends AnyVal {
    
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
    def setOutPoint(value: Point): Self = this.set("outPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
