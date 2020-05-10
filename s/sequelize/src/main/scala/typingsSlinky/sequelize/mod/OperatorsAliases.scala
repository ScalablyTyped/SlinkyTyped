package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{[key: string] : symbol,   $eq  :symbol,   $ne  :symbol,   $gte  :symbol,   $gt  :symbol,   $lte  :symbol,   $lt  :symbol,   $not  :symbol,   $in  :symbol,   $notIn  :symbol,   $is  :symbol,   $like  :symbol,   $notLike  :symbol,   $iLike  :symbol,   $notILike  :symbol,   $regexp  :symbol,   $notRegexp  :symbol,   $iRegexp  :symbol,   $notIRegexp  :symbol,   $between  :symbol,   $notBetween  :symbol,   $overlap  :symbol,   $contains  :symbol,   $contained  :symbol,   $adjacent  :symbol,   $strictLeft  :symbol,   $strictRight  :symbol,   $noExtendRight  :symbol,   $noExtendLeft  :symbol,   $and  :symbol,   $or  :symbol,   $any  :symbol,   $all  :symbol,   $values  :symbol,   $col  :symbol,   $raw  :symbol}> */
@js.native
trait OperatorsAliases extends js.Object {
  @JSName("$adjacent")
  var $adjacent: js.UndefOr[js.Symbol] = js.native
  @JSName("$all")
  var $all: js.UndefOr[js.Symbol] = js.native
  @JSName("$and")
  var $and: js.UndefOr[js.Symbol] = js.native
  @JSName("$any")
  var $any: js.UndefOr[js.Symbol] = js.native
  @JSName("$between")
  var $between: js.UndefOr[js.Symbol] = js.native
  @JSName("$col")
  var $col: js.UndefOr[js.Symbol] = js.native
  @JSName("$contained")
  var $contained: js.UndefOr[js.Symbol] = js.native
  @JSName("$contains")
  var $contains: js.UndefOr[js.Symbol] = js.native
  @JSName("$eq")
  var $eq: js.UndefOr[js.Symbol] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[js.Symbol] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[js.Symbol] = js.native
  @JSName("$iLike")
  var $iLike: js.UndefOr[js.Symbol] = js.native
  @JSName("$iRegexp")
  var $iRegexp: js.UndefOr[js.Symbol] = js.native
  @JSName("$in")
  var $in: js.UndefOr[js.Symbol] = js.native
  @JSName("$is")
  var $is: js.UndefOr[js.Symbol] = js.native
  @JSName("$like")
  var $like: js.UndefOr[js.Symbol] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[js.Symbol] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[js.Symbol] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[js.Symbol] = js.native
  @JSName("$noExtendLeft")
  var $noExtendLeft: js.UndefOr[js.Symbol] = js.native
  @JSName("$noExtendRight")
  var $noExtendRight: js.UndefOr[js.Symbol] = js.native
  @JSName("$not")
  var $not: js.UndefOr[js.Symbol] = js.native
  @JSName("$notBetween")
  var $notBetween: js.UndefOr[js.Symbol] = js.native
  @JSName("$notILike")
  var $notILike: js.UndefOr[js.Symbol] = js.native
  @JSName("$notIRegexp")
  var $notIRegexp: js.UndefOr[js.Symbol] = js.native
  @JSName("$notIn")
  var $notIn: js.UndefOr[js.Symbol] = js.native
  @JSName("$notLike")
  var $notLike: js.UndefOr[js.Symbol] = js.native
  @JSName("$notRegexp")
  var $notRegexp: js.UndefOr[js.Symbol] = js.native
  @JSName("$or")
  var $or: js.UndefOr[js.Symbol] = js.native
  @JSName("$overlap")
  var $overlap: js.UndefOr[js.Symbol] = js.native
  @JSName("$raw")
  var $raw: js.UndefOr[js.Symbol] = js.native
  @JSName("$regexp")
  var $regexp: js.UndefOr[js.Symbol] = js.native
  @JSName("$strictLeft")
  var $strictLeft: js.UndefOr[js.Symbol] = js.native
  @JSName("$strictRight")
  var $strictRight: js.UndefOr[js.Symbol] = js.native
  @JSName("$values")
  var $values: js.UndefOr[js.Symbol] = js.native
}

object OperatorsAliases {
  @scala.inline
  def apply(): OperatorsAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatorsAliases]
  }
  @scala.inline
  implicit class OperatorsAliasesOps[Self <: OperatorsAliases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$adjacent(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$adjacent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$adjacent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$adjacent")(js.undefined)
        ret
    }
    @scala.inline
    def with$all(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def with$and(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$and: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$and")(js.undefined)
        ret
    }
    @scala.inline
    def with$any(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$any: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$any")(js.undefined)
        ret
    }
    @scala.inline
    def with$between(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$between: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$between")(js.undefined)
        ret
    }
    @scala.inline
    def with$col(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$col: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$col")(js.undefined)
        ret
    }
    @scala.inline
    def with$contained(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$contained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$contained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$contained")(js.undefined)
        ret
    }
    @scala.inline
    def with$contains(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$contains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$contains")(js.undefined)
        ret
    }
    @scala.inline
    def with$eq(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$eq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$eq")(js.undefined)
        ret
    }
    @scala.inline
    def with$gt(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(js.undefined)
        ret
    }
    @scala.inline
    def with$gte(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$gte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(js.undefined)
        ret
    }
    @scala.inline
    def with$iLike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$iLike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iLike")(js.undefined)
        ret
    }
    @scala.inline
    def with$iRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$iRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$iRegexp")(js.undefined)
        ret
    }
    @scala.inline
    def with$in(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$in")(js.undefined)
        ret
    }
    @scala.inline
    def with$is(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$is: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$is")(js.undefined)
        ret
    }
    @scala.inline
    def with$like(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$like: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$like")(js.undefined)
        ret
    }
    @scala.inline
    def with$lt(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(js.undefined)
        ret
    }
    @scala.inline
    def with$lte(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$lte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(js.undefined)
        ret
    }
    @scala.inline
    def with$ne(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ne")(js.undefined)
        ret
    }
    @scala.inline
    def with$noExtendLeft(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$noExtendLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$noExtendLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$noExtendLeft")(js.undefined)
        ret
    }
    @scala.inline
    def with$noExtendRight(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$noExtendRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$noExtendRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$noExtendRight")(js.undefined)
        ret
    }
    @scala.inline
    def with$not(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$not: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$not")(js.undefined)
        ret
    }
    @scala.inline
    def with$notBetween(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notBetween")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notBetween")(js.undefined)
        ret
    }
    @scala.inline
    def with$notILike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notILike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notILike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notILike")(js.undefined)
        ret
    }
    @scala.inline
    def with$notIRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notIRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notIRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notIRegexp")(js.undefined)
        ret
    }
    @scala.inline
    def with$notIn(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notIn")(js.undefined)
        ret
    }
    @scala.inline
    def with$notLike(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notLike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notLike")(js.undefined)
        ret
    }
    @scala.inline
    def with$notRegexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notRegexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$notRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$notRegexp")(js.undefined)
        ret
    }
    @scala.inline
    def with$or(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$or: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$or")(js.undefined)
        ret
    }
    @scala.inline
    def with$overlap(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$overlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$overlap")(js.undefined)
        ret
    }
    @scala.inline
    def with$raw(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$raw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$raw")(js.undefined)
        ret
    }
    @scala.inline
    def with$regexp(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$regexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$regexp")(js.undefined)
        ret
    }
    @scala.inline
    def with$strictLeft(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$strictLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$strictLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$strictLeft")(js.undefined)
        ret
    }
    @scala.inline
    def with$strictRight(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$strictRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$strictRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$strictRight")(js.undefined)
        ret
    }
    @scala.inline
    def with$values(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$values: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$values")(js.undefined)
        ret
    }
  }
  
}

