package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.anon.Empty
import typingsSlinky.stripejs.anon.Invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[Empty] = js.native
  /**
    * Whether or not the input is disabled
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the icon should be hidden
    * @default false
    */
  var hideIcon: js.UndefOr[Boolean] = js.native
  /**
    * Customize appearance using CSS properties
    */
  var style: js.UndefOr[Invalid] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: Empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Invalid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

