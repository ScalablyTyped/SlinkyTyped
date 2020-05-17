package typingsSlinky.webpackDevServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeMap extends js.Object {
  var typeMap: js.UndefOr[Dictkey] = js.native
}

object TypeMap {
  @scala.inline
  def apply(): TypeMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeMap]
  }
  @scala.inline
  implicit class TypeMapOps[Self <: TypeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeMap(value: Dictkey): Self = {
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

