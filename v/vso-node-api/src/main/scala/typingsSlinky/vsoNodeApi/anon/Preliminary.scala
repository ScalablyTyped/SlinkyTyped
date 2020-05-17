package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preliminary extends js.Object {
  var full: scala.Double = js.native
  var preliminary: scala.Double = js.native
}

object Preliminary {
  @scala.inline
  def apply(full: scala.Double, preliminary: scala.Double): Preliminary = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], preliminary = preliminary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preliminary]
  }
  @scala.inline
  implicit class PreliminaryOps[Self <: Preliminary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreliminary(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preliminary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

