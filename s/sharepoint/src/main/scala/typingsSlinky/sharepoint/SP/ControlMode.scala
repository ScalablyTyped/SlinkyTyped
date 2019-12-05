package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlMode extends js.Object

/** Represents display mode for a control or form */
@JSGlobal("SP.ControlMode")
@js.native
object ControlMode extends js.Object {
  @js.native
  sealed trait displayMode extends ControlMode
  
  @js.native
  sealed trait editMode extends ControlMode
  
  @js.native
  sealed trait invalid extends ControlMode
  
  @js.native
  sealed trait newMode extends ControlMode
  
  /* 1 */ val displayMode: typingsSlinky.sharepoint.SP.ControlMode.displayMode with Double = js.native
  /* 2 */ val editMode: typingsSlinky.sharepoint.SP.ControlMode.editMode with Double = js.native
  /* 0 */ val invalid: typingsSlinky.sharepoint.SP.ControlMode.invalid with Double = js.native
  /* 3 */ val newMode: typingsSlinky.sharepoint.SP.ControlMode.newMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlMode with Double] = js.native
}

