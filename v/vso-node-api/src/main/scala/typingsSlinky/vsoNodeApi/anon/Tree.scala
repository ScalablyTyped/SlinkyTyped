package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree extends StObject {
  
  var none: scala.Double = js.native
  
  var tree: scala.Double = js.native
  
  var workItem: scala.Double = js.native
  
  var workItemLink: scala.Double = js.native
  
  var workItemTypeExtension: scala.Double = js.native
}
object Tree {
  
  @scala.inline
  def apply(
    none: scala.Double,
    tree: scala.Double,
    workItem: scala.Double,
    workItemLink: scala.Double,
    workItemTypeExtension: scala.Double
  ): Tree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  @scala.inline
  implicit class TreeMutableBuilder[Self <: Tree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: scala.Double): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItem(value: scala.Double): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemLink(value: scala.Double): Self = StObject.set(x, "workItemLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeExtension(value: scala.Double): Self = StObject.set(x, "workItemTypeExtension", value.asInstanceOf[js.Any])
  }
}
