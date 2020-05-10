package typingsSlinky.wordpressData.mod

import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S, A /* <: AnyAction */] extends js.Object {
  var subscribe: Subscriber = js.native
  def dispatch(action: A): A = js.native
  def getState(): S = js.native
}

object Store {
  @scala.inline
  def apply[S, A](
    dispatch: A => A,
    getState: () => S,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): Store[S, A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Store[S, A]]
  }
  @scala.inline
  implicit class StoreOps[Self[s, a] <: Store[s, a], S, A] (val x: Self[S, A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, A]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, A]) with Other]
    @scala.inline
    def withDispatch(value: A => A): Self[S, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => S): Self[S, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self[S, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

