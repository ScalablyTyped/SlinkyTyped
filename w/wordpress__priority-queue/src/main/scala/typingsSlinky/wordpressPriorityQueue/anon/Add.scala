package typingsSlinky.wordpressPriorityQueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Add extends js.Object {
  def add(context: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def flush(context: js.Object): Boolean = js.native
}

object Add {
  @scala.inline
  def apply(add: (js.Object, js.Function0[Unit]) => Unit, flush: js.Object => Boolean): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), flush = js.Any.fromFunction1(flush))
    __obj.asInstanceOf[Add]
  }
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Object, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlush(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

