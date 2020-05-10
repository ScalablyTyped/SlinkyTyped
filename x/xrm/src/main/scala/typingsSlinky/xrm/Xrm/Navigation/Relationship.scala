package typingsSlinky.xrm.Xrm.Navigation

import typingsSlinky.xrm.XrmEnum.RelationshipType
import typingsSlinky.xrm.XrmEnum.RoleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends js.Object {
  /**
    * Name of the attribute used for relationship.
    */
  var attributeName: String = js.native
  /**
    * Name of the relationship.
    */
  var name: String = js.native
  /**
    * Name of the navigation property for this relationship.
    */
  var navigationPropertyName: js.UndefOr[String] = js.native
  /**
    * Relationship type.Specify one of the following values:
    * * 0:OneToMany
    * * 1:ManyToMany
    */
  var relationshipType: js.UndefOr[RelationshipType] = js.native
      //
  /**
    * Role type in relationship.Specify one of the following values:
    * * 1:Referencing
    * * 2:AssociationEntity
    */
  var roleType: js.UndefOr[RoleType] = js.native
}

object Relationship {
  @scala.inline
  def apply(attributeName: String, name: String): Relationship = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
  @scala.inline
  implicit class RelationshipOps[Self <: Relationship] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationPropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationPropertyName")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipType(value: RelationshipType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipType")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleType(value: RoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleType")(js.undefined)
        ret
    }
  }
  
}

