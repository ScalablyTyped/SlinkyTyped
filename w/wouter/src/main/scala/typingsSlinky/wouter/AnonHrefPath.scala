package typingsSlinky.wouter

import typingsSlinky.wouter.preactMod.NavigationalProps
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHrefPath extends NavigationalProps {
  var href: Path
}

object AnonHrefPath {
  @scala.inline
  def apply(href: Path): AnonHrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHrefPath]
  }
}

