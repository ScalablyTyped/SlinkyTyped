package typingsSlinky.typescriptTuple

import typingsSlinky.typescriptTuple.typescriptTupleStrings.InfiniteTuple
import typingsSlinky.typescriptTuple.typescriptTupleStrings.`Cannot reverse an infinite tuple`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCODENAME extends js.Object {
  var CODENAME: InfiniteTuple = js.native
  var ERROR: `Cannot reverse an infinite tuple` = js.native
}

object AnonCODENAME {
  @scala.inline
  def apply(CODENAME: InfiniteTuple, ERROR: `Cannot reverse an infinite tuple`): AnonCODENAME = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCODENAME]
  }
  @scala.inline
  implicit class AnonCODENAMEOps[Self <: AnonCODENAME] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCODENAME(value: InfiniteTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODENAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: `Cannot reverse an infinite tuple`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

