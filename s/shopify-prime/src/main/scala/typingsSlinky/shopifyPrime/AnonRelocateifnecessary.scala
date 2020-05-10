package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelocateifnecessary extends js.Object {
  var relocate_if_necessary: js.UndefOr[Boolean] = js.native
}

object AnonRelocateifnecessary {
  @scala.inline
  def apply(): AnonRelocateifnecessary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRelocateifnecessary]
  }
  @scala.inline
  implicit class AnonRelocateifnecessaryOps[Self <: AnonRelocateifnecessary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelocate_if_necessary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relocate_if_necessary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelocate_if_necessary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relocate_if_necessary")(js.undefined)
        ret
    }
  }
  
}

