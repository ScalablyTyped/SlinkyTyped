package typingsSlinky.xrm.Xrm.Attributes

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import typingsSlinky.xrm.Xrm.Controls.DateControl
import typingsSlinky.xrm.Xrm.Entity
import typingsSlinky.xrm.Xrm.Events.ContextSensitiveHandler
import typingsSlinky.xrm.Xrm.Privilege
import typingsSlinky.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Date attribute.
  *
  * @see {@link Attribute}
  */
@js.native
trait DateAttribute extends Attribute {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @JSName("controls")
  var controls_DateAttribute: ItemCollection[DateControl] = js.native
  /**
    * Sets the value.
    * @param value The value.
    * @remarks Attributes on Quick Create Forms will not save values set with this method.
    */
  def setValue(value: js.Date): Unit = js.native
}

object DateAttribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[DateControl],
    fireOnChange: () => Unit,
    getAttributeType: () => AttributeType,
    getFormat: () => AttributeFormat,
    getIsDirty: () => Boolean,
    getName: () => String,
    getParent: () => Entity,
    getRequiredLevel: () => RequirementLevel,
    getSubmitMode: () => SubmitMode,
    getUserPrivilege: () => Privilege,
    getValue: () => js.Any,
    removeOnChange: ContextSensitiveHandler => Unit,
    setRequiredLevel: RequirementLevel => Unit,
    setSubmitMode: SubmitMode => Unit,
    setValue: js.Date => Unit
  ): DateAttribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[DateAttribute]
  }
  @scala.inline
  implicit class DateAttributeOps[Self <: DateAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: ItemCollection[DateControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

