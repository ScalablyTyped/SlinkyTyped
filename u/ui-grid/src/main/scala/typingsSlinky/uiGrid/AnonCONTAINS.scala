package typingsSlinky.uiGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCONTAINS extends js.Object {
  var CONTAINS: Double = js.native
  var ENDS_WITH: Double = js.native
  var EXACT: Double = js.native
  var GREATER_THAN: Double = js.native
  var GREATER_THAN_OR_EQUAL: Double = js.native
  var INPUT: String = js.native
  var LESS_THAN: Double = js.native
  var LESS_THAN_OR_EQUAL: Double = js.native
  var NOT_EQUAL: Double = js.native
  var SELECT: String = js.native
  var STARTS_WITH: Double = js.native
}

object AnonCONTAINS {
  @scala.inline
  def apply(
    CONTAINS: Double,
    ENDS_WITH: Double,
    EXACT: Double,
    GREATER_THAN: Double,
    GREATER_THAN_OR_EQUAL: Double,
    INPUT: String,
    LESS_THAN: Double,
    LESS_THAN_OR_EQUAL: Double,
    NOT_EQUAL: Double,
    SELECT: String,
    STARTS_WITH: Double
  ): AnonCONTAINS = {
    val __obj = js.Dynamic.literal(CONTAINS = CONTAINS.asInstanceOf[js.Any], ENDS_WITH = ENDS_WITH.asInstanceOf[js.Any], EXACT = EXACT.asInstanceOf[js.Any], GREATER_THAN = GREATER_THAN.asInstanceOf[js.Any], GREATER_THAN_OR_EQUAL = GREATER_THAN_OR_EQUAL.asInstanceOf[js.Any], INPUT = INPUT.asInstanceOf[js.Any], LESS_THAN = LESS_THAN.asInstanceOf[js.Any], LESS_THAN_OR_EQUAL = LESS_THAN_OR_EQUAL.asInstanceOf[js.Any], NOT_EQUAL = NOT_EQUAL.asInstanceOf[js.Any], SELECT = SELECT.asInstanceOf[js.Any], STARTS_WITH = STARTS_WITH.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCONTAINS]
  }
  @scala.inline
  implicit class AnonCONTAINSOps[Self <: AnonCONTAINS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONTAINS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENDS_WITH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXACT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXACT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGREATER_THAN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGREATER_THAN_OR_EQUAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLESS_THAN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLESS_THAN_OR_EQUAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_EQUAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTARTS_WITH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

