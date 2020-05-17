package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** (Applies to Windows Phone only) The details of an ApplicationTrigger . */
@js.native
trait ApplicationTriggerDetails extends js.Object {
  /** The arguments that were passed to the background task using the ApplicationTrigger.RequestAsync(ValueSet) method. */
  var arguments: ValueSet = js.native
}

object ApplicationTriggerDetails {
  @scala.inline
  def apply(arguments: ValueSet): ApplicationTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTriggerDetails]
  }
  @scala.inline
  implicit class ApplicationTriggerDetailsOps[Self <: ApplicationTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

