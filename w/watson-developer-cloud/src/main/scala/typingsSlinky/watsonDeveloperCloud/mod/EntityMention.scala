package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing a contextual entity mention. */
@js.native
trait EntityMention extends js.Object {
  /** The name of the intent. */
  var intent: String = js.native
  /** An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text. */
  var location: js.Array[Double] = js.native
  /** The text of the user input example. */
  var text: String = js.native
}

object EntityMention {
  @scala.inline
  def apply(intent: String, location: js.Array[Double], text: String): EntityMention = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMention]
  }
  @scala.inline
  implicit class EntityMentionOps[Self <: EntityMention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

