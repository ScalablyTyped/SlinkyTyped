package typingsSlinky.vegaTypings.markMod

import typingsSlinky.vegaTypings.encodeMod.Encodable
import typingsSlinky.vegaTypings.encodeMod.RectEncodeEntry
import typingsSlinky.vegaTypings.vegaTypingsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectMark
  extends BaseMark
     with Encodable[RectEncodeEntry]
     with Mark {
  var `type`: rect = js.native
}

object RectMark {
  @scala.inline
  def apply(`type`: rect): RectMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectMark]
  }
  @scala.inline
  implicit class RectMarkOps[Self <: RectMark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

