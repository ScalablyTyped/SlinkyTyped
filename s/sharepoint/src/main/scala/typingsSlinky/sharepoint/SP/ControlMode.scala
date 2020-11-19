package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
