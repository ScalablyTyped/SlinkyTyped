package typingsSlinky.typedoc.tsInternalMod

import typingsSlinky.typedoc.typedocStrings.object_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TsConfigOnlyOption
  extends CommandLineOptionBase
     with CommandLineOption {
  @JSName("type")
  var type_TsConfigOnlyOption: object_ = js.native
}

object TsConfigOnlyOption {
  @scala.inline
  def apply(name: String, `type`: object_): TsConfigOnlyOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsConfigOnlyOption]
  }
  @scala.inline
  implicit class TsConfigOnlyOptionOps[Self <: TsConfigOnlyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: object_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

