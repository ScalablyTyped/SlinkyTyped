package typingsSlinky.telejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowClass: Boolean = js.native
  var allowDate: Boolean = js.native
  var allowFunction: Boolean = js.native
  var allowRegExp: Boolean = js.native
  var allowSymbol: Boolean = js.native
  var allowUndefined: Boolean = js.native
  var lazyEval: Boolean = js.native
  var maxDepth: Double = js.native
  var space: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    allowClass: Boolean,
    allowDate: Boolean,
    allowFunction: Boolean,
    allowRegExp: Boolean,
    allowSymbol: Boolean,
    allowUndefined: Boolean,
    lazyEval: Boolean,
    maxDepth: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowClass = allowClass.asInstanceOf[js.Any], allowDate = allowDate.asInstanceOf[js.Any], allowFunction = allowFunction.asInstanceOf[js.Any], allowRegExp = allowRegExp.asInstanceOf[js.Any], allowSymbol = allowSymbol.asInstanceOf[js.Any], allowUndefined = allowUndefined.asInstanceOf[js.Any], lazyEval = lazyEval.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withAllowDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowRegExp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyEval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
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

