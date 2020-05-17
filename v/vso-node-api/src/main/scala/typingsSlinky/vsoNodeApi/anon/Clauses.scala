package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clauses extends js.Object {
  var all: scala.Double = js.native
  var clauses: scala.Double = js.native
  var minimal: scala.Double = js.native
  var none: scala.Double = js.native
  var wiql: scala.Double = js.native
}

object Clauses {
  @scala.inline
  def apply(
    all: scala.Double,
    clauses: scala.Double,
    minimal: scala.Double,
    none: scala.Double,
    wiql: scala.Double
  ): Clauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clauses]
  }
  @scala.inline
  implicit class ClausesOps[Self <: Clauses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClauses(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimal(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWiql(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiql")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

