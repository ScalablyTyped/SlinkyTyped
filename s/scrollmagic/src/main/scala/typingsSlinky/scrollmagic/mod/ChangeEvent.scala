package typingsSlinky.scrollmagic.mod

import typingsSlinky.scrollmagic.scrollmagicStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEvent extends Event[change] {
  
  val newval: js.Any = js.native
  
  val what: String = js.native
}
object ChangeEvent {
  
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    newval: js.Any,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: change,
    what: String
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], newval = newval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewval(value: js.Any): Self = StObject.set(x, "newval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
  }
}
