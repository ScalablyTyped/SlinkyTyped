package typingsSlinky.webpackDevMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverrideMimeTypeMap extends js.Object {
  var force: Boolean = js.native
  var typeMap: MimeTypeMap = js.native
}

object OverrideMimeTypeMap {
  @scala.inline
  def apply(force: Boolean, typeMap: MimeTypeMap): OverrideMimeTypeMap = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideMimeTypeMap]
  }
  @scala.inline
  implicit class OverrideMimeTypeMapOps[Self <: OverrideMimeTypeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeMap(value: MimeTypeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

