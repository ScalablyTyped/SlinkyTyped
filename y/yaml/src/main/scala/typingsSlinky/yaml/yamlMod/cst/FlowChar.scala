package typingsSlinky.yaml.yamlMod.cst

import typingsSlinky.yaml.yamlStrings.`,`
import typingsSlinky.yaml.yamlStrings.`:`
import typingsSlinky.yaml.yamlStrings.`?`
import typingsSlinky.yaml.yamlStrings.`[`
import typingsSlinky.yaml.yamlStrings.`]`
import typingsSlinky.yaml.yamlStrings.`{`
import typingsSlinky.yaml.yamlStrings.`}`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowChar extends js.Object {
  var char: `{` | `}` | `[` | `]` | `,` | `?` | `:`
  var offset: Double
  var origOffset: js.UndefOr[Double] = js.undefined
}

object FlowChar {
  @scala.inline
  def apply(char: `{` | `}` | `[` | `]` | `,` | `?` | `:`, offset: Double, origOffset: Int | Double = null): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (origOffset != null) __obj.updateDynamic("origOffset")(origOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
}

