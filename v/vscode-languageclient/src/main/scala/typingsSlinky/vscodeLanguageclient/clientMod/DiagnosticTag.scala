package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientNumbers.`1`
import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "DiagnosticTag")
@js.native
object DiagnosticTag extends js.Object {
  
  /**
    * Deprecated or obsolete code.
    *
    * Clients are allowed to rendered diagnostics with this tag strike through.
    */
  val Deprecated: `2` = js.native
  
  /**
    * Unused or unnecessary code.
    *
    * Clients are allowed to render diagnostics with this tag faded out instead of having
    * an error squiggle.
    */
  val Unnecessary: `1` = js.native
}
