package typingsSlinky.styletronStandard.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined styletron-standard.styletron-standard.KeyframesPercentageObject & {  from ? :styletron-standard.styletron-standard.Properties,   to ? :styletron-standard.styletron-standard.Properties} */
@js.native
trait KeyframesObject extends /* key */ StringDictionary[Properties] {
  var from: js.UndefOr[Properties] = js.native
  var to: js.UndefOr[Properties] = js.native
}

object KeyframesObject {
  @scala.inline
  def apply(): KeyframesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframesObject]
  }
  @scala.inline
  implicit class KeyframesObjectOps[Self <: KeyframesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

