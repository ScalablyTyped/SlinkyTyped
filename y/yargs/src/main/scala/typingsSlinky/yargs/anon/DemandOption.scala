package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DemandOption extends js.Object {
  var demandOption: java.lang.String | `true` = js.native
}

object DemandOption {
  @scala.inline
  def apply(demandOption: java.lang.String | `true`): DemandOption = {
    val __obj = js.Dynamic.literal(demandOption = demandOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DemandOption]
  }
  @scala.inline
  implicit class DemandOptionOps[Self <: DemandOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemandOption(value: java.lang.String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demandOption")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

