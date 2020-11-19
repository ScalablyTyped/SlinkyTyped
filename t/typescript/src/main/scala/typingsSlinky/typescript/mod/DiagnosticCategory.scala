package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends js.Object
@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
  
  @js.native
  sealed trait Error extends DiagnosticCategory
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  /* 3 */ @js.native
  object Message extends TopLevel[Message with Double]
  
  @js.native
  sealed trait Suggestion extends DiagnosticCategory
  /* 2 */ @js.native
  object Suggestion extends TopLevel[Suggestion with Double]
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  /* 0 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
