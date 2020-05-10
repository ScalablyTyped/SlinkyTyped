package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Assistant output to be rendered or processed by the client. */
@js.native
trait MessageOutput extends js.Object {
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  /** Additional detailed information about a message response and how it was generated. */
  var debug: js.UndefOr[MessageOutputDebug] = js.native
  /** An array of entities identified in the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.native
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  /** An object containing any custom properties included in the response. This object includes any arbitrary properties defined in the dialog JSON editor as part of the dialog node output. */
  var user_defined: js.UndefOr[js.Object] = js.native
}

object MessageOutput {
  @scala.inline
  def apply(): MessageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutput]
  }
  @scala.inline
  implicit class MessageOutputOps[Self <: MessageOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[DialogNodeAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: MessageOutputDebug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
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
    def withGeneric(value: js.Array[DialogRuntimeResponseGeneric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(js.undefined)
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
    @scala.inline
    def withUser_defined(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_defined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_defined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_defined")(js.undefined)
        ret
    }
  }
  
}

