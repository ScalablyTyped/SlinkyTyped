package typingsSlinky.webpackPluginServe.anon

import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.debug
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.error
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.info
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.trace
import typingsSlinky.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var level: trace | debug | info | warn | error = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
}

object Level {
  @scala.inline
  def apply(level: trace | debug | info | warn | error): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: trace | debug | info | warn | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

