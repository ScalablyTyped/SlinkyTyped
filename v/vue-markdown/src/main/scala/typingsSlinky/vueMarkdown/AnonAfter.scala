package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfter extends js.Object {
  var after: js.Any = js.native
  var at: js.Any = js.native
  var before: js.Any = js.native
  var disable: js.Any = js.native
  var enable: js.Any = js.native
  var enableOnly: js.Any = js.native
  var getRules: js.Any = js.native
  var push: js.Any = js.native
}

object AnonAfter {
  @scala.inline
  def apply(
    after: js.Any,
    at: js.Any,
    before: js.Any,
    disable: js.Any,
    enable: js.Any,
    enableOnly: js.Any,
    getRules: js.Any,
    push: js.Any
  ): AnonAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableOnly = enableOnly.asInstanceOf[js.Any], getRules = getRules.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
  @scala.inline
  implicit class AnonAfterOps[Self <: AnonAfter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableOnly(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

