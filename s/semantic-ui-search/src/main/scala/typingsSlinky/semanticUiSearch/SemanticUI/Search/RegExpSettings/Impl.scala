package typingsSlinky.semanticUiSearch.SemanticUI.Search.RegExpSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '(?:\s|^)'
    */
  var beginsWith: String
  /**
    * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
    */
  var escape: js.RegExp
}

object Impl {
  @scala.inline
  def apply(beginsWith: String, escape: js.RegExp): Impl = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

