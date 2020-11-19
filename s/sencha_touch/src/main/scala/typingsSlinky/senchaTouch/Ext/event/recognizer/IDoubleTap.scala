package typingsSlinky.senchaTouch.Ext.event.recognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDoubleTap extends IRecognizer {
  
  /** [Method] Returns the value of maxDuration
    * @returns Number
    */
  var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of maxDuration
    * @param maxDuration Number The new value.
    */
  var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.native
}
object IDoubleTap {
  
  @scala.inline
  def apply(): IDoubleTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoubleTap]
  }
  
  @scala.inline
  implicit class IDoubleTapOps[Self <: IDoubleTap] (val x: Self) extends AnyVal {
    
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
    def setGetMaxDuration(value: () => Double): Self = this.set("getMaxDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxDuration: Self = this.set("getMaxDuration", js.undefined)
    
    @scala.inline
    def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = this.set("setMaxDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxDuration: Self = this.set("setMaxDuration", js.undefined)
  }
}
