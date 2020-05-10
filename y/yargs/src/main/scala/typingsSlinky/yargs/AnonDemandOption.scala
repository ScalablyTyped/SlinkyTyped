package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDemandOption extends js.Object {
  var demandOption: String | `true` = js.native
}

object AnonDemandOption {
  @scala.inline
  def apply(demandOption: String | `true`): AnonDemandOption = {
    val __obj = js.Dynamic.literal(demandOption = demandOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDemandOption]
  }
  @scala.inline
  implicit class AnonDemandOptionOps[Self <: AnonDemandOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemandOption(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demandOption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

