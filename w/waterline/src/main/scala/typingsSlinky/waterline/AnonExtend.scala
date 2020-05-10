package typingsSlinky.waterline

import typingsSlinky.waterline.mod.CollectionClass
import typingsSlinky.waterline.mod.CollectionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtend extends js.Object {
  def extend(params: CollectionDefinition): CollectionClass = js.native
}

object AnonExtend {
  @scala.inline
  def apply(extend: CollectionDefinition => CollectionClass): AnonExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend))
    __obj.asInstanceOf[AnonExtend]
  }
  @scala.inline
  implicit class AnonExtendOps[Self <: AnonExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: CollectionDefinition => CollectionClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

