package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefinition extends js.Object {
  var definition: Double = js.native
  var draft: Double = js.native
}

object AnonDefinition {
  @scala.inline
  def apply(definition: Double, draft: Double): AnonDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinition]
  }
  @scala.inline
  implicit class AnonDefinitionOps[Self <: AnonDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

