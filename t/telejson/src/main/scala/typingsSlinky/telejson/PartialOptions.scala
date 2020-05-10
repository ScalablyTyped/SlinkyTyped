package typingsSlinky.telejson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<telejson.telejson.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowClass: js.UndefOr[Boolean] = js.native
  var allowDate: js.UndefOr[Boolean] = js.native
  var allowFunction: js.UndefOr[Boolean] = js.native
  var allowRegExp: js.UndefOr[Boolean] = js.native
  var allowSymbol: js.UndefOr[Boolean] = js.native
  var allowUndefined: js.UndefOr[Boolean] = js.native
  var lazyEval: js.UndefOr[Boolean] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var space: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRegExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyEval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyEval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

