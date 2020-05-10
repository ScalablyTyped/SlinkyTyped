package typingsSlinky.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  /**
    * Returns the logical name of the attribute associated to the step.
    * @returns The attribute.
    * @remarks Some steps don’t contain an attribute value.
    */
  def getAttribute(): String = js.native
  /**
    * Returns the name of the step.
    * @returns The name.
    */
  def getName(): String = js.native
  /**
    * Returns whether the step is required in the business process flow.
    * @returns true if required, false if not.
    * @remarks     Returns true if the step is marked as required in the Business Process Flow editor; otherwise, false.
    *              There is no connection between this value and the values you can change in the formContext.data.entity
    *              attribute RequiredLevel methods.
    */
  def isRequired(): Boolean = js.native
}

object Step {
  @scala.inline
  def apply(getAttribute: () => String, getName: () => String, isRequired: () => Boolean): Step = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction0(getAttribute), getName = js.Any.fromFunction0(getName), isRequired = js.Any.fromFunction0(isRequired))
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribute(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRequired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

