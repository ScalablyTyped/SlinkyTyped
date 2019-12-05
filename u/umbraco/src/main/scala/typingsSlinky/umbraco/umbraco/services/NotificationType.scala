package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationType extends js.Object

/**
  * Notification Type
  */
@JSGlobal("umbraco.services.NotificationType")
@js.native
object NotificationType extends js.Object {
  @js.native
  sealed trait error extends NotificationType
  
  @js.native
  sealed trait info extends NotificationType
  
  @js.native
  sealed trait success extends NotificationType
  
  @js.native
  sealed trait warning extends NotificationType
  
  /* 1 */ val error: typingsSlinky.umbraco.umbraco.services.NotificationType.error with Double = js.native
  /* 3 */ val info: typingsSlinky.umbraco.umbraco.services.NotificationType.info with Double = js.native
  /* 0 */ val success: typingsSlinky.umbraco.umbraco.services.NotificationType.success with Double = js.native
  /* 2 */ val warning: typingsSlinky.umbraco.umbraco.services.NotificationType.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationType with Double] = js.native
}

