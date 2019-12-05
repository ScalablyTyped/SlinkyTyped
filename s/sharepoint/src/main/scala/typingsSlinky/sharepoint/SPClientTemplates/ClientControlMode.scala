package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientControlMode extends js.Object

@JSGlobal("SPClientTemplates.ClientControlMode")
@js.native
object ClientControlMode extends js.Object {
  @js.native
  sealed trait DisplayForm extends ClientControlMode
  
  @js.native
  sealed trait EditForm extends ClientControlMode
  
  @js.native
  sealed trait Invalid extends ClientControlMode
  
  @js.native
  sealed trait NewForm extends ClientControlMode
  
  @js.native
  sealed trait View extends ClientControlMode
  
  /* 1 */ val DisplayForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.DisplayForm with Double = js.native
  /* 2 */ val EditForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.EditForm with Double = js.native
  /* 0 */ val Invalid: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.Invalid with Double = js.native
  /* 3 */ val NewForm: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.NewForm with Double = js.native
  /* 4 */ val View: typingsSlinky.sharepoint.SPClientTemplates.ClientControlMode.View with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientControlMode with Double] = js.native
}

