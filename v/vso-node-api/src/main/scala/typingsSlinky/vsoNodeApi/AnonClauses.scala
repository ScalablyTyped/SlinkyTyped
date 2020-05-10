package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClauses extends js.Object {
  var all: Double = js.native
  var clauses: Double = js.native
  var minimal: Double = js.native
  var none: Double = js.native
  var wiql: Double = js.native
}

object AnonClauses {
  @scala.inline
  def apply(all: Double, clauses: Double, minimal: Double, none: Double, wiql: Double): AnonClauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClauses]
  }
  @scala.inline
  implicit class AnonClausesOps[Self <: AnonClauses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWiql(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiql")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

