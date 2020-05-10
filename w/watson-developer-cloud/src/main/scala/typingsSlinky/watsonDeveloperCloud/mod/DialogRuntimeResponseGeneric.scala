package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogRuntimeResponseGeneric. */
@js.native
trait DialogRuntimeResponseGeneric extends js.Object {
  /** The description to show with the the response. */
  var description: js.UndefOr[String] = js.native
  /** The ID of the dialog node that the **topic** property is taken from. The **topic** property is populated using the value of the dialog node's **user_label** property. */
  var dialog_node: js.UndefOr[String] = js.native
  /** A message to be sent to the human agent who will be taking over the conversation. */
  var message_to_human_agent: js.UndefOr[String] = js.native
  /** An array of objects describing the options from which the user can choose. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.native
  /** The preferred type of control to display. */
  var preference: js.UndefOr[String] = js.native
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. **Note:** The **suggestion** response type is part of the disambiguation feature, which is only available for Premium users. */
  var response_type: String = js.native
  /** The URL of the image. */
  var source: js.UndefOr[String] = js.native
  /** An array of objects describing the possible matching dialog nodes from which the user can choose. **Note:** The **suggestions** property is part of the disambiguation feature, which is only available for Premium users. */
  var suggestions: js.UndefOr[js.Array[DialogSuggestion]] = js.native
  /** The text of the response. */
  var text: js.UndefOr[String] = js.native
  /** How long to pause, in milliseconds. */
  var time: js.UndefOr[Double] = js.native
  /** The title or introductory text to show before the response. */
  var title: js.UndefOr[String] = js.native
  /** A label identifying the topic of the conversation, derived from the **user_label** property of the relevant node. */
  var topic: js.UndefOr[String] = js.native
  /** Whether to send a "user is typing" event during the pause. */
  var typing: js.UndefOr[Boolean] = js.native
}

object DialogRuntimeResponseGeneric {
  @scala.inline
  def apply(response_type: String): DialogRuntimeResponseGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogRuntimeResponseGeneric]
  }
  @scala.inline
  implicit class DialogRuntimeResponseGenericOps[Self <: DialogRuntimeResponseGeneric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog_node(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog_node: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_node")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage_to_human_agent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_to_human_agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage_to_human_agent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_to_human_agent")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[DialogNodeOutputOptionsElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[DialogSuggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typing")(js.undefined)
        ret
    }
  }
  
}

