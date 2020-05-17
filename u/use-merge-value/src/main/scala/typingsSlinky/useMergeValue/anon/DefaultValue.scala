package typingsSlinky.useMergeValue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValue[T] extends js.Object {
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ T, /* prevValue */ T, Unit]] = js.native
  var postState: js.UndefOr[js.Function1[/* value */ T, T]] = js.native
  var value: js.UndefOr[T] = js.native
}

object DefaultValue {
  @scala.inline
  def apply[T](): DefaultValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue[T]]
  }
  @scala.inline
  implicit class DefaultValueOps[Self[t] <: DefaultValue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultValueFunction0(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultValue(value: T | js.Function0[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* value */ T, /* prevValue */ T) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPostState(value: /* value */ T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostState: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postState")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

