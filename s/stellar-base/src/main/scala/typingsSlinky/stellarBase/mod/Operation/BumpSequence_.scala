package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.OperationType.BumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BumpSequence_ extends BaseOperation[BumpSequence] {
  var bumpTo: String = js.native
}

object BumpSequence_ {
  @scala.inline
  def apply(bumpTo: String, `type`: BumpSequence): BumpSequence_ = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence_]
  }
  @scala.inline
  implicit class BumpSequence_Ops[Self <: BumpSequence_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBumpTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

