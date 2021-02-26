package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintTaskCompletion extends StObject
/** Specifies the completion status of a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends StObject {
  
  /** An abandoned print task. */
  @js.native
  sealed trait abandoned extends PrintTaskCompletion
  
  /** A canceled print task. */
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  /** A failed print task. */
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  /** A submitted print task. */
  @js.native
  sealed trait submitted extends PrintTaskCompletion
}
