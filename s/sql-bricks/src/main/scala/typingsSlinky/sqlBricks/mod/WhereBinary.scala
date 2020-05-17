package typingsSlinky.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereBinary extends WhereExpression {
  var col: String | SelectStatement = js.native
  var op: String = js.native
  var quantifier: String = js.native
  var `val`: js.Any = js.native
}

object WhereBinary {
  @scala.inline
  def apply(col: String | SelectStatement, op: String, quantifier: String, `val`: js.Any): WhereBinary = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereBinary]
  }
  @scala.inline
  implicit class WhereBinaryOps[Self <: WhereBinary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: String | SelectStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

