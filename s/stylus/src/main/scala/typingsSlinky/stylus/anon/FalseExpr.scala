package typingsSlinky.stylus.anon

import typingsSlinky.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FalseExpr extends js.Object {
  var __type: String = js.native
  var column: Double = js.native
  var falseExpr: Expression = js.native
  var filename: String = js.native
  var lineno: Double = js.native
  var op: String = js.native
  var trueExpr: Expression = js.native
}

object FalseExpr {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    falseExpr: Expression,
    filename: String,
    lineno: Double,
    op: String,
    trueExpr: Expression
  ): FalseExpr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], falseExpr = falseExpr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], trueExpr = trueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FalseExpr]
  }
  @scala.inline
  implicit class FalseExprOps[Self <: FalseExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseExpr(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueExpr(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueExpr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

