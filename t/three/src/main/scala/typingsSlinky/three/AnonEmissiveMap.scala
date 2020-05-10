package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmissiveMap extends js.Object {
  var emissiveMap: IUniform = js.native
}

object AnonEmissiveMap {
  @scala.inline
  def apply(emissiveMap: IUniform): AnonEmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmissiveMap]
  }
  @scala.inline
  implicit class AnonEmissiveMapOps[Self <: AnonEmissiveMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmissiveMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

