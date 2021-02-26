package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypeQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventTypeQueryFlags")
@js.native
object EventTypeQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeQueryFlags with Double] = js.native
  
  /**
    * IncludeFields will include all fields and their types
    */
  @js.native
  sealed trait IncludeFields extends EventTypeQueryFlags
  /* 1 */ val IncludeFields: typingsSlinky.vsoNodeApi.notificationInterfacesMod.EventTypeQueryFlags.IncludeFields with Double = js.native
  
  @js.native
  sealed trait None extends EventTypeQueryFlags
  /* 0 */ val None: typingsSlinky.vsoNodeApi.notificationInterfacesMod.EventTypeQueryFlags.None with Double = js.native
}
