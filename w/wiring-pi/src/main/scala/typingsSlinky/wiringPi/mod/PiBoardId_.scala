package typingsSlinky.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiBoardId_ extends js.Object {
  var maker: Double = js.native
  var mem: Double = js.native
  var model: Double = js.native
  var overvolted: Double = js.native
  var rev: Double = js.native
}

object PiBoardId_ {
  @scala.inline
  def apply(maker: Double, mem: Double, model: Double, overvolted: Double, rev: Double): PiBoardId_ = {
    val __obj = js.Dynamic.literal(maker = maker.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], overvolted = overvolted.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiBoardId_]
  }
  @scala.inline
  implicit class PiBoardId_Ops[Self <: PiBoardId_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOvervolted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overvolted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

