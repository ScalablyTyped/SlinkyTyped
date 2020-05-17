package typingsSlinky.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyLongest[Longest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Longest = js.native
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any = js.native
}

object EmptyLongest {
  @scala.inline
  def apply[Longest, TupleSet](
    empty: Longest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
  ): EmptyLongest[Longest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLongest[Longest, TupleSet]]
  }
  @scala.inline
  implicit class EmptyLongestOps[Self[longest, tupleset] <: EmptyLongest[longest, tupleset], Longest, TupleSet] (val x: Self[Longest, TupleSet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Longest, TupleSet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Longest, TupleSet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Longest, TupleSet]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Longest, TupleSet]) with Other]
    @scala.inline
    def withEmpty(value: Longest): Self[Longest, TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Longest, any, [Longest, any]>[1] */ js.Any
    ): Self[Longest, TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

