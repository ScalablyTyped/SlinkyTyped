package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */] extends js.Object {
  var value: TSV = js.native
}

object Value {
  @scala.inline
  def apply[TSV, TTypestate](value: TSV): Value[TSV, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TSV, TTypestate]]
  }
  @scala.inline
  implicit class ValueOps[Self[tsv, ttypestate] <: Value[tsv, ttypestate], TSV, TTypestate] (val x: Self[TSV, TTypestate]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSV, TTypestate] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSV, TTypestate]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSV, TTypestate]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSV, TTypestate]) with Other]
    @scala.inline
    def withValue(value: TSV): Self[TSV, TTypestate] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

