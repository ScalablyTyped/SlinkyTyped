package typingsSlinky.semanticUiReact.formFormMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictFormProps extends FormHTMLAttributes[HTMLFormElement] {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Automatically show any error Message children. */
  var error: js.UndefOr[Boolean] = js.native
  /** A form can have its color inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Automatically show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.native
  /** The HTML form submit handler. */
  @JSName("onSubmit")
  var onSubmit_StrictFormProps: js.UndefOr[
    js.Function2[SyntheticEvent[EventTarget with HTMLFormElement, Event], /* data */ FormProps, Unit]
  ] = js.native
  /** A comment can contain a form to reply to a comment. This may have arbitrary content. */
  var reply: js.UndefOr[Boolean] = js.native
  /** A form can vary in size. */
  var size: js.UndefOr[String] = js.native
  /** Automatically show any success Message children. */
  var success: js.UndefOr[Boolean] = js.native
  /** A form can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.native
  /** Automatically show any warning Message children. */
  var warning: js.UndefOr[Boolean] = js.native
  /** Forms can automatically divide fields to be equal width. */
  var widths: js.UndefOr[equal] = js.native
}

object StrictFormProps {
  @scala.inline
  def apply(): StrictFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormProps]
  }
  @scala.inline
  implicit class StrictFormPropsOps[Self <: StrictFormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: (SyntheticEvent[EventTarget with HTMLFormElement, Event], /* data */ FormProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstackable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstackable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstackable")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
    @scala.inline
    def withWidths(value: equal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(js.undefined)
        ret
    }
  }
  
}

