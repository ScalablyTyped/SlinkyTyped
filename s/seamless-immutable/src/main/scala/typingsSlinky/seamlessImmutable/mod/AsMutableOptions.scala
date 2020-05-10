package typingsSlinky.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsMutableOptions[TDeep /* <: Boolean */] extends js.Object {
  var deep: TDeep = js.native
}

object AsMutableOptions {
  @scala.inline
  def apply[TDeep](deep: TDeep): AsMutableOptions[TDeep] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsMutableOptions[TDeep]]
  }
  @scala.inline
  implicit class AsMutableOptionsOps[Self[tdeep] <: AsMutableOptions[tdeep], TDeep] (val x: Self[TDeep]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDeep] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDeep]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDeep] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDeep] with Other]
    @scala.inline
    def withDeep(value: TDeep): Self[TDeep] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

