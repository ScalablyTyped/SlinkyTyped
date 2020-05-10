package typingsSlinky.semanticUiReact.confirmConfirmMod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.buttonButtonMod.ButtonProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalModalMod.StrictModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictConfirmProps extends StrictModalProps {
  /** The cancel button text. */
  var cancelButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
  /** The OK button text. */
  var confirmButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.native
  /**
    * Called when the Modal is closed without clicking confirm.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onCancel: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
  ] = js.native
  /**
    * Called when the OK button is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onConfirm: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
  ] = js.native
}

object StrictConfirmProps {
  @scala.inline
  def apply(): StrictConfirmProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictConfirmProps]
  }
  @scala.inline
  implicit class StrictConfirmPropsOps[Self <: StrictConfirmProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelButtonFunction3(
      value: (/* component */ ReactComponentClass[ButtonProps], ButtonProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCancelButton(value: SemanticShorthandItem[ButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmButtonFunction3(
      value: (/* component */ ReactComponentClass[ButtonProps], ButtonProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButton")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withConfirmButton(value: SemanticShorthandItem[ButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
  }
  
}

