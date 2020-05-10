package typingsSlinky.semanticUiReact.modalModalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsSlinky.semanticUiReact.modalContentMod.ModalContentProps
import typingsSlinky.semanticUiReact.modalHeaderMod.ModalHeaderProps
import typingsSlinky.semanticUiReact.portalPortalMod.StrictPortalProps
import typingsSlinky.semanticUiReact.semanticUiReactBooleans.`true`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.blurring
import typingsSlinky.semanticUiReact.semanticUiReactStrings.fullscreen
import typingsSlinky.semanticUiReact.semanticUiReactStrings.inverted
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictModalProps extends StrictPortalProps {
  /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
  var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A Modal can reduce its complexity */
  var basic: js.UndefOr[Boolean] = js.native
  /** A modal can be vertically centered in the viewport */
  var centered: js.UndefOr[Boolean] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Icon. */
  var closeIcon: js.UndefOr[js.Any] = js.native
  /** Whether or not the Modal should close when the dimmer is clicked. */
  var closeOnDimmerClick: js.UndefOr[Boolean] = js.native
  /** A Modal can be passed content via shorthand. */
  var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.native
  /** A modal can appear in a dimmer. */
  var dimmer: js.UndefOr[`true` | blurring | inverted] = js.native
  /** A Modal can be passed header via shorthand. */
  var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.native
  /**
    * Action onClick handler when using shorthand `actions`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onActionClick: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps, Unit]
  ] = js.native
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.native
  /** A modal can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.native
  /** Custom styles. */
  var style: js.UndefOr[CSSProperties] = js.native
}

object StrictModalProps {
  @scala.inline
  def apply(): StrictModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictModalProps]
  }
  @scala.inline
  implicit class StrictModalPropsOps[Self <: StrictModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionsFunction3(
      value: (/* component */ ReactComponentClass[ModalActionsProps], ModalActionsProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withActions(value: SemanticShorthandItem[ModalActionsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
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
    def withBasic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(js.undefined)
        ret
    }
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnDimmerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDimmerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnDimmerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDimmerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentFunction3(
      value: (/* component */ ReactComponentClass[ModalContentProps], ModalContentProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withContent(value: SemanticShorthandItem[ModalContentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDimmer(value: `true` | blurring | inverted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFunction3(
      value: (/* component */ ReactComponentClass[ModalHeaderProps], ModalHeaderProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHeader(value: SemanticShorthandItem[ModalHeaderProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: mini | tiny | small | large | fullscreen): Self = {
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
    def withStyle(value: CSSProperties): Self = {
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

