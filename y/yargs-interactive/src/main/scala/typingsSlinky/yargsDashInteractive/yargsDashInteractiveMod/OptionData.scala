package typingsSlinky.yargsDashInteractive.yargsDashInteractiveMod

import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.`if-empty`
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.`if-no-arg`
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.always
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.checkbox
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.confirm
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.editor
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.expand
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.input
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.list
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.never
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.number
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.password
import typingsSlinky.yargsDashInteractive.yargsDashInteractiveStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var choices: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String | Double | Boolean | js.Array[_]] = js.undefined
  var describe: String
  var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.undefined
  var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
}

object OptionData {
  @scala.inline
  def apply(
    describe: String,
    `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor,
    choices: js.Array[String] = null,
    default: String | Double | Boolean | js.Array[_] = null,
    prompt: always | never | `if-no-arg` | `if-empty` = null
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}

