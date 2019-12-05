package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /[-[\]{}()*+?.,\\^$|#\s]/g
    */
  var escape: js.RegExp
}

object _Impl {
  @scala.inline
  def apply(escape: js.RegExp): _Impl = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

