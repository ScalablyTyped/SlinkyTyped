package typingsSlinky.uirouterCore.transitionInterfaceMod

import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import typingsSlinky.uirouterCore.uirouterCoreStrings.otherwise
import typingsSlinky.uirouterCore.uirouterCoreStrings.redirect
import typingsSlinky.uirouterCore.uirouterCoreStrings.sref
import typingsSlinky.uirouterCore.uirouterCoreStrings.unknown
import typingsSlinky.uirouterCore.uirouterCoreStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends js.Object {
  /** @internalapi */
  var current: js.UndefOr[js.Function0[Transition]] = js.native
  /**
    * You can define your own Transition Options inside this property and use them, e.g., from a Transition Hook
    */
  var custom: js.UndefOr[js.Any] = js.native
  /**
    * This option sets whether or not the transition's parameter values should be inherited from
    * the current parameter values.
    *
    * - If `true`, it will inherit parameter values from the current parameter values.
    * - If `false`, only the parameters which are provided to `transitionTo` will be used.
    *
    * @default `false`
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * This option changes how the Transition interacts with the browser's location bar (URL).
    *
    * - If `true`, it will update the url in the location bar.
    * - If `false`, it will not update the url in the location bar.
    * - If it is the string `"replace"`, it will update the url and also replace the last history record.
    *
    * @default `true`
    */
  var location: js.UndefOr[Boolean | String] = js.native
  /**
    * @deprecated
    */
  @JSName("notify")
  var notify_FTransitionOptions: js.UndefOr[Boolean] = js.native
  /** @internalapi
    * If this transition is a redirect, this property should be the original Transition (which was redirected to this one)
    */
  var redirectedFrom: js.UndefOr[Transition] = js.native
  /**
    * When transitioning to relative path (e.g '`^`'), this option defines which state to be relative from.
    * @default `$state.current`
    */
  var relative: js.UndefOr[String | StateDeclaration | StateObject] = js.native
  /**
    * This option may be used to force states which are currently active to reload.
    *
    * During a normal transition, a state is "retained" if:
    * - It was previously active
    * - The state's parameter values have not changed
    * - All the parent states' parameter values have not changed
    *
    * Forcing a reload of a state will cause it to be exited and entered, which will:
    * - Refetch that state's resolve data
    * - Exit the state (onExit hook)
    * - Re-enter the state (onEnter hook)
    * - Re-render the views (controllers and templates)
    *
    * - When `true`, the destination state (and all parent states) will be reloaded.
    * - When it is a string and is the name of a state, or when it is a State object,
    *   that state and any children states will be reloaded.
    *
    * @default `false`
    */
  var reload: js.UndefOr[Boolean | String | StateDeclaration | StateObject] = js.native
  /** @internalapi */
  var reloadState: js.UndefOr[StateObject] = js.native
  /** @internalapi */
  var source: js.UndefOr[sref | url | redirect | otherwise | unknown] = js.native
  /**
    * This option may be used to cancel the active transition (if one is active) in favour of the this one.
    * This is the default behaviour or ui-router.
    *
    *
    * - When `true`, the active transition will be canceled and new transition will begin.
    * - when `false`, the transition will be canceled if a transition is already running. This can be useful in cases where
    * you only want to navigate to a different state if you are not already navigating somewhere.
    *
    * @default `true`
    */
  var supercede: js.UndefOr[Boolean] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: () => Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectedFrom(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectedFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectedFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: String | StateDeclaration | StateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: Boolean | String | StateDeclaration | StateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadState(value: StateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadState")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: sref | url | redirect | otherwise | unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSupercede(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supercede")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupercede: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supercede")(js.undefined)
        ret
    }
  }
  
}

