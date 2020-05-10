package typingsSlinky.vegaTypings.streamMod

import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.marktypeMod.MarkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamParameters extends js.Object {
  var between: js.UndefOr[js.Array[Stream]] = js.native
  var consume: js.UndefOr[Boolean] = js.native
  var debounce: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[Expr | js.Array[Expr]] = js.native
  var markname: js.UndefOr[String] = js.native
  var marktype: js.UndefOr[MarkType] = js.native
  var throttle: js.UndefOr[Double] = js.native
}

object StreamParameters {
  @scala.inline
  def apply(): StreamParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamParameters]
  }
  @scala.inline
  implicit class StreamParametersOps[Self <: StreamParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetween(value: js.Array[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetween: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.undefined)
        ret
    }
    @scala.inline
    def withConsume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consume")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Expr | js.Array[Expr]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markname")(js.undefined)
        ret
    }
    @scala.inline
    def withMarktype(value: MarkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marktype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarktype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marktype")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
  }
  
}

