package typingsSlinky.webpackEnv.WebpackModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Ignore changes made to declined modules.
    */
  var ignoreDeclined: js.UndefOr[Boolean] = js.native
  /**
    *  Ignore errors throw in accept handlers, error handlers and while reevaluating module.
    */
  var ignoreErrored: js.UndefOr[Boolean] = js.native
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: js.UndefOr[Boolean] = js.native
  /**
    * Notifier for accepted modules.
    */
  var onAccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for declined modules.
    */
  var onDeclined: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for disposed modules.
    */
  var onDisposed: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for errors.
    */
  var onErrored: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
  /**
    * Notifier for unaccepted modules.
    */
  var onUnaccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.native
}

object AcceptOptions {
  @scala.inline
  def apply(): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptOptions]
  }
  @scala.inline
  implicit class AcceptOptionsOps[Self <: AcceptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoApply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoApply")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDeclined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeclined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDeclined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDeclined")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrored")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnaccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnaccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnaccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnaccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccepted(value: /* info */ HotNotifierInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccepted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeclined(value: /* info */ HotNotifierInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeclined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeclined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeclined")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisposed(value: /* info */ HotNotifierInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrored(value: /* info */ HotNotifierInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrored")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrored")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnaccepted(value: /* info */ HotNotifierInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnaccepted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnaccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnaccepted")(js.undefined)
        ret
    }
  }
  
}

