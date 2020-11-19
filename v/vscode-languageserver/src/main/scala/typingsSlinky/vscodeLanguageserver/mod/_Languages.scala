package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.progressMod.ResultProgress
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Languages extends js.Object {
  
  def attachPartialResultProgress[PR](
    `type`: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[PR],
    params: PartialResultParams
  ): js.UndefOr[ResultProgress[PR]] = js.native
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typingsSlinky.vscodeLanguageserver.progressMod.WorkDoneProgress = js.native
  
  var connection: IConnection = js.native
}
object _Languages {
  
  @scala.inline
  def apply(
    attachPartialResultProgress: (typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[js.Any], PartialResultParams) => js.UndefOr[ResultProgress[js.Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => typingsSlinky.vscodeLanguageserver.progressMod.WorkDoneProgress,
    connection: IConnection
  ): _Languages = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Languages]
  }
  
  @scala.inline
  implicit class _LanguagesOps[Self <: _Languages] (val x: Self) extends AnyVal {
    
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
    def setAttachPartialResultProgress(
      value: (typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[js.Any], PartialResultParams) => js.UndefOr[ResultProgress[js.Any]]
    ): Self = this.set("attachPartialResultProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachWorkDoneProgress(value: WorkDoneProgressParams => typingsSlinky.vscodeLanguageserver.progressMod.WorkDoneProgress): Self = this.set("attachWorkDoneProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnection(value: IConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
  }
}
