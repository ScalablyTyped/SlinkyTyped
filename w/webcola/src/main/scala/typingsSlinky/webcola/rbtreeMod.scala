package typingsSlinky.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbtreeMod {
  
  @JSImport("webcola/dist/src/rbtree", "Iterator")
  @js.native
  class Iterator protected () extends StObject {
    def this(tree: js.Any) = this()
    
    var _ancestors: js.Any = js.native
    
    var _cursor: js.Any = js.native
    
    def _maxNode(start: js.Any): Unit = js.native
    
    def _minNode(start: js.Any): Unit = js.native
    
    var _tree: js.Any = js.native
    
    def data(): js.Any = js.native
    
    def next(): js.Any = js.native
    
    def prev(): js.Any = js.native
  }
  
  @JSImport("webcola/dist/src/rbtree", "RBTree")
  @js.native
  class RBTree[T] protected () extends TreeBase {
    def this(comparator: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    
    def insert(data: js.Any): Boolean = js.native
    
    def remove(data: js.Any): Boolean = js.native
  }
  /* static members */
  object RBTree {
    
    @JSImport("webcola/dist/src/rbtree", "RBTree.double_rotate")
    @js.native
    def double_rotate(root: js.Any, dir: js.Any): js.Any = js.native
    
    @JSImport("webcola/dist/src/rbtree", "RBTree.is_red")
    @js.native
    def is_red(node: js.Any): js.Any = js.native
    
    @JSImport("webcola/dist/src/rbtree", "RBTree.single_rotate")
    @js.native
    def single_rotate(root: js.Any, dir: js.Any): js.Any = js.native
  }
  
  @JSImport("webcola/dist/src/rbtree", "TreeBase")
  @js.native
  class TreeBase () extends StObject {
    
    def _bound(data: js.Any, cmp: js.Any): Iterator = js.native
    
    var _comparator: js.Any = js.native
    
    var _root: js.Any = js.native
    
    def clear(): Unit = js.native
    
    def each(cb: js.Any): Unit = js.native
    
    def find(data: js.Any): js.Any = js.native
    
    def findIter(data: js.Any): js.Any = js.native
    
    def iterator(): Iterator = js.native
    
    def lowerBound(data: js.Any): Iterator = js.native
    
    def max(): js.Any = js.native
    
    def min(): js.Any = js.native
    
    def reach(cb: js.Any): Unit = js.native
    
    var size: js.Any = js.native
    
    def upperBound(data: js.Any): Iterator = js.native
  }
}
