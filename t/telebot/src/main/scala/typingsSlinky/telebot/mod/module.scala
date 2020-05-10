package typingsSlinky.telebot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait module extends js.Object {
  var defaultConfig: js.Any = js.native
  var id: String = js.native
  def plugin(args: js.Any*): Unit = js.native
}

object module {
  @scala.inline
  def apply(defaultConfig: js.Any, id: String, plugin: /* repeated */ js.Any => Unit): module = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plugin = js.Any.fromFunction1(plugin))
    __obj.asInstanceOf[module]
  }
  @scala.inline
  implicit class moduleOps[Self <: module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

