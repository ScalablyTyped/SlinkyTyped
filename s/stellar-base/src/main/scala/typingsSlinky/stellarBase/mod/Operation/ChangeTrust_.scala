package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod.OperationType.ChangeTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTrust_ extends BaseOperation[ChangeTrust] {
  var limit: String = js.native
  var line: Asset = js.native
}

object ChangeTrust_ {
  @scala.inline
  def apply(limit: String, line: Asset, `type`: ChangeTrust): ChangeTrust_ = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust_]
  }
  @scala.inline
  implicit class ChangeTrust_Ops[Self <: ChangeTrust_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

