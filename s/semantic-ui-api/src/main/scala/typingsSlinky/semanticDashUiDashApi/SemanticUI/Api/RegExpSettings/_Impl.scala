package typingsSlinky.semanticDashUiDashApi.SemanticUI.Api.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /\{\/\$*[A-z0-9]+\}/g
    */
  var optional: js.RegExp
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var required: js.RegExp
}

object _Impl {
  @scala.inline
  def apply(optional: js.RegExp, required: js.RegExp): _Impl = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

