package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalMap extends js.Object {
  var normalMap: IUniform = js.native
  var normalScale: IUniform = js.native
}

object NormalMap {
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
  @scala.inline
  implicit class NormalMapOps[Self <: NormalMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalScale(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalScale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

