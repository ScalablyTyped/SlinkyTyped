package typingsSlinky.wouter

import typingsSlinky.wouter.preactMod.NavigationalProps
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToPath extends NavigationalProps {
  var to: Path
}

object AnonToPath {
  @scala.inline
  def apply(to: Path): AnonToPath = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonToPath]
  }
}

