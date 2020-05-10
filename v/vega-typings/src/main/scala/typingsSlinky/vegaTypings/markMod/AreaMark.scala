package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.encodeMod.AreaEncodeEntry
import typingsSlinky.vegaTypings.encodeMod.Encodable
import typingsSlinky.vegaTypings.vegaTypingsStrings.area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaMark
  extends BaseMark
     with Encodable[AreaEncodeEntry]
     with Mark {
  var `type`: area = js.native
}

object AreaMark {
  @scala.inline
  def apply(`type`: area): AreaMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMark]
  }
  @scala.inline
  implicit class AreaMarkOps[Self <: AreaMark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

