package typingsSlinky.superstruct.superstructMod

import typingsSlinky.std.Record
import typingsSlinky.superstruct.AnonInstantiable
import typingsSlinky.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperstructSettings extends js.Object {
  var error: AnonInstantiable = js.native
  var types: Record[String, Validator] = js.native
}

object SuperstructSettings {
  @scala.inline
  def apply(error: AnonInstantiable, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperstructSettings]
  }
  @scala.inline
  implicit class SuperstructSettingsOps[Self <: SuperstructSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: Record[String, Validator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

