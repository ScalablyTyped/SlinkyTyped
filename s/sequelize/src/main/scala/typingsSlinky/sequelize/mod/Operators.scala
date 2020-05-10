package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operator symbols to be used when querying data
  */
@js.native
trait Operators extends js.Object {
  var adjacent: js.Symbol = js.native
  var all: js.Symbol = js.native
  var and: js.Symbol = js.native
  var any: js.Symbol = js.native
  var between: js.Symbol = js.native
  var col: js.Symbol = js.native
  var contained: js.Symbol = js.native
  var contains: js.Symbol = js.native
  @JSName("eq")
  var eq_FOperators: js.Symbol = js.native
  var gt: js.Symbol = js.native
  var gte: js.Symbol = js.native
  var iLike: js.Symbol = js.native
  var iRegexp: js.Symbol = js.native
  var in: js.Symbol = js.native
  var is: js.Symbol = js.native
  var join: js.Symbol = js.native
  var like: js.Symbol = js.native
  var lt: js.Symbol = js.native
  var lte: js.Symbol = js.native
  @JSName("ne")
  var ne_FOperators: js.Symbol = js.native
  var noExtendLeft: js.Symbol = js.native
  var noExtendRight: js.Symbol = js.native
  var not: js.Symbol = js.native
  var notBetween: js.Symbol = js.native
  var notILike: js.Symbol = js.native
  var notIRegexp: js.Symbol = js.native
  var notIn: js.Symbol = js.native
  var notLike: js.Symbol = js.native
  var notRegexp: js.Symbol = js.native
  var or: js.Symbol = js.native
  var overlap: js.Symbol = js.native
  var placeholder: js.Symbol = js.native
  var raw: js.Symbol = js.native
  var regexp: js.Symbol = js.native
  var strictLeft: js.Symbol = js.native
  var strictRight: js.Symbol = js.native
  var values: js.Symbol = js.native
}

object Operators {
  @scala.inline
  def apply(
    adjacent: js.Symbol,
    all: js.Symbol,
    and: js.Symbol,
    any: js.Symbol,
    between: js.Symbol,
    col: js.Symbol,
    contained: js.Symbol,
    contains: js.Symbol,
    eq: js.Symbol,
    gt: js.Symbol,
    gte: js.Symbol,
    iLike: js.Symbol,
    iRegexp: js.Symbol,
    in: js.Symbol,
    is: js.Symbol,
    join: js.Symbol,
    like: js.Symbol,
    lt: js.Symbol,
    lte: js.Symbol,
    ne: js.Symbol,
    noExtendLeft: js.Symbol,
    noExtendRight: js.Symbol,
    not: js.Symbol,
    notBetween: js.Symbol,
    notILike: js.Symbol,
    notIRegexp: js.Symbol,
    notIn: js.Symbol,
    notLike: js.Symbol,
    notRegexp: js.Symbol,
    or: js.Symbol,
    overlap: js.Symbol,
    placeholder: js.Symbol,
    raw: js.Symbol,
    regexp: js.Symbol,
    strictLeft: js.Symbol,
    strictRight: js.Symbol,
    values: js.Symbol
  ): Operators = {
    val __obj = js.Dynamic.literal(adjacent = adjacent.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], contained = contained.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], eq = eq.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any], iLike = iLike.asInstanceOf[js.Any], iRegexp = iRegexp.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], noExtendLeft = noExtendLeft.asInstanceOf[js.Any], noExtendRight = noExtendRight.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notBetween = notBetween.asInstanceOf[js.Any], notILike = notILike.asInstanceOf[js.Any], notIRegexp = notIRegexp.asInstanceOf[js.Any], notIn = notIn.asInstanceOf[js.Any], notLike = notLike.asInstanceOf[js.Any], notRegexp = notRegexp.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], overlap = overlap.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], strictLeft = strictLeft.asInstanceOf[js.Any], strictRight = strictRight.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operators]
  }
  @scala.inline
  implicit class OperatorsOps[Self <: Operators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjacent(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnd(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBetween(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCol(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContained(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEq(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGt(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGte(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withILike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoin(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLt(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLte(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNe(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoExtendLeft(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExtendLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoExtendRight(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noExtendRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotBetween(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBetween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotILike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notILike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotIRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotIn(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotLike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOr(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlap(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictLeft(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictRight(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

