package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnnestSqlTokenType extends _SqlTokenType {
  var columnTypes: js.Array[String] = js.native
  var tuples: js.Array[js.Array[ValueExpressionType]] = js.native
  var `type`: js.Symbol = js.native
}

object UnnestSqlTokenType {
  @scala.inline
  def apply(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnnestSqlTokenType]
  }
  @scala.inline
  implicit class UnnestSqlTokenTypeOps[Self <: UnnestSqlTokenType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuples(value: js.Array[js.Array[ValueExpressionType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

