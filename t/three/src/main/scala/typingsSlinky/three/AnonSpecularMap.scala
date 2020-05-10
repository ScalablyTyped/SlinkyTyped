package typingsSlinky.three

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSpecularMap extends js.Object {
  var specularMap: IUniform = js.native
}

object AnonSpecularMap {
  @scala.inline
  def apply(specularMap: IUniform): AnonSpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpecularMap]
  }
  @scala.inline
  implicit class AnonSpecularMapOps[Self <: AnonSpecularMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecularMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

