package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wegameApiStrings.done
import typingsSlinky.wegameApi.wegameApiStrings.go
import typingsSlinky.wegameApi.wegameApiStrings.next
import typingsSlinky.wegameApi.wegameApiStrings.search
import typingsSlinky.wegameApi.wegameApiStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfirmHold extends js.Object {
  /**
    * 当点击完成时键盘是否收起
    */
  var confirmHold: js.UndefOr[Boolean] = js.native
  /**
    * 键盘右下角 confirm 按钮的类型，只影响按钮的文本内容
    */
  var confirmType: js.UndefOr[done | next | search | go | send] = js.native
  /**
    * 键盘输入框显示的默认值
    */
  var defaultValue: String = js.native
  /**
    * 键盘中文本的最大长度
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * 是否为多行输入
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object AnonConfirmHold {
  @scala.inline
  def apply(defaultValue: String): AnonConfirmHold = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmHold]
  }
  @scala.inline
  implicit class AnonConfirmHoldOps[Self <: AnonConfirmHold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmHold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmHold")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmType(value: done | next | search | go | send): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
  }
  
}

