package typingsSlinky.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockColumn extends js.Object {
  var __type: String = js.native
  var block: typingsSlinky.stylus.mod.Stylus.Nodes.Block = js.native
  var column: Double = js.native
  var filename: String = js.native
  var lineno: Double = js.native
}

object BlockColumn {
  @scala.inline
  def apply(
    __type: String,
    block: typingsSlinky.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    filename: String,
    lineno: Double
  ): BlockColumn = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockColumn]
  }
  @scala.inline
  implicit class BlockColumnOps[Self <: BlockColumn] (val x: Self) extends AnyVal {
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
  }
  
}

