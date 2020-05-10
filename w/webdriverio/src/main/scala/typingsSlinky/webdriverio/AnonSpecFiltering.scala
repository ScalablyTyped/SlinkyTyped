package typingsSlinky.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSpecFiltering extends js.Object {
  var specFiltering: js.UndefOr[Boolean] = js.native
}

object AnonSpecFiltering {
  @scala.inline
  def apply(): AnonSpecFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSpecFiltering]
  }
  @scala.inline
  implicit class AnonSpecFilteringOps[Self <: AnonSpecFiltering] (val x: Self) extends AnyVal {
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

