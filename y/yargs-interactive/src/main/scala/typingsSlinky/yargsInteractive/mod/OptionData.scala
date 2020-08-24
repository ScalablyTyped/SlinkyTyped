package typingsSlinky.yargsInteractive.mod

import typingsSlinky.yargsInteractive.yargsInteractiveStrings.`if-empty`
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.`if-no-arg`
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.always
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.checkbox
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.confirm
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.editor
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.expand
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.input
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.list
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.never
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.number
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.password
import typingsSlinky.yargsInteractive.yargsInteractiveStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionData extends js.Object {
  var choices: js.UndefOr[js.Array[String]] = js.native
  var default: js.UndefOr[String | Double | Boolean | js.Array[_]] = js.native
  var describe: String = js.native
  var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.native
  var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor = js.native
}

object OptionData {
  @scala.inline
  def apply(
    describe: String,
    `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
  @scala.inline
  implicit class OptionDataOps[Self <: OptionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescribe(value: String): Self = this.set("describe", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: input | number | confirm | list | rawlist | expand | checkbox | password | editor): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChoicesVarargs(value: String*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setDefaultVarargs(value: js.Any*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: String | Double | Boolean | js.Array[_]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setPrompt(value: always | never | `if-no-arg` | `if-empty`): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
  }
  
}

