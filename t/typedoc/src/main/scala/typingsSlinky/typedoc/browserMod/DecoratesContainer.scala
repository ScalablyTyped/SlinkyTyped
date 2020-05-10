package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratesContainer extends js.Object {
  var decorates: js.Array[TypeObject] = js.native
}

object DecoratesContainer {
  @scala.inline
  def apply(decorates: js.Array[TypeObject]): DecoratesContainer = {
    val __obj = js.Dynamic.literal(decorates = decorates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratesContainer]
  }
  @scala.inline
  implicit class DecoratesContainerOps[Self <: DecoratesContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecorates(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

