package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var onlyInViewport: js.UndefOr[Boolean] = js.native
}

object KeyboardOptions {
  @scala.inline
  def apply(): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardOptions]
  }
  @scala.inline
  implicit class KeyboardOptionsOps[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyInViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyInViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInViewport")(js.undefined)
        ret
    }
  }
  
}

