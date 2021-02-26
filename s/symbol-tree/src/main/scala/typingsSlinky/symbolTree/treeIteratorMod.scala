package typingsSlinky.symbolTree

import typingsSlinky.std.IterableIterator
import typingsSlinky.symbolTree.symbolTreeNumbers.`1`
import typingsSlinky.symbolTree.symbolTreeNumbers.`2`
import typingsSlinky.symbolTree.symbolTreeNumbers.`3`
import typingsSlinky.symbolTree.symbolTreeNumbers.`4`
import typingsSlinky.symbolTree.symbolTreeNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeIteratorMod {
  
  @JSImport("symbol-tree/lib/TreeIterator", JSImport.Namespace)
  @js.native
  class ^[T /* <: js.Object */] protected () extends TreeIterator[T] {
    def this(
      tree: typingsSlinky.symbolTree.symbolTreeMod.^[_],
      root: T,
      firstResult: T,
      iterateFunction: IterateFunction
    ) = this()
  }
  
  /** Iterate all tree-inclusive following nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "FOLLOWING")
  @js.native
  val FOLLOWING: `5` = js.native
  
  /** Iterate next sibling nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "NEXT")
  @js.native
  val NEXT: `2` = js.native
  
  /** Iterate ancestor nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PARENT")
  @js.native
  val PARENT: `3` = js.native
  
  /** Iterate all tree-inclusive preceding nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PRECEDING")
  @js.native
  val PRECEDING: `4` = js.native
  
  /** Iterate previous sibling nodes. */
  /* static member */
  @JSImport("symbol-tree/lib/TreeIterator", "PREV")
  @js.native
  val PREV: `1` = js.native
  
  /**
    * The iteration function to use.
    *
    * - `1`: Iterate previous sibling nodes.
    * - `2`: Iterate next sibling nodes.
    * - `3`: Iterate ancestor nodes.
    * - `4`: Iterate all tree-inclusive preceding nodes.
    * - `5`: Iterate all tree-inclusive following nodes.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.symbolTree.symbolTreeNumbers.`1`
    - typingsSlinky.symbolTree.symbolTreeNumbers.`2`
    - typingsSlinky.symbolTree.symbolTreeNumbers.`3`
    - typingsSlinky.symbolTree.symbolTreeNumbers.`4`
    - typingsSlinky.symbolTree.symbolTreeNumbers.`5`
  */
  trait IterateFunction extends StObject
  object IterateFunction {
    
    @scala.inline
    def `1`: typingsSlinky.symbolTree.symbolTreeNumbers.`1` = 1.asInstanceOf[typingsSlinky.symbolTree.symbolTreeNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.symbolTree.symbolTreeNumbers.`2` = 2.asInstanceOf[typingsSlinky.symbolTree.symbolTreeNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.symbolTree.symbolTreeNumbers.`3` = 3.asInstanceOf[typingsSlinky.symbolTree.symbolTreeNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.symbolTree.symbolTreeNumbers.`4` = 4.asInstanceOf[typingsSlinky.symbolTree.symbolTreeNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.symbolTree.symbolTreeNumbers.`5` = 5.asInstanceOf[typingsSlinky.symbolTree.symbolTreeNumbers.`5`]
  }
  
  @js.native
  trait TreeIterator[T /* <: js.Object */] extends IterableIterator[T] {
    
    @JSName(js.Symbol.iterator)
    var iterator_TreeIterator: js.Function0[this.type] = js.native
    
    def next(): TreeIteratorResult[T] = js.native
  }
  
  @js.native
  trait TreeIteratorResult[T] extends StObject {
    
    var done: Boolean = js.native
    
    var value: T = js.native
  }
  object TreeIteratorResult {
    
    @scala.inline
    def apply[T](done: Boolean, value: T): TreeIteratorResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeIteratorResult[T]]
    }
    
    @scala.inline
    implicit class TreeIteratorResultMutableBuilder[Self <: TreeIteratorResult[_], T] (val x: Self with TreeIteratorResult[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
