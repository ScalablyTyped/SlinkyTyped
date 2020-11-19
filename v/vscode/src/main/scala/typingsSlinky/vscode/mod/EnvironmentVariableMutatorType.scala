package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentVariableMutatorType extends js.Object
@JSImport("vscode", "EnvironmentVariableMutatorType")
@js.native
object EnvironmentVariableMutatorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentVariableMutatorType with Double] = js.native
  
  /**
    * Append to the end of the variable's existing value.
    */
  @js.native
  sealed trait Append extends EnvironmentVariableMutatorType
  /* 2 */ @js.native
  object Append extends TopLevel[Append with Double]
  
  /**
    * Prepend to the start of the variable's existing value.
    */
  @js.native
  sealed trait Prepend extends EnvironmentVariableMutatorType
  /* 3 */ @js.native
  object Prepend extends TopLevel[Prepend with Double]
  
  /**
    * Replace the variable's existing value.
    */
  @js.native
  sealed trait Replace extends EnvironmentVariableMutatorType
  /* 1 */ @js.native
  object Replace extends TopLevel[Replace with Double]
}
