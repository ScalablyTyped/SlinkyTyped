package typingsSlinky.storybookAddonA11y.a11YPanelMod

import typingsSlinky.axeCore.mod.Result
import typingsSlinky.storybookAddonA11y.storybookAddonA11yStrings.ran
import typingsSlinky.storybookAddonA11y.storybookAddonA11yStrings.ready
import typingsSlinky.storybookAddonA11y.storybookAddonA11yStrings.running
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11YPanelNormalState extends A11YPanelState {
  var incomplete: js.Array[Result] = js.native
  var passes: js.Array[Result] = js.native
  var status: ready | ran | running = js.native
  var violations: js.Array[Result] = js.native
}

object A11YPanelNormalState {
  @scala.inline
  def apply(
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    status: ready | ran | running,
    violations: js.Array[Result]
  ): A11YPanelNormalState = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11YPanelNormalState]
  }
  @scala.inline
  implicit class A11YPanelNormalStateOps[Self <: A11YPanelNormalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomplete(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasses(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ready | ran | running): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViolations(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

