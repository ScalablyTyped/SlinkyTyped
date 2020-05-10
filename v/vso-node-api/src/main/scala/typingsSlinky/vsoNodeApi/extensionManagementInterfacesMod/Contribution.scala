package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contribution extends ContributionBase {
  /**
    * List of constraints (filters) that should be applied to the availability of this contribution
    */
  var constraints: js.Array[ContributionConstraint] = js.native
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String] = js.native
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any = js.native
  /**
    * List of demanded claims in order for the user to see this contribution (like anonymous, public, member...).
    */
  var restrictedTo: js.Array[String] = js.native
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String] = js.native
  /**
    * Id of the Contribution Type
    */
  var `type`: String = js.native
}

object Contribution {
  @scala.inline
  def apply(
    constraints: js.Array[ContributionConstraint],
    description: String,
    id: String,
    includes: js.Array[String],
    properties: js.Any,
    restrictedTo: js.Array[String],
    targets: js.Array[String],
    `type`: String,
    visibleTo: js.Array[String]
  ): Contribution = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contribution]
  }
  @scala.inline
  implicit class ContributionOps[Self <: Contribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Array[ContributionConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictedTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

