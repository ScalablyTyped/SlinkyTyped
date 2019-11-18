package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowConsole extends js.Object {
  val console: org.scalajs.dom.raw.Console
}

object WindowConsole {
  @scala.inline
  def apply(console: org.scalajs.dom.raw.Console): WindowConsole = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowConsole]
  }
}

