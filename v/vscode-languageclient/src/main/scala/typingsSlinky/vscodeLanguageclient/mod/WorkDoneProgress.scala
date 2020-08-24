package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "WorkDoneProgress")
@js.native
object WorkDoneProgress extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

