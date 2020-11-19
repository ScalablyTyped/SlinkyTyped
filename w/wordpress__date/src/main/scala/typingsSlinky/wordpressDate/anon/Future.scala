package typingsSlinky.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Future extends js.Object {
  
  var future: String = js.native
  
  var past: String = js.native
}
object Future {
  
  @scala.inline
  def apply(future: String, past: String): Future = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Future]
  }
  
  @scala.inline
  implicit class FutureOps[Self <: Future] (val x: Self) extends AnyVal {
    
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
    def setFuture(value: String): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast(value: String): Self = this.set("past", value.asInstanceOf[js.Any])
  }
}
