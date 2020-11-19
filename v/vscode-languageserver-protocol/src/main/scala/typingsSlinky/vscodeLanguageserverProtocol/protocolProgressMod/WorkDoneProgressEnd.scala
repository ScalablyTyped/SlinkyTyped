package typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkDoneProgressEnd extends js.Object {
  
  var kind: end = js.native
  
  /**
    * Optional, a final message indicating to for example indicate the outcome
    * of the operation.
    */
  var message: js.UndefOr[String] = js.native
}
object WorkDoneProgressEnd {
  
  @scala.inline
  def apply(kind: end): WorkDoneProgressEnd = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressEnd]
  }
  
  @scala.inline
  implicit class WorkDoneProgressEndOps[Self <: WorkDoneProgressEnd] (val x: Self) extends AnyVal {
    
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
    def setKind(value: end): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
