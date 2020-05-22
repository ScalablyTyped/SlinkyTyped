package typingsSlinky.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexRule extends js.Object {
  var regex: js.RegExp
}

object RegexRule {
  @scala.inline
  def apply(regex: js.RegExp): RegexRule = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexRule]
  }
}

