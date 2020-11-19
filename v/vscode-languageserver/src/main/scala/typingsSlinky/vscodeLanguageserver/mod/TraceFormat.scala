package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.vscodeJsonrpc.mod.TraceFormat with String] = js.native
  
  /* "json" */ val JSON: typingsSlinky.vscodeJsonrpc.mod.TraceFormat.JSON with String = js.native
  
  /* "text" */ val Text: typingsSlinky.vscodeJsonrpc.mod.TraceFormat.Text with String = js.native
  
  def fromString(value: String): typingsSlinky.vscodeJsonrpc.mod.TraceFormat = js.native
}
