package typingsSlinky.setLink.mod.expressServeStaticCoreAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  def setLink(link: String, rel: String): Unit = js.native
}
object Response {
  
  @scala.inline
  def apply(setLink: (String, String) => Unit): Response = {
    val __obj = js.Dynamic.literal(setLink = js.Any.fromFunction2(setLink))
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setSetLink(value: (String, String) => Unit): Self = this.set("setLink", js.Any.fromFunction2(value))
  }
}
