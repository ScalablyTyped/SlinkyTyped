package typingsSlinky.typescriptTuple

import typingsSlinky.typescriptTuple.utilsMod.Reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBefore[Tuple /* <: js.Array[_] */, Holder /* <: js.Array[_] */] extends js.Object {
  var before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object = js.native
  var end: Reverse[Holder, js.Array[js.Any]] = js.native
  var start: js.Any = js.native
}

object AnonBefore {
  @scala.inline
  def apply[Tuple, Holder](
    before: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object,
    end: Reverse[Holder, js.Array[js.Any]],
    start: js.Any
  ): AnonBefore[Tuple, Holder] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBefore[Tuple, Holder]]
  }
  @scala.inline
  implicit class AnonBeforeOps[Self[tuple, holder] <: AnonBefore[tuple, holder], Tuple, Holder] (val x: Self[Tuple, Holder]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Tuple, Holder] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Tuple, Holder]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Tuple, Holder]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Tuple, Holder]) with Other]
    @scala.inline
    def withBefore(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.SliceStartQuantity<typescript-tuple.typescript-tuple/lib/utils.Tail<Tuple>, Start, Quantity, Holder, typescript-tuple.typescript-tuple/lib/utils.Prepend<Count, Count['length']>> */ js.Object
    ): Self[Tuple, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Reverse[Holder, js.Array[js.Any]]): Self[Tuple, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self[Tuple, Holder] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

