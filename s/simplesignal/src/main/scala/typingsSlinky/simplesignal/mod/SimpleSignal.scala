package typingsSlinky.simplesignal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any = js.native
  def add(func: F): Boolean = js.native
  def dispatch(args: js.Any*): Unit = js.native
  def numItems: Double = js.native
  def remove(func: F): Boolean = js.native
  def removeAll(): Boolean = js.native
}

object SimpleSignal {
  @scala.inline
  def apply[F](
    add: F => Boolean,
    dispatch: /* repeated */ js.Any => Unit,
    functions: js.Any,
    numItems: () => Double,
    remove: F => Boolean,
    removeAll: () => Boolean
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispatch = js.Any.fromFunction1(dispatch), functions = functions.asInstanceOf[js.Any], numItems = js.Any.fromFunction0(numItems), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll))
    __obj.asInstanceOf[SimpleSignal[F]]
  }
  @scala.inline
  implicit class SimpleSignalOps[Self[f] <: SimpleSignal[f], F] (val x: Self[F]) extends AnyVal {
    @scala.inline
    def duplicate: Self[F] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[F]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[F] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[F] with Other]
    @scala.inline
    def withAdd(value: F => Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispatch(value: /* repeated */ js.Any => Unit): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFunctions(value: js.Any): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumItems(value: () => Double): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: F => Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAll(value: () => Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

