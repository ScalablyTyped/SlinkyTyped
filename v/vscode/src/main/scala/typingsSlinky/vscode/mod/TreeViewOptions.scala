package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewOptions[T] extends StObject {
  
  /**
    * Whether the tree supports multi-select. When the tree supports multi-select and a command is executed from the tree,
    * the first argument to the command is the tree item that the command was executed on and the second argument is an
    * array containing all selected tree items.
    */
  var canSelectMany: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show collapse all action or not.
    */
  var showCollapseAll: js.UndefOr[Boolean] = js.native
  
  /**
    * A data provider that provides tree data.
    */
  var treeDataProvider: TreeDataProvider[T] = js.native
}
object TreeViewOptions {
  
  @scala.inline
  def apply[T](treeDataProvider: TreeDataProvider[T]): TreeViewOptions[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewOptions[T]]
  }
  
  @scala.inline
  implicit class TreeViewOptionsMutableBuilder[Self <: TreeViewOptions[_], T] (val x: Self with TreeViewOptions[T]) extends AnyVal {
    
    @scala.inline
    def setCanSelectMany(value: Boolean): Self = StObject.set(x, "canSelectMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSelectManyUndefined: Self = StObject.set(x, "canSelectMany", js.undefined)
    
    @scala.inline
    def setShowCollapseAll(value: Boolean): Self = StObject.set(x, "showCollapseAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCollapseAllUndefined: Self = StObject.set(x, "showCollapseAll", js.undefined)
    
    @scala.inline
    def setTreeDataProvider(value: TreeDataProvider[T]): Self = StObject.set(x, "treeDataProvider", value.asInstanceOf[js.Any])
  }
}
