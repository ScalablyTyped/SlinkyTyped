package typingsSlinky.stylus.anon

import typingsSlinky.stylus.mod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var __type: String = js.native
  var block: typingsSlinky.stylus.mod.Stylus.Nodes.Block = js.native
  var column: Double = js.native
  var expr: Expression = js.native
  var filename: String = js.native
  var key: String = js.native
  var lineno: Double = js.native
  var `val`: String = js.native
}

object Key {
  @scala.inline
  def apply(
    __type: String,
    block: typingsSlinky.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    expr: Expression,
    filename: String,
    key: String,
    lineno: Double,
    `val`: String
  ): Key = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def withBlock(value: typingsSlinky.stylus.mod.Stylus.Nodes.Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpr(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

