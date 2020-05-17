package typingsSlinky.sloc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<sloc.sloc.Key, number> */
@js.native
trait RecordKeynumber extends js.Object {
  var block: Double = js.native
  var blockEmpty: Double = js.native
  var comment: Double = js.native
  var empty: Double = js.native
  var mixed: Double = js.native
  var single: Double = js.native
  var source: Double = js.native
  var todo: Double = js.native
  var total: Double = js.native
}

object RecordKeynumber {
  @scala.inline
  def apply(
    block: Double,
    blockEmpty: Double,
    comment: Double,
    empty: Double,
    mixed: Double,
    single: Double,
    source: Double,
    todo: Double,
    total: Double
  ): RecordKeynumber = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockEmpty = blockEmpty.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordKeynumber]
  }
  @scala.inline
  implicit class RecordKeynumberOps[Self <: RecordKeynumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockEmpty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTodo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

