package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSessionStorage extends js.Object {
  
  val sessionStorage: org.scalajs.dom.raw.Storage = js.native
}
object WindowSessionStorage {
  
  @scala.inline
  def apply(sessionStorage: org.scalajs.dom.raw.Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  
  @scala.inline
  implicit class WindowSessionStorageOps[Self <: org.scalajs.dom.raw.WindowSessionStorage] (val x: Self) extends AnyVal {
    
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
    def setSessionStorage(value: org.scalajs.dom.raw.Storage): Self = this.set("sessionStorage", value.asInstanceOf[js.Any])
  }
}
