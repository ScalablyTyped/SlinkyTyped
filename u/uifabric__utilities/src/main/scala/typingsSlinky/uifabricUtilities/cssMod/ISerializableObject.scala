package typingsSlinky.uifabricUtilities.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializableObject extends js.Object {
  @JSName("toString")
  var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.native
}

object ISerializableObject {
  @scala.inline
  def apply(): ISerializableObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISerializableObject]
  }
  @scala.inline
  implicit class ISerializableObjectOps[Self <: ISerializableObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

