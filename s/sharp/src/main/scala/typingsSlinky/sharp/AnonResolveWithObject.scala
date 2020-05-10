package typingsSlinky.sharp

import typingsSlinky.sharp.sharpBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolveWithObject extends js.Object {
  var resolveWithObject: `false` = js.native
}

object AnonResolveWithObject {
  @scala.inline
  def apply(resolveWithObject: `false`): AnonResolveWithObject = {
    val __obj = js.Dynamic.literal(resolveWithObject = resolveWithObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResolveWithObject]
  }
  @scala.inline
  implicit class AnonResolveWithObjectOps[Self <: AnonResolveWithObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveWithObject(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveWithObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

