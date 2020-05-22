package typingsSlinky.wouter.anon

import typingsSlinky.wouter.mod.NavigationalProps
import typingsSlinky.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends NavigationalProps {
  var href: Path
}

object Href {
  @scala.inline
  def apply(href: Path): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

