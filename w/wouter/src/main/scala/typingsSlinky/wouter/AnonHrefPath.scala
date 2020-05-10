package typingsSlinky.wouter

import typingsSlinky.wouter.preactMod.NavigationalProps
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHrefPath extends NavigationalProps {
  var href: Path = js.native
}

object AnonHrefPath {
  @scala.inline
  def apply(href: Path): AnonHrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHrefPath]
  }
  @scala.inline
  implicit class AnonHrefPathOps[Self <: AnonHrefPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

