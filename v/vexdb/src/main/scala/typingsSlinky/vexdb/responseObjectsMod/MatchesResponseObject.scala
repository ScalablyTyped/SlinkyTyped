package typingsSlinky.vexdb.responseObjectsMod

import typingsSlinky.vexdb.vexdbNumbers.`0`
import typingsSlinky.vexdb.vexdbNumbers.`16`
import typingsSlinky.vexdb.vexdbNumbers.`1`
import typingsSlinky.vexdb.vexdbNumbers.`2`
import typingsSlinky.vexdb.vexdbNumbers.`3`
import typingsSlinky.vexdb.vexdbNumbers.`4`
import typingsSlinky.vexdb.vexdbNumbers.`5`
import typingsSlinky.vexdb.vexdbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchesResponseObject extends ResponseObject {
  var blue1: String = js.native
  var blue2: String = js.native
  var blue3: String = js.native
  var bluescore: Double = js.native
  var bluesit: String = js.native
  var division: String = js.native
  var field: String = js.native
  var instance: Double = js.native
  var matchnum: Double = js.native
  var red1: String = js.native
  var red2: String = js.native
  var red3: String = js.native
  var redscore: Double = js.native
  var redsit: String = js.native
  var round: `1` | `2` | `3` | `4` | `5` | `6` | `16` = js.native
  var scheduled: String = js.native
  var scored: `0` | `1` = js.native
  var sku: String = js.native
}

object MatchesResponseObject {
  @scala.inline
  def apply(
    blue1: String,
    blue2: String,
    blue3: String,
    bluescore: Double,
    bluesit: String,
    division: String,
    field: String,
    instance: Double,
    matchnum: Double,
    red1: String,
    red2: String,
    red3: String,
    redscore: Double,
    redsit: String,
    round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
    scheduled: String,
    scored: `0` | `1`,
    sku: String
  ): MatchesResponseObject = {
    val __obj = js.Dynamic.literal(blue1 = blue1.asInstanceOf[js.Any], blue2 = blue2.asInstanceOf[js.Any], blue3 = blue3.asInstanceOf[js.Any], bluescore = bluescore.asInstanceOf[js.Any], bluesit = bluesit.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], matchnum = matchnum.asInstanceOf[js.Any], red1 = red1.asInstanceOf[js.Any], red2 = red2.asInstanceOf[js.Any], red3 = red3.asInstanceOf[js.Any], redscore = redscore.asInstanceOf[js.Any], redsit = redsit.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], scored = scored.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesResponseObject]
  }
  @scala.inline
  implicit class MatchesResponseObjectOps[Self <: MatchesResponseObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBluescore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluescore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBluesit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluesit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("division")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchnum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedscore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redscore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedsit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redsit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: `1` | `2` | `3` | `4` | `5` | `6` | `16`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScored(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sku")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

