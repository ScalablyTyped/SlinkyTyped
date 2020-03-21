package typingsSlinky.wouter

import typingsSlinky.wouter.mod.NavigationalProps
import typingsSlinky.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTo extends NavigationalProps {
  var to: Path
}

object AnonTo {
  @scala.inline
  def apply(to: Path): AnonTo = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTo]
  }
}

