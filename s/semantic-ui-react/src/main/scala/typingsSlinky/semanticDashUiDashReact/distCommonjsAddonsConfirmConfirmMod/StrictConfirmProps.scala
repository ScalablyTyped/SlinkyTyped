package typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsConfirmConfirmMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsButtonButtonMod.ButtonProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalMod.StrictModalProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`true`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.blurring
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.fullscreen
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.inverted
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictConfirmProps extends StrictModalProps {
  /** The cancel button text. */
  var cancelButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.undefined
  /** The OK button text. */
  var confirmButton: js.UndefOr[SemanticShorthandItem[ButtonProps]] = js.undefined
  /**
    * Called when the Modal is closed without clicking confirm.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onCancel: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
  ] = js.undefined
  /**
    * Called when the OK button is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onConfirm: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps, Unit]
  ] = js.undefined
}

object StrictConfirmProps {
  @scala.inline
  def apply(
    actions: SemanticShorthandItem[ModalActionsProps] = null,
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    cancelButton: SemanticShorthandItem[ButtonProps] = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    closeIcon: js.Any = null,
    closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined,
    confirmButton: SemanticShorthandItem[ButtonProps] = null,
    content: SemanticShorthandItem[ModalContentProps] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    dimmer: `true` | blurring | inverted = null,
    eventPool: String = null,
    header: SemanticShorthandItem[ModalHeaderProps] = null,
    mountNode: js.Any = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onActionClick: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit = null,
    onCancel: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit = null,
    onClose: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit = null,
    onConfirm: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ ConfirmProps) => Unit = null,
    onMount: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    onOpen: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ ModalProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | fullscreen = null,
    style: CSSProperties = null,
    trigger: TagMod[Any] = null,
    triggerRef: Ref[_] = null
  ): StrictConfirmProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDimmerClick)) __obj.updateDynamic("closeOnDimmerClick")(closeOnDimmerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave.asInstanceOf[js.Any])
    if (confirmButton != null) __obj.updateDynamic("confirmButton")(confirmButton.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2(onConfirm))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictConfirmProps]
  }
}

