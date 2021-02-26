package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExitStatus extends StObject
@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus with Double] = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated extends ExitStatus
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typingsSlinky.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsGenerated with Double = js.native
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped extends ExitStatus
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typingsSlinky.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsSkipped with Double = js.native
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped extends ExitStatus
  /* 3 */ val InvalidProject_OutputsSkipped: typingsSlinky.typescript.mod.ExitStatus.InvalidProject_OutputsSkipped with Double = js.native
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped extends ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typingsSlinky.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkipped with Double = js.native
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped extends ExitStatus
  /* 4 */ val ProjectReferenceCycle_OutputsSkupped: typingsSlinky.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkupped with Double = js.native
  
  @js.native
  sealed trait Success extends ExitStatus
  /* 0 */ val Success: typingsSlinky.typescript.mod.ExitStatus.Success with Double = js.native
}
