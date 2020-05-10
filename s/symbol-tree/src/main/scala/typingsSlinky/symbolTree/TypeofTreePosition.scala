package typingsSlinky.symbolTree

import typingsSlinky.symbolTree.symbolTreeNumbers.`16`
import typingsSlinky.symbolTree.symbolTreeNumbers.`1`
import typingsSlinky.symbolTree.symbolTreeNumbers.`2`
import typingsSlinky.symbolTree.symbolTreeNumbers.`4`
import typingsSlinky.symbolTree.symbolTreeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTreePosition extends js.Object {
  val CONTAINED_BY: `16` = js.native
  val CONTAINS: `8` = js.native
  val DISCONNECTED: `1` = js.native
  val FOLLOWING: `4` = js.native
  val PRECEDING: `2` = js.native
}

object TypeofTreePosition {
  @scala.inline
  def apply(CONTAINED_BY: `16`, CONTAINS: `8`, DISCONNECTED: `1`, FOLLOWING: `4`, PRECEDING: `2`): TypeofTreePosition = {
    val __obj = js.Dynamic.literal(CONTAINED_BY = CONTAINED_BY.asInstanceOf[js.Any], CONTAINS = CONTAINS.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], FOLLOWING = FOLLOWING.asInstanceOf[js.Any], PRECEDING = PRECEDING.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreePosition]
  }
  @scala.inline
  implicit class TypeofTreePositionOps[Self <: TypeofTreePosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONTAINED_BY(value: `16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTAINED_BY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONTAINS(value: `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISCONNECTED(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOLLOWING(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOLLOWING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRECEDING(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRECEDING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

