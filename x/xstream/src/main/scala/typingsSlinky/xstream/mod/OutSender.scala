package typingsSlinky.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutSender[T] extends js.Object {
  
  var out: Stream[T] = js.native
}
object OutSender {
  
  @scala.inline
  def apply[T](out: Stream[T]): OutSender[T] = {
    val __obj = js.Dynamic.literal(out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutSender[T]]
  }
  
  @scala.inline
  implicit class OutSenderOps[Self <: OutSender[_], T] (val x: Self with OutSender[T]) extends AnyVal {
    
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
    def setOut(value: Stream[T]): Self = this.set("out", value.asInstanceOf[js.Any])
  }
}
