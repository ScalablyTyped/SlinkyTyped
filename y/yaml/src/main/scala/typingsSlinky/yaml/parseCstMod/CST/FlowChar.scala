package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.yamlStrings.Colon
import typingsSlinky.yaml.yamlStrings.Comma
import typingsSlinky.yaml.yamlStrings.Leftcurlybracket
import typingsSlinky.yaml.yamlStrings.Questionmark
import typingsSlinky.yaml.yamlStrings.Rightcurlybracket
import typingsSlinky.yaml.yamlStrings.`[`
import typingsSlinky.yaml.yamlStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowChar extends js.Object {
  var char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon = js.native
  var offset: Double = js.native
  var origOffset: js.UndefOr[Double] = js.native
}

object FlowChar {
  @scala.inline
  def apply(
    char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon,
    offset: Double
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
  @scala.inline
  implicit class FlowCharOps[Self <: FlowChar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChar(value: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origOffset")(js.undefined)
        ret
    }
  }
  
}

