package typingsSlinky.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterLike extends js.Object {
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ Twitter, Unit]): Unit = js.native
}

object TwitterLike {
  @scala.inline
  def apply(ready: js.Function1[/* twttr */ Twitter, Unit] => Unit): TwitterLike = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1(ready))
    __obj.asInstanceOf[TwitterLike]
  }
  @scala.inline
  implicit class TwitterLikeOps[Self <: TwitterLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReady(value: js.Function1[/* twttr */ Twitter, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

