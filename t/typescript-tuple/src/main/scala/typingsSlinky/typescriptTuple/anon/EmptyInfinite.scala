package typingsSlinky.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyInfinite[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */] extends js.Object {
  var empty: NotFound = js.native
  var infinite: js.Any = js.native
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any = js.native
}

object EmptyInfinite {
  @scala.inline
  def apply[NotFound, Tuple, Type, Count](
    empty: NotFound,
    infinite: js.Any,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
  ): EmptyInfinite[NotFound, Tuple, Type, Count] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyInfinite[NotFound, Tuple, Type, Count]]
  }
  @scala.inline
  implicit class EmptyInfiniteOps[Self[notfound, tuple, `type`, count] <: EmptyInfinite[notfound, tuple, `type`, count], NotFound, Tuple, Type, Count] (val x: Self[NotFound, Tuple, Type, Count]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NotFound, Tuple, Type, Count] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NotFound, Tuple, Type, Count]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[NotFound, Tuple, Type, Count]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[NotFound, Tuple, Type, Count]) with Other]
    @scala.inline
    def withEmpty(value: NotFound): Self[NotFound, Tuple, Type, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: js.Any): Self[NotFound, Tuple, Type, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
    ): Self[NotFound, Tuple, Type, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

