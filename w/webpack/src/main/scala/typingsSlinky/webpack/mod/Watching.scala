package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watching extends js.Object {
  def close(callback: js.Function0[Unit]): Unit = js.native
  def invalidate(): Unit = js.native
}

object Watching {
  @scala.inline
  def apply(close: js.Function0[Unit] => Unit, invalidate: () => Unit): Watching = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), invalidate = js.Any.fromFunction0(invalidate))
    __obj.asInstanceOf[Watching]
  }
  @scala.inline
  implicit class WatchingOps[Self <: Watching] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvalidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

