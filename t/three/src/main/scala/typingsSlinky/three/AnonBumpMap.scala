package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBumpMap extends js.Object {
  var bumpMap: IUniform = js.native
  var bumpScale: IUniform = js.native
}

object AnonBumpMap {
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): AnonBumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBumpMap]
  }
  @scala.inline
  implicit class AnonBumpMapOps[Self <: AnonBumpMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBumpMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBumpScale(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

