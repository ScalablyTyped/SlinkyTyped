package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListDataValidationFailureReason extends js.Object

@JSGlobal("SP.ListDataValidationFailureReason")
@js.native
object ListDataValidationFailureReason extends js.Object {
  @js.native
  sealed trait dataFailure extends ListDataValidationFailureReason
  
  @js.native
  sealed trait formulaError extends ListDataValidationFailureReason
  
  /* 0 */ val dataFailure: typingsSlinky.sharepoint.SP.ListDataValidationFailureReason.dataFailure with Double = js.native
  /* 1 */ val formulaError: typingsSlinky.sharepoint.SP.ListDataValidationFailureReason.formulaError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListDataValidationFailureReason with Double] = js.native
}

