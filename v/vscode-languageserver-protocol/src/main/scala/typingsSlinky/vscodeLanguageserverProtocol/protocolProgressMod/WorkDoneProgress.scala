package typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgress")
@js.native
object WorkDoneProgress extends js.Object {
  
  val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}
