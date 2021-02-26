package typingsSlinky.scrollmagic.mod

import typingsSlinky.scrollmagic.scrollmagicStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestroyEvent extends Event[destroy] {
  
  val reset: Boolean = js.native
}
object DestroyEvent {
  
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    reset: Boolean,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: destroy
  ): DestroyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyEvent]
  }
  
  @scala.inline
  implicit class DestroyEventMutableBuilder[Self <: DestroyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
