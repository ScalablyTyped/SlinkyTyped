package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the background task about a new message. */
@js.native
trait RcsEndUserMessageAvailableTriggerDetails extends StObject {
  
  /** Gets the text of the new message. */
  var text: String = js.native
  
  /** Gets the title of the new message. */
  var title: String = js.native
}
object RcsEndUserMessageAvailableTriggerDetails {
  
  @scala.inline
  def apply(text: String, title: String): RcsEndUserMessageAvailableTriggerDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableTriggerDetails]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageAvailableTriggerDetailsMutableBuilder[Self <: RcsEndUserMessageAvailableTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
