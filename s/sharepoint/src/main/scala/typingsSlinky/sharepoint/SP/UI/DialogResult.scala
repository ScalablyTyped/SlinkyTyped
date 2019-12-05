package typingsSlinky.sharepoint.SP.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogResult extends js.Object

/** Result of a modal dialog execution */
@JSGlobal("SP.UI.DialogResult")
@js.native
object DialogResult extends js.Object {
  /** Dialog actions completed successfully */
  @js.native
  sealed trait OK extends DialogResult
  
  /** User closed dialog, cancelling the action */
  @js.native
  sealed trait cancel extends DialogResult
  
  /** Do not use this */
  @js.native
  sealed trait invalid extends DialogResult
  
  /* 2 */ val OK: typingsSlinky.sharepoint.SP.UI.DialogResult.OK with Double = js.native
  /* 1 */ val cancel: typingsSlinky.sharepoint.SP.UI.DialogResult.cancel with Double = js.native
  /* 0 */ val invalid: typingsSlinky.sharepoint.SP.UI.DialogResult.invalid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogResult with Double] = js.native
}

