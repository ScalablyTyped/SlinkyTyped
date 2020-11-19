package typingsSlinky.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressNotices.mod.URLAction
  - typingsSlinky.wordpressNotices.mod.CallbackAction
*/
trait Action extends js.Object
object Action {
  
  @scala.inline
  def URLAction(label: String, url: String): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  def CallbackAction(callback: () => Unit, label: String): Action = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}
