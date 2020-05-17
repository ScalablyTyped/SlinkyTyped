package typingsSlinky.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingsPerObject extends js.Object {
  var bindingsPerObject: Double = js.native
  var objects: InUse = js.native
}

object BindingsPerObject {
  @scala.inline
  def apply(bindingsPerObject: Double, objects: InUse): BindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingsPerObject]
  }
  @scala.inline
  implicit class BindingsPerObjectOps[Self <: BindingsPerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingsPerObject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingsPerObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: InUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

