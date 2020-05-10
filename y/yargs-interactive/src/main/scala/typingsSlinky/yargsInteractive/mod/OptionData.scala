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
    def withDescribe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: input | number | confirm | list | rawlist | expand | checkbox | password | editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String | Double | Boolean | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: always | never | `if-no-arg` | `if-empty`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
  }
  
}

