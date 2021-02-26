package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.RosterItem
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster data received
  */
@js.native
trait RosterReceived extends VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    Array contains VoxImplant.RosterItem elements
    */
  var roster: js.Array[RosterItem] = js.native
}
object RosterReceived {
  
  @scala.inline
  def apply(id: String, roster: js.Array[RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterReceived]
  }
  
  @scala.inline
  implicit class RosterReceivedMutableBuilder[Self <: RosterReceived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoster(value: js.Array[RosterItem]): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRosterVarargs(value: RosterItem*): Self = StObject.set(x, "roster", js.Array(value :_*))
  }
}
