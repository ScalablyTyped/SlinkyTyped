package typingsSlinky.semanticUiReact.transitionablePortalTransitionablePortalMod

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.portalPortalMod.PortalProps
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionEventData
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTransitionablePortalProps extends js.Object {
  /** Primary content. */
  var children: TagMod[Any] = js.native
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onClose: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.native
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.native
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and internal state.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState, Unit]
  ] = js.native
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* nothing */ Null, 
      /* data */ TransitionEventData with TransitionablePortalState, 
      Unit
    ]
  ] = js.native
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /** Transition props. */
  var transition: js.UndefOr[TransitionProps] = js.native
}

object StrictTransitionablePortalProps {
  @scala.inline
  def apply(): StrictTransitionablePortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTransitionablePortalProps]
  }
  @scala.inline
  implicit class StrictTransitionablePortalPropsOps[Self <: StrictTransitionablePortalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnClose(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): Self = {
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
    def withOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit): Self = {
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
    def withOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
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
    def withTransition(value: TransitionProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

