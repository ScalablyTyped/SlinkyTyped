package typingsSlinky.scroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOptions extends js.Object {
  /**
    * Animation duration
    * @default 350
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Ease function
    * @default easeInOut
    */
  var ease: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
}

object ScrollOptions {
  @scala.inline
  def apply(): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollOptions]
  }
  @scala.inline
  implicit class ScrollOptionsOps[Self <: ScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEase(value: /* time */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
  }
  
}

