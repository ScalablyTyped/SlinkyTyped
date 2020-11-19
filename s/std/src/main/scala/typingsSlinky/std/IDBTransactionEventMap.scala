package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBTransactionEventMap extends js.Object {
  
  var abort: org.scalajs.dom.raw.Event = js.native
  
  var complete: org.scalajs.dom.raw.Event = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
}
object IDBTransactionEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    complete: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event
  ): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  @scala.inline
  implicit class IDBTransactionEventMapOps[Self <: IDBTransactionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.raw.Event): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.raw.Event): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
