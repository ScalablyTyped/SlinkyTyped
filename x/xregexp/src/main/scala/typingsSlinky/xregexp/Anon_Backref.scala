package typingsSlinky.xregexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backref extends js.Object {
  var backref: String
  var regex: js.RegExp
}

object Anon_Backref {
  @scala.inline
  def apply(backref: String, regex: js.RegExp): Anon_Backref = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Backref]
  }
}

