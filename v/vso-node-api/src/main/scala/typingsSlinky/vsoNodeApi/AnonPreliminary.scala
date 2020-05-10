package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreliminary extends js.Object {
  var full: Double = js.native
  var preliminary: Double = js.native
}

object AnonPreliminary {
  @scala.inline
  def apply(full: Double, preliminary: Double): AnonPreliminary = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], preliminary = preliminary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreliminary]
  }
  @scala.inline
  implicit class AnonPreliminaryOps[Self <: AnonPreliminary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreliminary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preliminary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

