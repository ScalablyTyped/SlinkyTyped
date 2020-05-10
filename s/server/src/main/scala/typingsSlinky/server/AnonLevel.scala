package typingsSlinky.server

import typingsSlinky.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  var level: LogLevel = js.native
  def report(content: String, `type`: LogLevel): Unit = js.native
}

object AnonLevel {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Unit): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2(report))
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: (String, LogLevel) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

