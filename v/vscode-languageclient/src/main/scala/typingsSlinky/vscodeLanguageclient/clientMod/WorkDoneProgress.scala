package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkDoneProgress {
  
  @JSImport("vscode-languageclient/lib/client", "WorkDoneProgress.type")
  @js.native
  val `type`: typingsSlinky.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}
