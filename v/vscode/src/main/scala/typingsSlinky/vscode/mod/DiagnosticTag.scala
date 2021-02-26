package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticTag extends StObject
@JSImport("vscode", "DiagnosticTag")
@js.native
object DiagnosticTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticTag with Double] = js.native
  
  /**
    * Deprecated or obsolete code.
    *
    * Diagnostics with this tag are rendered with a strike through.
    */
  @js.native
  sealed trait Deprecated extends DiagnosticTag
  /* 2 */ val Deprecated: typingsSlinky.vscode.mod.DiagnosticTag.Deprecated with Double = js.native
  
  /**
    * Unused or unnecessary code.
    *
    * Diagnostics with this tag are rendered faded out. The amount of fading
    * is controlled by the `"editorUnnecessaryCode.opacity"` theme color. For
    * example, `"editorUnnecessaryCode.opacity": "#000000c0"` will render the
    * code with 75% opacity. For high contrast themes, use the
    * `"editorUnnecessaryCode.border"` theme color to underline unnecessary code
    * instead of fading it out.
    */
  @js.native
  sealed trait Unnecessary extends DiagnosticTag
  /* 1 */ val Unnecessary: typingsSlinky.vscode.mod.DiagnosticTag.Unnecessary with Double = js.native
}
