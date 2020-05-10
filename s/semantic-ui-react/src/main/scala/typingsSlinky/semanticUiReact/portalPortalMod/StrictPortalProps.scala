package typingsSlinky.semanticUiReact.portalPortalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictPortalProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Controls whether or not the portal should close on a click outside. */
  var closeOnDocumentClick: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should close when escape is pressed is displayed. */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether or not the portal should close when mousing out of the portal.
    * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
    * gap from the trigger to the portal.
    */
  var closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should close on blur of the trigger. */
  var closeOnTriggerBlur: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should close on click of the trigger. */
  var closeOnTriggerClick: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should close when mousing out of the trigger. */
  var closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.native
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /** Event pool namespace that is used to handle component events. */
  var eventPool: js.UndefOr[String] = js.native
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.native
  /** Milliseconds to wait before opening on mouse over */
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  /** Milliseconds to wait before closing on mouse leave */
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  /**
    * Called when a close event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps, Unit]
  ] = js.native
  /**
    * Called when the portal is mounted on the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.native
  /**
    * Called when an open event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps, Unit]
  ] = js.native
  /**
    * Called when the portal is unmounted from the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalProps, Unit]] = js.native
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should open when the trigger is clicked. */
  var openOnTriggerClick: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should open on focus of the trigger. */
  var openOnTriggerFocus: js.UndefOr[Boolean] = js.native
  /** Controls whether or not the portal should open when mousing over the trigger. */
  var openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.native
  /** Element to be rendered in-place where the portal is defined. */
  var trigger: js.UndefOr[TagMod[Any]] = js.native
  /** Called with a ref to the trigger node. */
  var triggerRef: js.UndefOr[Ref[_]] = js.native
}

object StrictPortalProps {
  @scala.inline
  def apply(): StrictPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPortalProps]
  }
  @scala.inline
  implicit class StrictPortalPropsOps[Self <: StrictPortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnDocumentClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDocumentClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnDocumentClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDocumentClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnPortalMouseLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnPortalMouseLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnPortalMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnPortalMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnTriggerBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnTriggerBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnTriggerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnTriggerMouseLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerMouseLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnTriggerMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTriggerMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPool")(js.undefined)
        ret
    }
    @scala.inline
    def withMountNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeaveDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseLeaveDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps) => Unit): Self = {
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
    def withOnMount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = {
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
    def withOnOpen(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ PortalProps) => Unit): Self = {
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
    def withOnUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Unit): Self = {
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
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnTriggerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnTriggerFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnTriggerFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnTriggerMouseEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerMouseEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnTriggerMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTriggerMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTriggerRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerRef")(null)
        ret
    }
  }
  
}

