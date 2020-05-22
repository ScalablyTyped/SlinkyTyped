package typingsSlinky.wouter.anon

import typingsSlinky.wouter.preactMod.NavigationalProps
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HrefPath extends NavigationalProps {
  var href: Path
}

object HrefPath {
  @scala.inline
  def apply(href: Path): HrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefPath]
  }
}

