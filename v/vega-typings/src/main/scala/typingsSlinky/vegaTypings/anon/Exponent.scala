package typingsSlinky.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exponent extends js.Object {
  var exponent: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var extra: js.UndefOr[Boolean] = js.native
  var mult: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var offset: js.UndefOr[
    Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
  ] = js.native
  var round: js.UndefOr[Boolean] = js.native
}

object Exponent {
  @scala.inline
  def apply(): Exponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponent]
  }
  @scala.inline
  implicit class ExponentOps[Self <: Exponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExponent(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withMult(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(
      value: Double | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-typings.vega-typings/types/spec/encode.NumericValueRef */ js.Object)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
  }
  
}

