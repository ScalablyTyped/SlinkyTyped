package typingsSlinky.signale.mod

import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandType extends js.Object {
  /** The icon corresponding to the logger. */
  var badge: String = js.native
  /**
    * The color of the label, can be any of the foreground colors supported by
    * [chalk](https://github.com/chalk/chalk#colors).
    */
  var color: String = js.native
  /** The label used to identify the type of the logger. */
  var label: String = js.native
  var logLevel: js.UndefOr[String] = js.native
  var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
}

object CommandType {
  @scala.inline
  def apply(badge: String, color: String, label: String): CommandType = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandType]
  }
  @scala.inline
  implicit class CommandTypeOps[Self <: CommandType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WriteStream | js.Array[WriteStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

