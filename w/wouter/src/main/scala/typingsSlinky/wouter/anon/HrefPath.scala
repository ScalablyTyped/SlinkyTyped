package typingsSlinky.wouter.anon

import typingsSlinky.wouter.preactMod.NavigationalProps
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HrefPath extends NavigationalProps {
  var href: Path = js.native
}

object HrefPath {
  @scala.inline
  def apply(href: Path): HrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefPath]
  }
  @scala.inline
  implicit class HrefPathOps[Self <: HrefPath] (val x: Self) extends AnyVal {
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

