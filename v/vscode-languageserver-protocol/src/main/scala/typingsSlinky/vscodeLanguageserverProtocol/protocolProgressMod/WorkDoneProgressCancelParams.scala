package typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkDoneProgressCancelParams extends js.Object {
  
  /**
    * The token to be used to report progress.
    */
  var token: ProgressToken = js.native
}
object WorkDoneProgressCancelParams {
  
  @scala.inline
  def apply(token: ProgressToken): WorkDoneProgressCancelParams = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressCancelParams]
  }
  
  @scala.inline
  implicit class WorkDoneProgressCancelParamsOps[Self <: WorkDoneProgressCancelParams] (val x: Self) extends AnyVal {
    
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
    def setToken(value: ProgressToken): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
