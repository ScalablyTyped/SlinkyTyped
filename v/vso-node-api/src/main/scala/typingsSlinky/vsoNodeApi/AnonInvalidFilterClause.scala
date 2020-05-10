package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvalidFilterClause extends js.Object {
  var invalidFilterClause: Double = js.native
  var oK: Double = js.native
  var unknown: Double = js.native
}

object AnonInvalidFilterClause {
  @scala.inline
  def apply(invalidFilterClause: Double, oK: Double, unknown: Double): AnonInvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalidFilterClause]
  }
  @scala.inline
  implicit class AnonInvalidFilterClauseOps[Self <: AnonInvalidFilterClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidFilterClause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFilterClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

