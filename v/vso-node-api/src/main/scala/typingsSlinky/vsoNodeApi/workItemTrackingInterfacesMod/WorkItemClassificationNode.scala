package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemClassificationNode extends WorkItemTrackingResource {
  /**
    * Dictionary that has node attributes like start/finish date for iteration nodes.
    */
  var attributes: StringDictionary[js.Any] = js.native
  /**
    * List of child nodes fetched.
    */
  var children: js.Array[WorkItemClassificationNode] = js.native
  /**
    * Flag that indicates if the classification node has any child nodes.
    */
  var hasChildren: Boolean = js.native
  /**
    * Integer ID of the classification node.
    */
  var id: Double = js.native
  /**
    * GUID ID of the classification node.
    */
  var identifier: String = js.native
  /**
    * Name of the classification node.
    */
  var name: String = js.native
  /**
    * Node structure type.
    */
  var structureType: TreeNodeStructureType = js.native
}

object WorkItemClassificationNode {
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: StringDictionary[js.Any],
    children: js.Array[WorkItemClassificationNode],
    hasChildren: Boolean,
    id: Double,
    identifier: String,
    name: String,
    structureType: TreeNodeStructureType,
    url: String
  ): WorkItemClassificationNode = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemClassificationNode]
  }
  @scala.inline
  implicit class WorkItemClassificationNodeOps[Self <: WorkItemClassificationNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[WorkItemClassificationNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureType(value: TreeNodeStructureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

