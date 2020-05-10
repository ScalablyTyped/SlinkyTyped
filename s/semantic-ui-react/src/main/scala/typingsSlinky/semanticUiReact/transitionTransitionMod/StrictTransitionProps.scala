package typingsSlinky.semanticUiReact.transitionTransitionMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticTRANSITIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTransitionProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Whether it is directional animation event or not. Use it only for custom transitions. */
  var directional: js.UndefOr[Boolean] = js.native
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.native
  /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
  var mountOnShow: js.UndefOr[Boolean] = js.native
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onComplete: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onShow: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  /** React's key of the element. */
  var reactKey: js.UndefOr[String] = js.native
  /** Run the enter animation when the component mounts, if it is initially shown. */
  var transitionOnMount: js.UndefOr[Boolean] = js.native
  /** Unmount the component (remove it from the DOM) when it is not shown. */
  var unmountOnHide: js.UndefOr[Boolean] = js.native
  /** Show the component; triggers the enter or exit animation. */
  var visible: js.UndefOr[Boolean] = js.native
}

object StrictTransitionProps {
  @scala.inline
  def apply(): StrictTransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTransitionProps]
  }
  @scala.inline
  implicit class StrictTransitionPropsOps[Self <: StrictTransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: SemanticTRANSITIONS | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
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
    def withDirectional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directional")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | String | TransitionPropDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountOnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = {
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
    def withOnShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = {
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
    def withReactKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

