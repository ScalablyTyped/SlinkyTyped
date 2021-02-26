package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationOperation extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationOperation")
@js.native
object NotificationOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationOperation with Double] = js.native
  
  @js.native
  sealed trait None extends NotificationOperation
  /* 0 */ val None: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationOperation.None with Double = js.native
  
  @js.native
  sealed trait SuspendUnprocessed extends NotificationOperation
  /* 1 */ val SuspendUnprocessed: typingsSlinky.vsoNodeApi.notificationInterfacesMod.NotificationOperation.SuspendUnprocessed with Double = js.native
}
