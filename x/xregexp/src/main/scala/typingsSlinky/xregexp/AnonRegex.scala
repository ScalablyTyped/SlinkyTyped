package typingsSlinky.xregexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegex extends js.Object {
  var backref: Double
  var regex: js.RegExp
}

object AnonRegex {
  @scala.inline
  def apply(backref: Double, regex: js.RegExp): AnonRegex = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRegex]
  }
}

