package typingsSlinky.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookRegOptions extends js.Object {
  /**
    * Specifies what `this` is bound to during hook invocation.
    */
  var bind: js.UndefOr[js.Any] = js.native
  /**
    * Limits the number of times that the hook will be invoked.
    * Once the hook has been invoked this many times, it is automatically deregistered.
    */
  var invokeLimit: js.UndefOr[Double] = js.native
  /**
    * Sets the priority of the registered hook
    *
    * Hooks of the same type (onBefore, onStart, etc) are invoked in priority order.  A hook with a higher priority
    * is invoked before a hook with a lower priority.
    *
    * The default hook priority is 0
    */
  var priority: js.UndefOr[Double] = js.native
}

object HookRegOptions {
  @scala.inline
  def apply(): HookRegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookRegOptions]
  }
  @scala.inline
  implicit class HookRegOptionsOps[Self <: HookRegOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

