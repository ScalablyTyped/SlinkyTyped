package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
@js.native
trait MutationRecord extends StObject {
  
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
  ): org.scalajs.dom.raw.MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.MutationRecord]
  }
  
  @scala.inline
  implicit class MutationRecordMutableBuilder[Self <: org.scalajs.dom.raw.MutationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedNodes(value: org.scalajs.dom.raw.NodeList): Self = StObject.set(x, "addedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeName(value: java.lang.String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameNull: Self = StObject.set(x, "attributeName", null)
    
    @scala.inline
    def setAttributeNamespace(value: java.lang.String): Self = StObject.set(x, "attributeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamespaceNull: Self = StObject.set(x, "attributeNamespace", null)
    
    @scala.inline
    def setNextSibling(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    @scala.inline
    def setOldValue(value: java.lang.String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    @scala.inline
    def setPreviousSibling(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    @scala.inline
    def setRemovedNodes(value: org.scalajs.dom.raw.NodeList): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MutationRecordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
