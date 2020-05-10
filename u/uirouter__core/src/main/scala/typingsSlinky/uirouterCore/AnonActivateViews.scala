package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivateViews extends js.Object {
  var activateViews: js.Function = js.native
  var addCoreResolves: js.Function = js.native
  var eagerResolve: js.Function = js.native
  var ignored: js.Function = js.native
  var invalid: js.Function = js.native
  var lazyLoad: js.Function = js.native
  var lazyResolve: js.Function = js.native
  var loadViews: js.Function = js.native
  var onEnter: js.Function = js.native
  var onExit: js.Function = js.native
  var onRetain: js.Function = js.native
  var redirectTo: js.Function = js.native
  var resolveAll: js.Function = js.native
  var updateGlobals: js.Function = js.native
  var updateUrl: js.Function = js.native
}

object AnonActivateViews {
  @scala.inline
  def apply(
    activateViews: js.Function,
    addCoreResolves: js.Function,
    eagerResolve: js.Function,
    ignored: js.Function,
    invalid: js.Function,
    lazyLoad: js.Function,
    lazyResolve: js.Function,
    loadViews: js.Function,
    onEnter: js.Function,
    onExit: js.Function,
    onRetain: js.Function,
    redirectTo: js.Function,
    resolveAll: js.Function,
    updateGlobals: js.Function,
    updateUrl: js.Function
  ): AnonActivateViews = {
    val __obj = js.Dynamic.literal(activateViews = activateViews.asInstanceOf[js.Any], addCoreResolves = addCoreResolves.asInstanceOf[js.Any], eagerResolve = eagerResolve.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], lazyLoad = lazyLoad.asInstanceOf[js.Any], lazyResolve = lazyResolve.asInstanceOf[js.Any], loadViews = loadViews.asInstanceOf[js.Any], onEnter = onEnter.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], onRetain = onRetain.asInstanceOf[js.Any], redirectTo = redirectTo.asInstanceOf[js.Any], resolveAll = resolveAll.asInstanceOf[js.Any], updateGlobals = updateGlobals.asInstanceOf[js.Any], updateUrl = updateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActivateViews]
  }
  @scala.inline
  implicit class AnonActivateViewsOps[Self <: AnonActivateViews] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateViews(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCoreResolves(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCoreResolves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEagerResolve(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eagerResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnored(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyLoad(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyResolve(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadViews(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnEnter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnExit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRetain(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRetain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectTo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveAll(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateGlobals(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateUrl(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

