package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user selects the corresponding disambiguation option. */
@js.native
trait DialogSuggestionValue extends js.Object {
  /** An array of entities to be sent along with the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
  /** An array of intents to be sent along with the user input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
}

object DialogSuggestionValue {
  @scala.inline
  def apply(): DialogSuggestionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSuggestionValue]
  }
  @scala.inline
  implicit class DialogSuggestionValueOps[Self <: DialogSuggestionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[RuntimeEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: MessageInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withIntents(value: js.Array[RuntimeIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(js.undefined)
        ret
    }
  }
  
}

