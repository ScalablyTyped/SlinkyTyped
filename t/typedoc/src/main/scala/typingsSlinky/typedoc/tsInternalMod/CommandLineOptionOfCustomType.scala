package typingsSlinky.typedoc.tsInternalMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptionOfCustomType
  extends CommandLineOptionBase
     with CommandLineOption {
  @JSName("type")
  var type_CommandLineOptionOfCustomType: Map[Double | String, _] = js.native
}

object CommandLineOptionOfCustomType {
  @scala.inline
  def apply(name: String, `type`: Map[Double | String, _]): CommandLineOptionOfCustomType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionOfCustomType]
  }
  @scala.inline
  implicit class CommandLineOptionOfCustomTypeOps[Self <: CommandLineOptionOfCustomType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Map[Double | String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

