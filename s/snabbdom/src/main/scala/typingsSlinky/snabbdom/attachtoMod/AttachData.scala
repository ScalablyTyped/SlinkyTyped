package typingsSlinky.snabbdom.attachtoMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachData
  extends /* i */ NumberDictionary[js.Any]
     with /* key */ StringDictionary[js.Any] {
  var placeholder: js.UndefOr[js.Any] = js.native
  var real: js.UndefOr[Node] = js.native
}

object AttachData {
  @scala.inline
  def apply(): AttachData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachData]
  }
  @scala.inline
  implicit class AttachDataOps[Self <: AttachData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReal(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(js.undefined)
        ret
    }
  }
  
}

