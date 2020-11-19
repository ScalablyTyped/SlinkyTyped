package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.progressMod.ResultProgress
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.vscodeLanguageserver.mod._Languages because var conflicts: connection. Inlined attachWorkDoneProgress, attachPartialResultProgress */ @JSImport("vscode-languageserver", "LanguagesImpl")
@js.native
class LanguagesImpl () extends Remote {
  
  var _connection: js.Any = js.native
  
  def attachPartialResultProgress[PR](
    _type: typingsSlinky.vscodeLanguageserverProtocol.mod.ProgressType[PR],
    params: PartialResultParams
  ): js.UndefOr[ResultProgress[PR]] = js.native
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typingsSlinky.vscodeLanguageserver.progressMod.WorkDoneProgress = js.native
  
  @JSName("connection")
  def connection_MLanguagesImpl: IConnection = js.native
}
