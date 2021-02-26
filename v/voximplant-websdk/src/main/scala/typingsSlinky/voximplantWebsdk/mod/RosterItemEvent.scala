package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RosterItemEvent extends StObject
@JSImport("voximplant-websdk", "RosterItemEvent")
@js.native
object RosterItemEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RosterItemEvent with Double] = js.native
  
  /**
    *    Roster item added
    */
  @js.native
  sealed trait Added extends RosterItemEvent
  /* 0 */ val Added: typingsSlinky.voximplantWebsdk.mod.RosterItemEvent.Added with Double = js.native
  
  /**
    *    Roster item removed
    */
  @js.native
  sealed trait Removed extends RosterItemEvent
  /* 1 */ val Removed: typingsSlinky.voximplantWebsdk.mod.RosterItemEvent.Removed with Double = js.native
  
  /**
    *    User subscribed on your status updates (authorized the request)
    */
  @js.native
  sealed trait Subscribed extends RosterItemEvent
  /* 2 */ val Subscribed: typingsSlinky.voximplantWebsdk.mod.RosterItemEvent.Subscribed with Double = js.native
  
  /**
    *    User unsubscribed from your status updates (didn't authorize the request)
    */
  @js.native
  sealed trait Unsubscribed extends RosterItemEvent
  /* 3 */ val Unsubscribed: typingsSlinky.voximplantWebsdk.mod.RosterItemEvent.Unsubscribed with Double = js.native
  
  /**
    *    Roster item updated
    */
  @js.native
  sealed trait Updated extends RosterItemEvent
  /* 4 */ val Updated: typingsSlinky.voximplantWebsdk.mod.RosterItemEvent.Updated with Double = js.native
}
