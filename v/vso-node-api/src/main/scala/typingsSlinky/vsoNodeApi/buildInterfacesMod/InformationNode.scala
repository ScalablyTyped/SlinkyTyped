package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InformationNode extends js.Object {
  /**
    * Fields of the information node
    */
  var fields: StringDictionary[String] = js.native
  /**
    * Process or person that last modified this node
    */
  var lastModifiedBy: String = js.native
  /**
    * Date this node was last modified
    */
  var lastModifiedDate: js.Date = js.native
  /**
    * Node Id of this information node
    */
  var nodeId: Double = js.native
  /**
    * Id of parent node (xml tree)
    */
  var parentId: Double = js.native
  /**
    * The type of the information node
    */
  var `type`: String = js.native
}

object InformationNode {
  @scala.inline
  def apply(
    fields: StringDictionary[String],
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    nodeId: Double,
    parentId: Double,
    `type`: String
  ): InformationNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InformationNode]
  }
  @scala.inline
  implicit class InformationNodeOps[Self <: InformationNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
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

