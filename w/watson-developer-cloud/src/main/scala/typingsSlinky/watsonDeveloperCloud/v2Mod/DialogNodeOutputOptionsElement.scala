package typingsSlinky.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputOptionsElement. */
@js.native
trait DialogNodeOutputOptionsElement extends js.Object {
  /** The user-facing label for the option. */
  var label: String = js.native
  /** An object defining the message input to be sent to the assistant if the user selects the corresponding option. */
  var value: DialogNodeOutputOptionsElementValue = js.native
}

object DialogNodeOutputOptionsElement {
  @scala.inline
  def apply(label: String, value: DialogNodeOutputOptionsElementValue): DialogNodeOutputOptionsElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputOptionsElement]
  }
  @scala.inline
  implicit class DialogNodeOutputOptionsElementOps[Self <: DialogNodeOutputOptionsElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: DialogNodeOutputOptionsElementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

