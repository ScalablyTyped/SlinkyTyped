package typingsSlinky.typescriptTuple

import typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite
import typingsSlinky.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typingsSlinky.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCODENAMEERROR extends js.Object {
  var CODENAME: InfiniteTupleSet with Infinite = js.native
  var ERROR: `TupleSet is not finite` = js.native
}

object AnonCODENAMEERROR {
  @scala.inline
  def apply(CODENAME: InfiniteTupleSet with Infinite, ERROR: `TupleSet is not finite`): AnonCODENAMEERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCODENAMEERROR]
  }
  @scala.inline
  implicit class AnonCODENAMEERROROps[Self <: AnonCODENAMEERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCODENAME(value: InfiniteTupleSet with Infinite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODENAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: `TupleSet is not finite`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

