package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgress")
@js.native
object WorkDoneProgress extends js.Object {
  
  val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}
