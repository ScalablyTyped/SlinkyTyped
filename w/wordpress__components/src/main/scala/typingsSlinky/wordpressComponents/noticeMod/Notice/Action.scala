package typingsSlinky.wordpressComponents.noticeMod.Notice

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.noticeMod.Notice.ButtonAction
  - typingsSlinky.wordpressComponents.noticeMod.Notice.URLAction
*/
trait Action extends js.Object
object Action {
  
  @scala.inline
  def ButtonAction(label: String, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  def URLAction(label: String, url: String): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}
