package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidFilterClause extends js.Object {
  var invalidFilterClause: scala.Double = js.native
  var oK: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object InvalidFilterClause {
  @scala.inline
  def apply(invalidFilterClause: scala.Double, oK: scala.Double, unknown: scala.Double): InvalidFilterClause = {
    val __obj = js.Dynamic.literal(invalidFilterClause = invalidFilterClause.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFilterClause]
  }
  @scala.inline
  implicit class InvalidFilterClauseOps[Self <: InvalidFilterClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidFilterClause(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFilterClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

