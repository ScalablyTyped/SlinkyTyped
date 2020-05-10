package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.sqrt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqrtScale
  extends NumericScale
     with Scale {
  @JSName("type")
  var type_SqrtScale: sqrt = js.native
}

object SqrtScale {
  @scala.inline
  def apply(name: String, `type`: sqrt): SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqrtScale]
  }
  @scala.inline
  implicit class SqrtScaleOps[Self <: SqrtScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: sqrt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

