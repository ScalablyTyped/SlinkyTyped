package typingsSlinky.xEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEditable extends js.Object {
  var options: XEditableOptions = js.native
  def activate(): Unit = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getValue(isSingle: Boolean): js.Any = js.native
  def hide(): Unit = js.native
  def option(key: js.Any, value: js.Any): Unit = js.native
  def setValue(value: js.Any, convertStr: Boolean): Unit = js.native
  def show(closeAll: Boolean): Unit = js.native
  def submit(options: XEditableSubmitOptions): Unit = js.native
  def toggle(closeAll: Boolean): Unit = js.native
  def toggleDisabled(): Unit = js.native
  def validate(): Unit = js.native
}

object XEditable {
  @scala.inline
  def apply(
    activate: () => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    getValue: Boolean => js.Any,
    hide: () => Unit,
    option: (js.Any, js.Any) => Unit,
    options: XEditableOptions,
    setValue: (js.Any, Boolean) => Unit,
    show: Boolean => Unit,
    submit: XEditableSubmitOptions => Unit,
    toggle: Boolean => Unit,
    toggleDisabled: () => Unit,
    validate: () => Unit
  ): XEditable = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getValue = js.Any.fromFunction1(getValue), hide = js.Any.fromFunction0(hide), option = js.Any.fromFunction2(option), options = options.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), show = js.Any.fromFunction1(show), submit = js.Any.fromFunction1(submit), toggle = js.Any.fromFunction1(toggle), toggleDisabled = js.Any.fromFunction0(toggleDisabled), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[XEditable]
  }
  @scala.inline
  implicit class XEditableOps[Self <: XEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOption(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: XEditableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: (js.Any, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: XEditableSubmitOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggle(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleDisabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

