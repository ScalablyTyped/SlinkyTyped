package typingsSlinky.serialport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Regex extends js.Object {
  var regex: js.RegExp
}

object Regex {
  @scala.inline
  def apply(regex: js.RegExp): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
}

