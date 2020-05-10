package typingsSlinky.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyNonEmpty[Shortest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Shortest = js.native
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any = js.native
}

object AnonEmptyNonEmpty {
  @scala.inline
  def apply[Shortest, TupleSet](
    empty: Shortest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
  ): AnonEmptyNonEmpty[Shortest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyNonEmpty[Shortest, TupleSet]]
  }
  @scala.inline
  implicit class AnonEmptyNonEmptyOps[Self[shortest, tupleset] <: AnonEmptyNonEmpty[shortest, tupleset], Shortest, TupleSet] (val x: Self[Shortest, TupleSet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Shortest, TupleSet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Shortest, TupleSet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Shortest, TupleSet]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Shortest, TupleSet]) with Other]
    @scala.inline
    def withEmpty(value: Shortest): Self[Shortest, TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
    ): Self[Shortest, TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

