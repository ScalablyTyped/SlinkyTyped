package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends StObject
@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
  
  @js.native
  sealed trait Error extends DiagnosticCategory
  /* 1 */ val Error: typingsSlinky.typescript.mod.DiagnosticCategory.Error with Double = js.native
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  /* 3 */ val Message: typingsSlinky.typescript.mod.DiagnosticCategory.Message with Double = js.native
  
  @js.native
  sealed trait Suggestion extends DiagnosticCategory
  /* 2 */ val Suggestion: typingsSlinky.typescript.mod.DiagnosticCategory.Suggestion with Double = js.native
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  /* 0 */ val Warning: typingsSlinky.typescript.mod.DiagnosticCategory.Warning with Double = js.native
}
