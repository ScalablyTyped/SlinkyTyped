package typingsSlinky.storybookAddonKnobs.knobStoreMod

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.anon.DefaultValue
import typingsSlinky.storybookAddonKnobs.anon.typeanygroupIdstringundef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobStore extends js.Object {
  var callbacks: js.Array[Callback] = js.native
  var store: Record[String, KnobStoreKnob] = js.native
  var timer: js.UndefOr[Double] = js.native
  def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
  def getAll(): Record[String, KnobStoreKnob] = js.native
  def has(key: String): Boolean = js.native
  def markAllUnused(): Unit = js.native
  def reset(): Unit = js.native
  def set(key: String, value: KnobStoreKnob): Unit = js.native
  def subscribe(cb: Callback): Unit = js.native
  def unsubscribe(cb: Callback): Unit = js.native
  def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
}

object KnobStore {
  @scala.inline
  def apply(
    callbacks: js.Array[Callback],
    get: String => typeanygroupIdstringundef | DefaultValue,
    getAll: () => Record[String, KnobStoreKnob],
    has: String => Boolean,
    markAllUnused: () => Unit,
    reset: () => Unit,
    set: (String, KnobStoreKnob) => Unit,
    store: Record[String, KnobStoreKnob],
    subscribe: Callback => Unit,
    unsubscribe: Callback => Unit,
    update: (String, Partial[KnobStoreKnob]) => Unit
  ): KnobStore = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), has = js.Any.fromFunction1(has), markAllUnused = js.Any.fromFunction0(markAllUnused), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[KnobStore]
  }
  @scala.inline
  implicit class KnobStoreOps[Self <: KnobStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbacks(value: js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: String => typeanygroupIdstringundef | DefaultValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAll(value: () => Record[String, KnobStoreKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAllUnused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAllUnused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, KnobStoreKnob) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStore(value: Record[String, KnobStoreKnob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribe(value: Callback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: Callback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, Partial[KnobStoreKnob]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
  }
  
}

