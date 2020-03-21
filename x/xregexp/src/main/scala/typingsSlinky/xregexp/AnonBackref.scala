package typingsSlinky.xregexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackref extends js.Object {
  var backref: String
  var regex: js.RegExp
}

object AnonBackref {
  @scala.inline
  def apply(backref: String, regex: js.RegExp): AnonBackref = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackref]
  }
}

