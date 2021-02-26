package typingsSlinky.wordpressCustomizeBrowser

import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.wordpressCustomizeBrowser.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayNotificationMod {
  
  @JSImport("@wordpress/customize-browser/OverlayNotification", "OverlayNotification")
  @js.native
  class OverlayNotification protected () extends Notification {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def handleEscape(event: Event): Unit = js.native
    
    var loading: Boolean = js.native
  }
}
