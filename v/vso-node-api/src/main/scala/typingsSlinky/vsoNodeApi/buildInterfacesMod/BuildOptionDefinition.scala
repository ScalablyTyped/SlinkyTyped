package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptionDefinition extends BuildOptionDefinitionReference {
  /**
    * The description.
    */
  var description: String = js.native
  /**
    * The list of input groups defined for the build option.
    */
  var groups: js.Array[BuildOptionGroupDefinition] = js.native
  /**
    * The list of inputs defined for the build option.
    */
  var inputs: js.Array[BuildOptionInputDefinition] = js.native
  /**
    * The name of the build option.
    */
  var name: String = js.native
  /**
    * A value that indicates the relative order in which the behavior should be applied.
    */
  var ordinal: Double = js.native
}

object BuildOptionDefinition {
  @scala.inline
  def apply(
    description: String,
    groups: js.Array[BuildOptionGroupDefinition],
    id: String,
    inputs: js.Array[BuildOptionInputDefinition],
    name: String,
    ordinal: Double
  ): BuildOptionDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionDefinition]
  }
  @scala.inline
  implicit class BuildOptionDefinitionOps[Self <: BuildOptionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[BuildOptionGroupDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[BuildOptionInputDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrdinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

