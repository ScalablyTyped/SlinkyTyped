package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbacksWithType2[T, F] extends js.Object {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ F, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.native
}
object CallbacksWithType2 {
  
  @scala.inline
  def apply[T, F](): CallbacksWithType2[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksWithType2[T, F]]
  }
  
  @scala.inline
  implicit class CallbacksWithType2Ops[Self <: CallbacksWithType2[_, _], T, F] (val x: Self with (CallbacksWithType2[T, F])) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ F => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ T => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
