package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributionConstraint extends js.Object {
  /**
    * An optional property that can be specified to group constraints together. All constraints within a group are AND'd together (all must be evaluate to True in order for the contribution to be included). Different groups of constraints are OR'd (only one group needs to evaluate to True for the contribution to be included).
    */
  var group: Double = js.native
  /**
    * Fully qualified identifier of a shared constraint
    */
  var id: String = js.native
  /**
    * If true, negate the result of the filter (include the contribution if the applied filter returns false instead of true)
    */
  var inverse: Boolean = js.native
  /**
    * Name of the IContributionFilter plugin
    */
  var name: String = js.native
  /**
    * Properties that are fed to the contribution filter class
    */
  var properties: js.Any = js.native
  /**
    * Constraints can be optionally be applied to one or more of the relationships defined in the contribution. If no relationships are defined then all relationships are associated with the constraint. This means the default behaviour will elimiate the contribution from the tree completely if the constraint is applied.
    */
  var relationships: js.Array[String] = js.native
}

object ContributionConstraint {
  @scala.inline
  def apply(
    group: Double,
    id: String,
    inverse: Boolean,
    name: String,
    properties: js.Any,
    relationships: js.Array[String]
  ): ContributionConstraint = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionConstraint]
  }
  @scala.inline
  implicit class ContributionConstraintOps[Self <: ContributionConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationships(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

