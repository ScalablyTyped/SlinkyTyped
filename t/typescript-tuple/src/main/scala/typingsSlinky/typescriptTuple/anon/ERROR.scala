package typingsSlinky.typescriptTuple.anon

import typingsSlinky.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typingsSlinky.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ERROR extends js.Object {
  var CODENAME: InfiniteLeft with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite = js.native
  var ERROR: `Left is not finite` = js.native
}

object ERROR {
  @scala.inline
  def apply(
    CODENAME: InfiniteLeft with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `Left is not finite`
  ): ERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  @scala.inline
  implicit class ERROROps[Self <: ERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCODENAME(value: InfiniteLeft with typingsSlinky.typescriptTuple.typescriptTupleStrings.Infinite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CODENAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: `Left is not finite`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

