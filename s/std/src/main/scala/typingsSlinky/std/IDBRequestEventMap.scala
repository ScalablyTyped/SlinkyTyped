package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBRequestEventMap extends js.Object {
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var success: org.scalajs.dom.raw.Event = js.native
}
object IDBRequestEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event, success: org.scalajs.dom.raw.Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
  
  @scala.inline
  implicit class IDBRequestEventMapOps[Self <: IDBRequestEventMap] (val x: Self) extends AnyVal {
    
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
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: org.scalajs.dom.raw.Event): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
