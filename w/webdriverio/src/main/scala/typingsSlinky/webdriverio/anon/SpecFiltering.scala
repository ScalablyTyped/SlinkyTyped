package typingsSlinky.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecFiltering extends js.Object {
  var specFiltering: js.UndefOr[Boolean] = js.native
}

object SpecFiltering {
  @scala.inline
  def apply(): SpecFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecFiltering]
  }
  @scala.inline
  implicit class SpecFilteringOps[Self <: SpecFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specFiltering")(js.undefined)
        ret
    }
  }
  
}

