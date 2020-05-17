package typingsSlinky.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fit[Holder /* <: js.Array[_] */, Count /* <: Double */] extends js.Object {
  var fit: Holder = js.native
  var unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object = js.native
  var union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object = js.native
}

object Fit {
  @scala.inline
  def apply[Holder, Count](
    fit: Holder,
    unfit: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object,
    union: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
  ): Fit[Holder, Count] = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fit[Holder, Count]]
  }
  @scala.inline
  implicit class FitOps[Self[holder, count] <: Fit[holder, count], Holder, Count] (val x: Self[Holder, Count]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Holder, Count] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Holder, Count]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Holder, Count]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Holder, Count]) with Other]
    @scala.inline
    def withFit(value: Holder): Self[Holder, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnfit(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Count, typescript-tuple.typescript-tuple/lib/utils.Prepend<Holder, Type>> */ js.Object
    ): Self[Holder, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnion(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typescript-tuple.typescript-tuple/lib/utils.Repeat<Type, Holder['length'], []> */ js.Object
    ): Self[Holder, Count] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

