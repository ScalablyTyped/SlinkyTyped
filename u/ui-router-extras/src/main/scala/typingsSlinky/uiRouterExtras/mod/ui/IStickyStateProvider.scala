package typingsSlinky.uiRouterExtras.mod.ui

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state provider
  */
@js.native
trait IStickyStateProvider extends IServiceProvider {
  def debugMode(): Boolean = js.native
  def enableDebug(enabled: Boolean): Boolean = js.native
  def registerStickyState(state: IStickyState): Unit = js.native
}

object IStickyStateProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    debugMode: () => Boolean,
    enableDebug: Boolean => Boolean,
    registerStickyState: IStickyState => Unit
  ): IStickyStateProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], debugMode = js.Any.fromFunction0(debugMode), enableDebug = js.Any.fromFunction1(enableDebug), registerStickyState = js.Any.fromFunction1(registerStickyState))
    __obj.asInstanceOf[IStickyStateProvider]
  }
  @scala.inline
  implicit class IStickyStateProviderOps[Self <: IStickyStateProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableDebug(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterStickyState(value: IStickyState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerStickyState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

