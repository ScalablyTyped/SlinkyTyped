package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
@js.native
trait MutationRecord extends js.Object {
  /**
    * Return the nodes added and removed respectively.
    */
  val addedNodes: org.scalajs.dom.raw.NodeList = js.native
  /**
    * Returns the local name of the changed attribute, and null otherwise.
    */
  val attributeName: java.lang.String | Null = js.native
  /**
    * Returns the namespace of the changed attribute, and null otherwise.
    */
  val attributeNamespace: java.lang.String | Null = js.native
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val nextSibling: org.scalajs.dom.raw.Node | Null = js.native
  /**
    * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
    */
  val oldValue: java.lang.String | Null = js.native
  /**
    * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
    */
  val previousSibling: org.scalajs.dom.raw.Node | Null = js.native
  /**
    * Return the nodes added and removed respectively.
    */
  val removedNodes: org.scalajs.dom.raw.NodeList = js.native
  /**
    * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
    */
  val target: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
    */
  val `type`: MutationRecordType = js.native
}

object MutationRecord {
  @scala.inline
  def apply(
    addedNodes: org.scalajs.dom.raw.NodeList,
    removedNodes: org.scalajs.dom.raw.NodeList,
    target: org.scalajs.dom.raw.Node,
    `type`: MutationRecordType
  ): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationRecord]
  }
  @scala.inline
  implicit class MutationRecordOps[Self <: org.scalajs.dom.raw.MutationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedNodes(value: org.scalajs.dom.raw.NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedNodes(value: org.scalajs.dom.raw.NodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MutationRecordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(null)
        ret
    }
    @scala.inline
    def withAttributeNamespace(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeNamespaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeNamespace")(null)
        ret
    }
    @scala.inline
    def withNextSibling(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSiblingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(null)
        ret
    }
    @scala.inline
    def withOldValue(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(null)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSiblingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(null)
        ret
    }
  }
  
}

