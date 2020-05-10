package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageTransitionEventInit extends EventInit {
  var persisted: js.UndefOr[scala.Boolean] = js.native
}

object PageTransitionEventInit {
  @scala.inline
  def apply(): PageTransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionEventInit]
  }
  @scala.inline
  implicit class PageTransitionEventInitOps[Self <: PageTransitionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersisted(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(js.undefined)
        ret
    }
  }
  
}

