package typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default /[-[\]{}()*+?.,\\^$|#\s]/g
    */
  var escape: js.RegExp
}

object Impl {
  @scala.inline
  def apply(escape: js.RegExp): Impl = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

