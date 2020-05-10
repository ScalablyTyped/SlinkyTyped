package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptionInputDefinition extends js.Object {
  /**
    * The default value.
    */
  var defaultValue: String = js.native
  /**
    * The name of the input group that this input belongs to.
    */
  var groupName: String = js.native
  var help: StringDictionary[String] = js.native
  /**
    * The label for the input.
    */
  var label: String = js.native
  /**
    * The name of the input.
    */
  var name: String = js.native
  var options: StringDictionary[String] = js.native
  /**
    * Indicates whether the input is required to have a value.
    */
  var required: Boolean = js.native
  /**
    * Indicates the type of the input value.
    */
  var `type`: BuildOptionInputType = js.native
  /**
    * The rule that is applied to determine whether the input is visible in the UI.
    */
  var visibleRule: String = js.native
}

object BuildOptionInputDefinition {
  @scala.inline
  def apply(
    defaultValue: String,
    groupName: String,
    help: StringDictionary[String],
    label: String,
    name: String,
    options: StringDictionary[String],
    required: Boolean,
    `type`: BuildOptionInputType,
    visibleRule: String
  ): BuildOptionInputDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionInputDefinition]
  }
  @scala.inline
  implicit class BuildOptionInputDefinitionOps[Self <: BuildOptionInputDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: BuildOptionInputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

