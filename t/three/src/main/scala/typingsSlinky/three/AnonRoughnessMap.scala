package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRoughnessMap extends js.Object {
  var roughnessMap: IUniform = js.native
}

object AnonRoughnessMap {
  @scala.inline
  def apply(roughnessMap: IUniform): AnonRoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoughnessMap]
  }
  @scala.inline
  implicit class AnonRoughnessMapOps[Self <: AnonRoughnessMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoughnessMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roughnessMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

