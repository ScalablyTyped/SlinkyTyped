package typingsSlinky.semanticDashUiDashProgress.SemanticUI.Progress.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var variable: js.RegExp
}

object _Impl {
  @scala.inline
  def apply(variable: js.RegExp): _Impl = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

