package typingsSlinky.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfo extends js.Object {
  var Component: ReactComponentClass[js.Object] = js.native
  var displayName: String = js.native
  var hookName: js.UndefOr[String] = js.native
  var nextHook: js.Any = js.native
  var nextProps: js.Any = js.native
  var nextState: js.Any = js.native
  var options: WhyDidYouRenderOptions = js.native
  var prevHook: js.Any = js.native
  var prevProps: js.Any = js.native
  var prevState: js.Any = js.native
  var reason: ReasonForUpdate = js.native
}

object UpdateInfo {
  @scala.inline
  def apply(
    Component: ReactComponentClass[js.Object],
    displayName: String,
    nextHook: js.Any,
    nextProps: js.Any,
    nextState: js.Any,
    options: WhyDidYouRenderOptions,
    prevHook: js.Any,
    prevProps: js.Any,
    prevState: js.Any,
    reason: ReasonForUpdate
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nextHook = nextHook.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevHook = prevHook.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextHook(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: WhyDidYouRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevHook(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: ReasonForUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHookName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHookName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookName")(js.undefined)
        ret
    }
  }
  
}

