package typingsSlinky.three.anon

import typingsSlinky.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetalnessMap extends js.Object {
  var metalnessMap: IUniform = js.native
}

object MetalnessMap {
  @scala.inline
  def apply(metalnessMap: IUniform): MetalnessMap = {
    val __obj = js.Dynamic.literal(metalnessMap = metalnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalnessMap]
  }
  @scala.inline
  implicit class MetalnessMapOps[Self <: MetalnessMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetalnessMap(value: IUniform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metalnessMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

