package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeatvalue extends js.Object {
  var beat_value: js.UndefOr[Double] = js.native
  var num_beats: js.UndefOr[Double] = js.native
  var resolution: js.UndefOr[Double] = js.native
}

object AnonBeatvalue {
  @scala.inline
  def apply(): AnonBeatvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBeatvalue]
  }
  @scala.inline
  implicit class AnonBeatvalueOps[Self <: AnonBeatvalue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeat_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beat_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeat_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beat_value")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_beats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_beats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_beats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_beats")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
  }
  
}

