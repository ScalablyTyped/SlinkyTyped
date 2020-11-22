package typingsSlinky.tizenAccessory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onprogress extends js.Object {
  
  var oncomplete: js.UndefOr[js.Function2[/* id */ String, /* localPath */ String, Unit]] = js.native
  
  var onerror: js.UndefOr[js.Function2[/* errorCode */ String, /* id */ String, Unit]] = js.native
  
  var onprogress: js.UndefOr[js.Function2[/* id */ String, /* progress */ Double, Unit]] = js.native
  
  var onreceive: js.UndefOr[js.Function2[/* id */ String, /* fileName */ String, Unit]] = js.native
}
object Onprogress {
  
  @scala.inline
  def apply(): Onprogress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onprogress]
  }
  
  @scala.inline
  implicit class OnprogressOps[Self <: Onprogress] (val x: Self) extends AnyVal {
    
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
    def setOncomplete(value: (/* id */ String, /* localPath */ String) => Unit): Self = this.set("oncomplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOncomplete: Self = this.set("oncomplete", js.undefined)
    
    @scala.inline
    def setOnerror(value: (/* errorCode */ String, /* id */ String) => Unit): Self = this.set("onerror", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnprogress(value: (/* id */ String, /* progress */ Double) => Unit): Self = this.set("onprogress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    
    @scala.inline
    def setOnreceive(value: (/* id */ String, /* fileName */ String) => Unit): Self = this.set("onreceive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnreceive: Self = this.set("onreceive", js.undefined)
  }
}
