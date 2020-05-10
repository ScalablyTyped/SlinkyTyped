package typingsSlinky.xrm.Xrm.Attributes

import typingsSlinky.xrm.Xrm.Collection.ItemCollection
import typingsSlinky.xrm.Xrm.Controls.Control
import typingsSlinky.xrm.Xrm.Entity
import typingsSlinky.xrm.Xrm.Events.ContextSensitiveHandler
import typingsSlinky.xrm.Xrm.Privilege
import typingsSlinky.xrm.Xrm.SubmitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an Entity attribute.
  */
@js.native
trait Attribute extends js.Object {
  /**
    * A collection of all the controls on the form that interface with this attribute.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control] = js.native
  /**
    * Adds a handler to be called when the attribute's value is changed.
    * @param handler The function reference.
    */
  def addOnChange(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * Fire all "on change" event handlers.
    */
  def fireOnChange(): Unit = js.native
  /**
    * Gets attribute type.
    * @returns The attribute's type name.<BR><BR>
    * **Values returned are**:
    * * boolean
    * * datetime
    * * decimal
    * * double
    * * integer
    * * lookup
    * * memo
    * * money
    * * optionset
    * * string
    */
  def getAttributeType(): AttributeType = js.native
  /**
    * Gets the attribute format.
    * @returns The format of the attribute.<BR><BR>
    * **Values returned are**:
    * * date           (datetime)
    * * datetime       (datetime)
    * * duration       (integer)
    * * email          (string)
    * * language       (optionset)
    * * none           (integer)
    * * phone          (string)
    * * text           (string)
    * * textarea       (string)
    * * tickersymbol   (string)
    * * timezone       (optionset)
    * * url            (string)
    * @see {@link getAttributeType}
    */
  def getFormat(): AttributeFormat = js.native
  /**
    * Gets a boolean value indicating whether this Attribute has unsaved changes.
    * @returns true if there are unsaved changes, otherwise false.
    */
  def getIsDirty(): Boolean = js.native
  /**
    * Gets the logical name of the attribute.
    * @returns The logical name.
    */
  def getName(): String = js.native
  /**
    * Gets a reference to the record context of this attribute.
    * @returns The parent record context.
    */
  def getParent(): Entity = js.native
  /**
    * Gets the current level of requirement for the attribute.
    * @returns The required level, as either "none", "required", or "recommended"
    */
  def getRequiredLevel(): RequirementLevel = js.native
  /**
    * Gets current submit mode for the attribute.
    * @returns The submit mode, as either "always", "never", or "dirty"
    * @remarks The default value is "dirty"
    */
  def getSubmitMode(): SubmitMode = js.native
  /**
    * Gets the current user's privileges for the attribute.
    * @returns The user privileges.
    */
  def getUserPrivilege(): Privilege = js.native
  /**
    * Gets the value.
    * @returns The value.
    */
  def getValue(): js.Any = js.native
  /**
    * Removes the handler from the "on change" event.
    * @param handler The handler.
    */
  def removeOnChange(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * Sets the required level.
    * @param requirementLevel The requirement level, as either "none", "required", or "recommended"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setRequiredLevel(requirementLevel: RequirementLevel): Unit = js.native
  /**
    * Sets the submit mode.
    * @param submitMode The submit mode, as either "always", "never", or "dirty".
    * @default submitMode "dirty"
    * @see {@link XrmEnum.AttributeRequirementLevel}
    */
  def setSubmitMode(submitMode: SubmitMode): Unit = js.native
  /**
    * Sets the value.
    * @param value The value.
    */
  def setValue(value: js.Any): Unit = js.native
}

object Attribute {
  @scala.inline
  def apply(
    addOnChange: ContextSensitiveHandler => Unit,
    controls: ItemCollection[Control],
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
    setValue: js.Any => Unit
  ): Attribute = {
    val __obj = js.Dynamic.literal(addOnChange = js.Any.fromFunction1(addOnChange), controls = controls.asInstanceOf[js.Any], fireOnChange = js.Any.fromFunction0(fireOnChange), getAttributeType = js.Any.fromFunction0(getAttributeType), getFormat = js.Any.fromFunction0(getFormat), getIsDirty = js.Any.fromFunction0(getIsDirty), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getRequiredLevel = js.Any.fromFunction0(getRequiredLevel), getSubmitMode = js.Any.fromFunction0(getSubmitMode), getUserPrivilege = js.Any.fromFunction0(getUserPrivilege), getValue = js.Any.fromFunction0(getValue), removeOnChange = js.Any.fromFunction1(removeOnChange), setRequiredLevel = js.Any.fromFunction1(setRequiredLevel), setSubmitMode = js.Any.fromFunction1(setSubmitMode), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnChange(value: ContextSensitiveHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withControls(value: ItemCollection[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFireOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributeType(value: () => AttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormat(value: () => AttributeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsDirty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRequiredLevel(value: () => RequirementLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequiredLevel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubmitMode(value: () => SubmitMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserPrivilege(value: () => Privilege): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserPrivilege")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveOnChange(value: ContextSensitiveHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequiredLevel(value: RequirementLevel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequiredLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubmitMode(value: SubmitMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubmitMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

