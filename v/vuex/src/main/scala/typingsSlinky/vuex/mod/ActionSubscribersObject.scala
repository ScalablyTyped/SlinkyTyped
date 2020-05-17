package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSubscribersObject[P, S] extends SubscribeActionOptions[P, S] {
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.native
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.native
}

object ActionSubscribersObject {
  @scala.inline
  def apply[P, S](): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
  @scala.inline
  implicit class ActionSubscribersObjectOps[Self[p, s] <: ActionSubscribersObject[p, s], P, S] (val x: Self[P, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S]) with Other]
    @scala.inline
    def withAfter(value: (P, S) => js.Any): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: (P, S) => js.Any): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
  }
  
}

