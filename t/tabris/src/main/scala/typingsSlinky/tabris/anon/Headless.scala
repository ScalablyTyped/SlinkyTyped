package typingsSlinky.tabris.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headless extends js.Object {
  var headless: js.UndefOr[Boolean] = js.native
}

object Headless {
  @scala.inline
  def apply(): Headless = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headless]
  }
  @scala.inline
  implicit class HeadlessOps[Self <: Headless] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
  }
  
}

