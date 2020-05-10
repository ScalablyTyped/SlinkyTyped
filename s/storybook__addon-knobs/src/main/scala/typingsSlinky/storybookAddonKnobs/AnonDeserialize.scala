package typingsSlinky.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeserialize extends js.Object {
  def deserialize(v: js.Any): js.Any = js.native
  def serialize(v: js.Any): js.Any = js.native
}

object AnonDeserialize {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): AnonDeserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[AnonDeserialize]
  }
  @scala.inline
  implicit class AnonDeserializeOps[Self <: AnonDeserialize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeserialize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerialize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

