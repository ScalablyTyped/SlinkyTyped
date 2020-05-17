package typingsSlinky.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenAction extends js.Object {
  var d: Double = js.native
  var funct: js.Function = js.native
  var next: TweenAction = js.native
  var params: js.Array[_] = js.native
  var prev: TweenAction = js.native
  var scope: js.Any = js.native
  var t: Double = js.native
}

object TweenAction {
  @scala.inline
  def apply(
    d: Double,
    funct: js.Function,
    next: TweenAction,
    params: js.Array[_],
    prev: TweenAction,
    scope: js.Any,
    t: Double
  ): TweenAction = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], funct = funct.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenAction]
  }
  @scala.inline
  implicit class TweenActionOps[Self <: TweenAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunct(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: TweenAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: TweenAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

