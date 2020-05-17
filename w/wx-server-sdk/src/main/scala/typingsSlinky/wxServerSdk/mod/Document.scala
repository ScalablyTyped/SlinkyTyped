package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.DataAny
import typingsSlinky.wxServerSdk.anon.Id
import typingsSlinky.wxServerSdk.anon.Stats
import typingsSlinky.wxServerSdk.anon.Stats1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def get(): js.Promise[DataAny] = js.native
  def remove(): js.Promise[Stats1] = js.native
  def set(options: CommonOption[_]): js.Promise[Id] = js.native
  def update(options: CommonOption[_]): js.Promise[Stats] = js.native
}

object Document {
  @scala.inline
  def apply(
    get: () => js.Promise[DataAny],
    remove: () => js.Promise[Stats1],
    set: CommonOption[_] => js.Promise[Id],
    update: CommonOption[_] => js.Promise[Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => js.Promise[DataAny]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => js.Promise[Stats1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: CommonOption[_] => js.Promise[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: CommonOption[_] => js.Promise[Stats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

