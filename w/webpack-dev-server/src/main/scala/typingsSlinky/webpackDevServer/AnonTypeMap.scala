package typingsSlinky.webpackDevServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeMap extends js.Object {
  var typeMap: js.UndefOr[AnonDictkey] = js.native
}

object AnonTypeMap {
  @scala.inline
  def apply(): AnonTypeMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTypeMap]
  }
  @scala.inline
  implicit class AnonTypeMapOps[Self <: AnonTypeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeMap(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(js.undefined)
        ret
    }
  }
  
}

