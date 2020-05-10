package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputGeneric. */
@js.native
trait DialogNodeOutputGeneric extends js.Object {
  /** The delimiter to use as a separator between responses when `selection_policy`=`multiline`. */
  var delimiter: js.UndefOr[String] = js.native
  /** An optional description to show with the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 256 characters. */
  var description: js.UndefOr[String] = js.native
  /** An optional message to be sent to the human agent who will be taking over the conversation. Valid only when **reponse_type**=`connect_to_agent`. This string must be no longer than 256 characters. */
  var message_to_human_agent: js.UndefOr[String] = js.native
  /** An array of objects describing the options from which the user can choose. You can include up to 20 options. Required when **response_type**=`option`. */
  var options: js.UndefOr[js.Array[DialogNodeOutputOptionsElement]] = js.native
  /** The preferred type of control to display, if supported by the channel. Valid only when **response_type**=`option`. */
  var preference: js.UndefOr[String] = js.native
  /** The type of response returned by the dialog node. The specified response type must be supported by the client application or channel. */
  var response_type: String = js.native
  /** How a response is selected from the list, if more than one response is specified. Valid only when **response_type**=`text`. */
  var selection_policy: js.UndefOr[String] = js.native
  /** The URL of the image. Required when **response_type**=`image`. */
  var source: js.UndefOr[String] = js.native
  /** How long to pause, in milliseconds. The valid values are from 0 to 10000. Valid only when **response_type**=`pause`. */
  var time: js.UndefOr[Double] = js.native
  /** An optional title to show before the response. Valid only when **response_type**=`image` or `option`. This string must be no longer than 512 characters. */
  var title: js.UndefOr[String] = js.native
  /** Whether to send a "user is typing" event during the pause. Ignored if the channel does not support this event. Valid only when **response_type**=`pause`. */
  var typing: js.UndefOr[Boolean] = js.native
  /** A list of one or more objects defining text responses. Required when **response_type**=`text`. */
  var values: js.UndefOr[js.Array[DialogNodeOutputTextValuesElement]] = js.native
}

object DialogNodeOutputGeneric {
  @scala.inline
  def apply(response_type: String): DialogNodeOutputGeneric = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputGeneric]
  }
  @scala.inline
  implicit class DialogNodeOutputGenericOps[Self <: DialogNodeOutputGeneric] (val x: Self) extends AnyVal {
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
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
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
    def withSelection_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection_policy")(js.undefined)
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
    @scala.inline
    def withValues(value: js.Array[DialogNodeOutputTextValuesElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

