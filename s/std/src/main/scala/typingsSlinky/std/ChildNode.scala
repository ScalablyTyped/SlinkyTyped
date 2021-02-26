package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildNode extends Node {
  
  /**
    * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
    * 
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  def after(nodes: (org.scalajs.dom.raw.Node | java.lang.String)*): Unit = js.native
  
  /**
    * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
    * 
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  def before(nodes: (org.scalajs.dom.raw.Node | java.lang.String)*): Unit = js.native
  
  /**
    * Removes node.
    */
  def remove(): Unit = js.native
  
  /**
    * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
    * 
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  def replaceWith(nodes: (org.scalajs.dom.raw.Node | java.lang.String)*): Unit = js.native
}
