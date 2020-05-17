package typingsSlinky.typescriptTuple.anon

import typingsSlinky.typescriptTuple.utilsMod.Concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteCODENAMEERROR[TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: js.Array[js.Any] = js.native
  var infinite: CODENAMEERROR = js.native
  var nonEmpty: Concat[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
    _
  ] = js.native
}

object InfiniteCODENAMEERROR {
  @scala.inline
  def apply[TupleSet](
    empty: js.Array[js.Any],
    infinite: CODENAMEERROR,
    nonEmpty: Concat[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
      _
    ]
  ): InfiniteCODENAMEERROR[TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteCODENAMEERROR[TupleSet]]
  }
  @scala.inline
  implicit class InfiniteCODENAMEERROROps[Self[tupleset] <: InfiniteCODENAMEERROR[tupleset], TupleSet] (val x: Self[TupleSet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TupleSet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TupleSet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TupleSet] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TupleSet] with Other]
    @scala.inline
    def withEmpty(value: js.Array[js.Any]): Self[TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: CODENAMEERROR): Self[TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(
      value: Concat[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.ConcatMultiple<typescript-tuple.typescript-tuple/lib/utils.Reverse<ReversedRest, []>> */ js.Object, 
          _
        ]
    ): Self[TupleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

