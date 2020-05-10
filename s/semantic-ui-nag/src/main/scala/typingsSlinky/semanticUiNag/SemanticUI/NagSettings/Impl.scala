package typingsSlinky.semanticUiNag.SemanticUI.NagSettings

import typingsSlinky.semanticUiNag.JQuery
import typingsSlinky.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typingsSlinky.semanticUiNag.semanticUiNagBooleans.`false`
import typingsSlinky.semanticUiNag.semanticUiNagStrings.cookie
import typingsSlinky.semanticUiNag.semanticUiNagStrings.localstorage
import typingsSlinky.semanticUiNag.semanticUiNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var animation: AnimationSettings = js.native
  // endregion
  // region DOM Settings
  var className: ClassNameSettings = js.native
  /**
    * @default false
    */
  var context: `false` | String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * @default false
    */
  var detachable: Boolean = js.native
  /**
    * set to zero to require manually dismissal, otherwise hides on its own
    *
    * @default 0
    */
  var displayTime: Double = js.native
  /**
    * @default false
    */
  var domain: `false` | String = js.native
  /**
    * @default 'easeOutQuad'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * @default 30
    */
  var expires: Double = js.native
  /**
    * @default 'nag'
    */
  var key: js.Any = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * @default '/'
    */
  var path: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // region Behavior
  /**
    * allows cookie to be overridden
    *
    * @default false
    */
  var persist: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * @default 500
    */
  var speed: Double = js.native
  /**
    * type of storage to use
    *
    * @default 'cookie'
    */
  var storageMethod: cookie | localstorage | sessionstorage = js.native
  /**
    * @default 'dismiss'
    */
  var value: js.Any = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  def onHide(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    animation: AnimationSettings,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    displayTime: Double,
    domain: `false` | String,
    easing: String,
    error: ErrorSettings,
    expires: Double,
    key: js.Any,
    name: String,
    namespace: String,
    onHide: () => Unit,
    path: String,
    performance: Boolean,
    persist: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    speed: Double,
    storageMethod: cookie | localstorage | sessionstorage,
    value: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], displayTime = displayTime.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], storageMethod = storageMethod.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnimationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: `false` | String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageMethod(value: cookie | localstorage | sessionstorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

