package typingsSlinky.wixAnimations.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translate extends js.Object {
  
  var enter: js.UndefOr[Direction | Segment] = js.native
  
  var exit: js.UndefOr[Direction | Segment] = js.native
}
object Translate {
  
  @scala.inline
  def apply(): Translate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translate]
  }
  
  @scala.inline
  implicit class TranslateOps[Self <: Translate] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: Direction | Segment): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: Direction | Segment): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
