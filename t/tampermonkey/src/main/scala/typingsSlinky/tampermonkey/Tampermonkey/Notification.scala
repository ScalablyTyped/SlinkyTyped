package typingsSlinky.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
  /** Flag whether to highlight the tab that sends the notification */
  var highlight: js.UndefOr[Boolean] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  /**
    * Called when the notification is closed (no matter if this was
    * triggered by a timeout or a click) or the tab was highlighted
    */
  var onclick: js.UndefOr[NotificationOnClick] = js.native
  
  /** Called in case the user clicks the notification */
  var ondone: js.UndefOr[NotificationOnDone] = js.native
  
  /** Text of the notification (optional if highlight is set) */
  var text: js.UndefOr[String] = js.native
  
  /** Time after that the notification will be hidden. `0` = disabled */
  var timeout: js.UndefOr[Double] = js.native
  
  /** Notification title. If not specified the script name is used */
  var title: js.UndefOr[String] = js.native
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOnclick(value: NotificationOnClick): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOndone(value: NotificationOnDone): Self = StObject.set(x, "ondone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndoneUndefined: Self = StObject.set(x, "ondone", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
