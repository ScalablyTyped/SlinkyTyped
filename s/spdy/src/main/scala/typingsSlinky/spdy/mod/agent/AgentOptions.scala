package typingsSlinky.spdy.mod.agent

import typingsSlinky.spdy.anon.Plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOptions
  extends typingsSlinky.node.httpsMod.AgentOptions {
  var spdy: js.UndefOr[Plain] = js.native
}

object AgentOptions {
  @scala.inline
  def apply(): AgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOptions]
  }
  @scala.inline
  implicit class AgentOptionsOps[Self <: AgentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpdy(value: Plain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spdy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpdy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spdy")(js.undefined)
        ret
    }
  }
  
}

