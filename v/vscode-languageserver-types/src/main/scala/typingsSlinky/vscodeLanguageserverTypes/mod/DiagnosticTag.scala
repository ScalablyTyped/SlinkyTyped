package typingsSlinky.vscodeLanguageserverTypes.mod

import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  - typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
*/
trait DiagnosticTag extends StObject
object DiagnosticTag {
  
  /**
    * Deprecated or obsolete code.
    *
    * Clients are allowed to rendered diagnostics with this tag strike through.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticTag.Deprecated")
  @js.native
  val Deprecated: `2` = js.native
  
  /**
    * Unused or unnecessary code.
    *
    * Clients are allowed to render diagnostics with this tag faded out instead of having
    * an error squiggle.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticTag.Unnecessary")
  @js.native
  val Unnecessary: `1` = js.native
}
