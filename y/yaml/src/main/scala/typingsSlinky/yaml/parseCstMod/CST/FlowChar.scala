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

trait FlowChar extends js.Object {
  var char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon
  var offset: Double
  var origOffset: js.UndefOr[Double] = js.undefined
}

object FlowChar {
  @scala.inline
  def apply(
    char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon,
    offset: Double,
    origOffset: js.UndefOr[Double] = js.undefined
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (!js.isUndefined(origOffset)) __obj.updateDynamic("origOffset")(origOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
}

