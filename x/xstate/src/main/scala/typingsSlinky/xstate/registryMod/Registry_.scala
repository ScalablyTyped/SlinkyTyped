package typingsSlinky.xstate.registryMod

import typingsSlinky.xstate.actorMod.Actor
import typingsSlinky.xstate.typesMod.AnyEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registry_ extends js.Object {
  def bookId(): String = js.native
  def free(id: String): Unit = js.native
  def get(id: String): js.UndefOr[Actor[_, AnyEventObject]] = js.native
  def register(id: String, actor: Actor[_, AnyEventObject]): String = js.native
}

object Registry_ {
  @scala.inline
  def apply(
    bookId: () => String,
    free: String => Unit,
    get: String => js.UndefOr[Actor[_, AnyEventObject]],
    register: (String, Actor[_, AnyEventObject]) => String
  ): Registry_ = {
    val __obj = js.Dynamic.literal(bookId = js.Any.fromFunction0(bookId), free = js.Any.fromFunction1(free), get = js.Any.fromFunction1(get), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Registry_]
  }
  @scala.inline
  implicit class Registry_Ops[Self <: Registry_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFree(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.UndefOr[Actor[_, AnyEventObject]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, Actor[_, AnyEventObject]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

