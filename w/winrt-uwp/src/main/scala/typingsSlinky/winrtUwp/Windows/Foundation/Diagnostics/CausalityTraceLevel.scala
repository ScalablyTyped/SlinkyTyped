package typingsSlinky.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CausalityTraceLevel extends StObject
/** Specifies a logging level that listeners can use for trace filtering. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityTraceLevel")
@js.native
object CausalityTraceLevel extends StObject {
  
  /** Tracks operations that are not necessary to construct a causality chain but are interesting for developers. */
  @js.native
  sealed trait important extends CausalityTraceLevel
  
  /** Indicates all operations that are necessary to construct a causality chain, including all operations for job creation and completion and work item creation and completion. */
  @js.native
  sealed trait required extends CausalityTraceLevel
  
  /** Indicates operations that influence causality but are likely to be less interesting for developers, including actions like registering progress delegates. */
  @js.native
  sealed trait verbose extends CausalityTraceLevel
}
