package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logic of where statement
  */
/* Inlined std.Partial<{  $ne  :string | number | sequelize.sequelize.WhereLogic,   $in  :std.Array<string | number> | sequelize.sequelize.literal,   $not  :boolean | string | number | sequelize.sequelize.AnyWhereOptions,   $notIn  :std.Array<string | number> | sequelize.sequelize.literal,   $gte  :number | string | std.Date,   $gt  :number | string | std.Date,   $lte  :number | string | std.Date,   $lt  :number | string | std.Date,   $like  :string | sequelize.sequelize.WherePGStatement,   $iLike  :string | sequelize.sequelize.WherePGStatement,   $ilike  :string | sequelize.sequelize.WherePGStatement,   $notLike  :string | sequelize.sequelize.WherePGStatement,   $notILike  :string | sequelize.sequelize.WherePGStatement,   $between  :[number, number] | [std.Date, std.Date],   ..  :[number, number] | [string, string],   $notBetween  :[number, number],   !..  :[number, number] | [string, string],   $overlap  :[number, number] | [string, string],   &&  :[number, number],   $contains  :any,   @>  :any,   $contained  :any,   <@  :any}> */
@js.native
trait WhereLogic extends js.Object {
  @JSName("$between")
  var $between: js.UndefOr[js.Tuple2[js.Date | Double, js.Date | Double]] = js.native
  @JSName("$contained")
  var $contained: js.UndefOr[js.Any] = js.native
  @JSName("$contains")
  var $contains: js.UndefOr[js.Any] = js.native
  @JSName("$gt")
  var $gt: js.UndefOr[Double | String | js.Date] = js.native
  @JSName("$gte")
  var $gte: js.UndefOr[Double | String | js.Date] = js.native
  @JSName("$iLike")
  var $iLike: js.UndefOr[String | WherePGStatement] = js.native
  @JSName("$ilike")
  var $ilike: js.UndefOr[String | WherePGStatement] = js.native
  @JSName("$in")
  var $in: js.UndefOr[(js.Array[String | Double]) | literal] = js.native
  @JSName("$like")
  var $like: js.UndefOr[String | WherePGStatement] = js.native
  @JSName("$lt")
  var $lt: js.UndefOr[Double | String | js.Date] = js.native
  @JSName("$lte")
  var $lte: js.UndefOr[Double | String | js.Date] = js.native
  @JSName("$ne")
  var $ne: js.UndefOr[String | Double | WhereLogic] = js.native
  @JSName("$not")
  var $not: js.UndefOr[Boolean | String | Double | AnyWhereOptions] = js.native
  @JSName("$notBetween")
  var $notBetween: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  @JSName("$notILike")
  var $notILike: js.UndefOr[String | WherePGStatement] = js.native
  @JSName("$notIn")
  var $notIn: js.UndefOr[(js.Array[String | Double]) | literal] = js.native
  @JSName("$notLike")
  var $notLike: js.UndefOr[String | WherePGStatement] = js.native
  @JSName("$overlap")
  var $overlap: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  @JSName("@>")
  var `@Greaterthansign`: js.UndefOr[js.Any] = js.native
  @JSName("&&")
  var AmpersandAmpersand: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  @JSName("..")
  var DotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  @JSName("!..")
  var ExclamationmarkDotDot: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  @JSName("<@")
  var `Lessthansign@`: js.UndefOr[js.Any] = js.native
}

object WhereLogic {
  @scala.inline
  def apply(): WhereLogic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhereLogic]
  }
  @scala.inline
  implicit class WhereLogicOps[Self <: WhereLogic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$between(value: js.Tuple2[js.Date | Double, js.Date | Double]): Self = {
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
    def with$contained(value: js.Any): Self = {
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
    def with$contains(value: js.Any): Self = {
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
    def with$gtDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$gt(value: Double | String | js.Date): Self = {
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
    def with$gteDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$gte(value: Double | String | js.Date): Self = {
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
    def with$iLike(value: String | WherePGStatement): Self = {
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
    def with$in(value: (js.Array[String | Double]) | literal): Self = {
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
    def with$like(value: String | WherePGStatement): Self = {
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
    def with$ltDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$lt(value: Double | String | js.Date): Self = {
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
    def with$lteDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$lte(value: Double | String | js.Date): Self = {
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
    def with$ne(value: String | Double | WhereLogic): Self = {
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
    def with$not(value: Boolean | String | Double | AnyWhereOptions): Self = {
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
    def with$notBetween(value: js.Tuple2[Double, Double]): Self = {
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
    def with$notILike(value: String | WherePGStatement): Self = {
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
    def with$notIn(value: (js.Array[String | Double]) | literal): Self = {
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
    def with$notLike(value: String | WherePGStatement): Self = {
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
    def with$overlap(value: js.Tuple2[Double | String, Double | String]): Self = {
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
    def `with@Greaterthansign`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@>")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without@Greaterthansign`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@>")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpersandAmpersand(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("&&")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpersandAmpersand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("&&")(js.undefined)
        ret
    }
    @scala.inline
    def withDotDot(value: js.Tuple2[Double | String, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("..")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("..")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkDotDot(value: js.Tuple2[Double | String, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!..")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkDotDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!..")(js.undefined)
        ret
    }
    @scala.inline
    def `withLessthansign@`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<@")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLessthansign@`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<@")(js.undefined)
        ret
    }
  }
  
}

