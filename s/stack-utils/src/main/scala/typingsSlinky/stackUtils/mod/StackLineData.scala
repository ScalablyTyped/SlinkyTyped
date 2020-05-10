package typingsSlinky.stackUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackLineData extends StackData {
  var evalColumn: js.UndefOr[Double] = js.native
  var evalFile: js.UndefOr[String] = js.native
  var evalLine: js.UndefOr[Double] = js.native
}

object StackLineData {
  @scala.inline
  def apply(): StackLineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackLineData]
  }
  @scala.inline
  implicit class StackLineDataOps[Self <: StackLineData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvalColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalFile")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalLine")(js.undefined)
        ret
    }
  }
  
}

