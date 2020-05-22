package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.anon.DataAny
import typingsSlinky.wxServerSdk.anon.Id
import typingsSlinky.wxServerSdk.anon.Stats
import typingsSlinky.wxServerSdk.anon.Stats1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def get(): js.Promise[DataAny]
  def remove(): js.Promise[Stats1]
  def set(options: CommonOption[_]): js.Promise[Id]
  def update(options: CommonOption[_]): js.Promise[Stats]
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
}

