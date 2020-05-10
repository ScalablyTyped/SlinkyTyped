package typingsSlinky.vueSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectWatch extends js.Object {
  def created(): Unit = js.native
  def multiple(reset: Boolean): Unit = js.native
  def mutableOptions(): Unit = js.native
  def mutableValue(`val`: js.Any, old: js.Any): Unit = js.native
  def options(`val`: js.Any): Unit = js.native
  def value(`val`: js.Any): Unit = js.native
}

object VueSelectWatch {
  @scala.inline
  def apply(
    created: () => Unit,
    multiple: Boolean => Unit,
    mutableOptions: () => Unit,
    mutableValue: (js.Any, js.Any) => Unit,
    options: js.Any => Unit,
    value: js.Any => Unit
  ): VueSelectWatch = {
    val __obj = js.Dynamic.literal(created = js.Any.fromFunction0(created), multiple = js.Any.fromFunction1(multiple), mutableOptions = js.Any.fromFunction0(mutableOptions), mutableValue = js.Any.fromFunction2(mutableValue), options = js.Any.fromFunction1(options), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[VueSelectWatch]
  }
  @scala.inline
  implicit class VueSelectWatchOps[Self <: VueSelectWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMutableOptions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMutableValue(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

