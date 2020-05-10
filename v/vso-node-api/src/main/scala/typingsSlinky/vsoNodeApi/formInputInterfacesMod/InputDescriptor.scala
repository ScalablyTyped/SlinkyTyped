package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDescriptor extends js.Object {
  /**
    * The ids of all inputs that the value of this input is dependent on.
    */
  var dependencyInputIds: js.Array[String] = js.native
  /**
    * Description of what this input is used for
    */
  var description: String = js.native
  /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
  var groupName: String = js.native
  /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
  var hasDynamicValueInformation: Boolean = js.native
  /**
    * Identifier for the subscription input
    */
  var id: String = js.native
  /**
    * Mode in which the value of this input should be entered
    */
  var inputMode: InputMode = js.native
  /**
    * Gets whether this input is confidential, such as for a password or application key
    */
  var isConfidential: Boolean = js.native
  /**
    * Localized name which can be shown as a label for the subscription input
    */
  var name: String = js.native
  /**
    * Gets whether this input is included in the default generated action description.
    */
  var useInDefaultDescription: Boolean = js.native
  /**
    * Information to use to validate this input's value
    */
  var validation: InputValidation = js.native
  /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
  var valueHint: String = js.native
  /**
    * Information about possible values for this input
    */
  var values: InputValues = js.native
}

object InputDescriptor {
  @scala.inline
  def apply(
    dependencyInputIds: js.Array[String],
    description: String,
    groupName: String,
    hasDynamicValueInformation: Boolean,
    id: String,
    inputMode: InputMode,
    isConfidential: Boolean,
    name: String,
    useInDefaultDescription: Boolean,
    validation: InputValidation,
    valueHint: String,
    values: InputValues
  ): InputDescriptor = {
    val __obj = js.Dynamic.literal(dependencyInputIds = dependencyInputIds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hasDynamicValueInformation = hasDynamicValueInformation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isConfidential = isConfidential.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], useInDefaultDescription = useInDefaultDescription.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueHint = valueHint.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDescriptor]
  }
  @scala.inline
  implicit class InputDescriptorOps[Self <: InputDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyInputIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencyInputIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasDynamicValueInformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicValueInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputMode(value: InputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConfidential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfidential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseInDefaultDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInDefaultDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidation(value: InputValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: InputValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

