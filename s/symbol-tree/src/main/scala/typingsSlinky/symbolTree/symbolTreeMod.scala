package typingsSlinky.symbolTree

import typingsSlinky.symbolTree.anon.Filter
import typingsSlinky.symbolTree.symbolTreeNumbers.`16`
import typingsSlinky.symbolTree.symbolTreeNumbers.`1`
import typingsSlinky.symbolTree.symbolTreeNumbers.`2`
import typingsSlinky.symbolTree.symbolTreeNumbers.`4`
import typingsSlinky.symbolTree.symbolTreeNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolTreeMod {
  
  @JSImport("symbol-tree/lib/SymbolTree", JSImport.Namespace)
  @js.native
  /**
    * @param [description='SymbolTree data'] Description used for the Symbol
    *
    *        **Default:** `'SymbolTree data'`
    */
  class ^[T /* <: js.Object */] () extends SymbolTree[T] {
    def this(description: String) = this()
  }
  
  /* static member */
  object TreePosition {
    
    @JSImport("symbol-tree/lib/SymbolTree", "TreePosition.CONTAINED_BY")
    @js.native
    val CONTAINED_BY: `16` = js.native
    
    @JSImport("symbol-tree/lib/SymbolTree", "TreePosition.CONTAINS")
    @js.native
    val CONTAINS: `8` = js.native
    
    @JSImport("symbol-tree/lib/SymbolTree", "TreePosition.DISCONNECTED")
    @js.native
    val DISCONNECTED: `1` = js.native
    
    @JSImport("symbol-tree/lib/SymbolTree", "TreePosition.FOLLOWING")
    @js.native
    val FOLLOWING: `4` = js.native
    
    @JSImport("symbol-tree/lib/SymbolTree", "TreePosition.PRECEDING")
    @js.native
    val PRECEDING: `2` = js.native
  }
  
  @js.native
  trait IteratorOptions extends StObject {
    
    /**
      * Whether to iterate in reverse tree order.
      *
      * @default false
      */
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object IteratorOptions {
    
    @scala.inline
    def apply(): IteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IteratorOptions]
    }
    
    @scala.inline
    implicit class IteratorOptionsMutableBuilder[Self <: IteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait SiblingOptions[T /* <: js.Object */] extends StObject {
    
    /**
      * Used to constrain the operation to a subtree.
      *
      * When `null`, the whole tree is walked to the real root.
      *
      * @default null
      */
    var root: js.UndefOr[T | Null] = js.native
    
    /**
      * If set, ignore the children of `object`
      *
      * @default false
      */
    var skipChildren: js.UndefOr[Boolean] = js.native
  }
  object SiblingOptions {
    
    @scala.inline
    def apply[T /* <: js.Object */](): SiblingOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiblingOptions[T]]
    }
    
    @scala.inline
    implicit class SiblingOptionsMutableBuilder[Self <: SiblingOptions[_], T /* <: js.Object */] (val x: Self with SiblingOptions[T]) extends AnyVal {
      
      @scala.inline
      def setRoot(value: T): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSkipChildren(value: Boolean): Self = StObject.set(x, "skipChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipChildrenUndefined: Self = StObject.set(x, "skipChildren", js.undefined)
    }
  }
  
  @js.native
  trait SymbolTree[T /* <: js.Object */] extends StObject {
    
    /**
      * Iterate over all inclusive ancestors of the given object
      *
      * * `O(1)` for a single iteration
      *
      * @return An iterable iterator (ES6)
      */
    def ancestorsIterator(`object`: T): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    
    def ancestorsToArray(`object`: T): js.Array[T] = js.native
    def ancestorsToArray(`object`: T, options: ToArrayOptions[T]): js.Array[T] = js.native
    /**
      * Append all inclusive ancestors of the given object to an array.
      *
      * * `O(n)` where `n` is the amount of ancestors of the given `object`
      */
    @JSName("ancestorsToArray")
    def ancestorsToArray_THIS[THIS](`object`: T): js.Array[T] = js.native
    @JSName("ancestorsToArray")
    def ancestorsToArray_THIS[THIS](`object`: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
    
    /**
      * Insert the given object as the last child of the given reference object.
      * `newObject` is now the last child of `referenceObject`.
      *
      * * `O(1)`
      *
      * @throws {Error} If the newObject is already present in this SymbolTree
      */
    def appendChild[U /* <: T */](referenceObject: T, newObject: U): U = js.native
    
    /**
      * Calculate the number of children.
      *
      * * `O(n)` where `n` is the amount of children
      * * `O(1)` (amortized, if the tree is not modified)
      */
    def childrenCount(`object`: T): Double = js.native
    
    /**
      * Iterate over all children of the given object
      *
      * * `O(1)` for a single iteration
      *
      * @return An iterable iterator (ES6)
      */
    def childrenIterator(parent: T): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    def childrenIterator(parent: T, options: IteratorOptions): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    
    def childrenToArray(parent: T): js.Array[T] = js.native
    def childrenToArray(parent: T, options: ToArrayOptions[T]): js.Array[T] = js.native
    /**
      * Append all children of the given object to an array.
      *
      * * `O(n)` where `n` is the amount of children of the given `parent`
      */
    @JSName("childrenToArray")
    def childrenToArray_THIS[THIS](parent: T): js.Array[T] = js.native
    @JSName("childrenToArray")
    def childrenToArray_THIS[THIS](parent: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
    
    /**
      * Compare the position of an object relative to another object. A bit set is returned:
      *
      * <ul>
      *     <li>DISCONNECTED : 1</li>
      *     <li>PRECEDING : 2</li>
      *     <li>FOLLOWING : 4</li>
      *     <li>CONTAINS : 8</li>
      *     <li>CONTAINED_BY : 16</li>
      * </ul>
      *
      * The semantics are the same as compareDocumentPosition in DOM, with the exception that
      * DISCONNECTED never occurs with any other bit.
      *
      * where `n` and `m` are the amount of ancestors of `left` and `right`;
      * where `o` is the amount of children of the lowest common ancestor of `left` and `right`:
      *
      * * `O(n + m + o)` (worst case)
      * * `O(n + m)` (amortized, if the tree is not modified)
      */
    def compareTreePosition(left: T, right: T): Double = js.native
    
    /**
      * Returns the first child of the given object.
      *
      * * `O(1)`
      */
    def firstChild(`object`: T): T | Null = js.native
    
    /**
      * Find the following object (A) of the given object (B).
      * An object A is following an object B if A and B are in the same tree
      * and A comes after B in tree order.
      *
      * * `O(n)` (worst case) where `n` is the amount of objects in the entire tree
      * * `O(1)` (amortized when walking the entire tree)
      */
    def following(`object`: T): T | Null = js.native
    def following(`object`: T, options: SiblingOptions[T]): T | Null = js.native
    
    /**
      * Returns `true` if the object has any children. Otherwise it returns `false`.
      *
      * * `O(1)`
      */
    def hasChildren(`object`: T): Boolean = js.native
    
    /**
      * Find the index of the given object (the number of preceding siblings).
      *
      * * `O(n)` where `n` is the amount of preceding siblings
      * * `O(1)` (amortized, if the tree is not modified)
      *
      * @return The number of preceding siblings, or -1 if the object has no parent
      */
    def index(`object`: T): Double = js.native
    
    /**
      * You can use this function to (optionally) initialize an object right after its creation,
      * to take advantage of V8's fast properties. Also useful if you would like to
      * freeze your object.
      *
      * * `O(1)`
      */
    def initialize[O /* <: js.UndefOr[T | Null] */](`object`: O): O = js.native
    
    /**
      * Insert the given object after the reference object.
      * `newObject` is now the next sibling of `referenceObject`.
      *
      * * `O(1)`
      *
      * @throws {Error} If the newObject is already present in this SymbolTree
      */
    def insertAfter[U /* <: T */](referenceObject: T, newObject: U): U = js.native
    
    /**
      * Insert the given object before the reference object.
      * `newObject` is now the previous sibling of `referenceObject`.
      *
      * * `O(1)`
      *
      * @throws {Error} If the newObject is already present in this SymbolTree
      */
    def insertBefore[U /* <: T */](referenceObject: T, newObject: U): U = js.native
    
    /**
      * Returns the last child of the given object.
      *
      * * `O(1)`
      */
    def lastChild(`object`: T): T | Null = js.native
    
    /**
      * Find the inclusive descendant that is last in tree order of the given object.
      *
      * * `O(n)` (worst case) where `n` is the depth of the subtree of `object`
      */
    def lastInclusiveDescendant(`object`: T): T | Null = js.native
    
    /**
      * Returns the next sibling of the given object.
      *
      * * `O(1)`
      */
    def nextSibling(`object`: T): T | Null = js.native
    
    /**
      * Iterate over all the next siblings of the given object. (in tree order)
      *
      * * `O(1)` for a single iteration
      *
      * @return An iterable iterator (ES6)
      */
    def nextSiblingsIterator(`object`: T): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    
    /**
      * Return the parent of the given object.
      *
      * * `O(1)`
      */
    def parent(`object`: T): T | Null = js.native
    
    /**
      * Find the preceding object (A) of the given object (B).
      * An object A is preceding an object B if A and B are in the same tree
      * and A comes before B in tree order.
      *
      * * `O(n)` (worst case)
      * * `O(1)` (amortized when walking the entire tree)
      */
    def preceding(`object`: T): T | Null = js.native
    def preceding(`object`: T, options: SiblingOptions[T]): T | Null = js.native
    
    /**
      * Insert the given object as the first child of the given reference object.
      * `newObject` is now the first child of `referenceObject`.
      *
      * * `O(1)`
      *
      * @throws {Error} If the newObject is already present in this SymbolTree
      */
    def prependChild[U /* <: T */](referenceObject: T, newObject: U): U = js.native
    
    /**
      * Returns the previous sibling of the given object.
      *
      * * `O(1)`
      */
    def previousSibling(`object`: T): T | Null = js.native
    
    /**
      * Iterate over all the previous siblings of the given object. (in reverse tree order)
      *
      * * `O(1)` for a single iteration
      *
      * @return An iterable iterator (ES6)
      */
    def previousSiblingsIterator(`object`: T): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    
    /**
      * Remove the object from this tree.
      * Has no effect if already removed.
      *
      * * `O(1)`
      */
    def remove[U /* <: T */](`object`: U): U = js.native
    
    /**
      * Iterate over all descendants of the given object (in tree order).
      *
      * Where `n` is the amount of objects in the sub-tree of the given `root`:
      *
      * * `O(n)` (worst case for a single iteration)
      * * `O(n)` (amortized, when completing the iterator)
      *
      * @return An iterable iterator (ES6)
      */
    def treeIterator(`object`: T): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    def treeIterator(`object`: T, options: IteratorOptions): typingsSlinky.symbolTree.treeIteratorMod.^[T] = js.native
    
    def treeToArray(`object`: T): js.Array[T] = js.native
    def treeToArray(`object`: T, options: ToArrayOptions[T]): js.Array[T] = js.native
    /**
      * Append all descendants of the given object to an array (in tree order).
      *
      * * `O(n)` where `n` is the amount of objects in the sub-tree of the given `object`
      */
    @JSName("treeToArray")
    def treeToArray_THIS[THIS](`object`: T): js.Array[T] = js.native
    @JSName("treeToArray")
    def treeToArray_THIS[THIS](`object`: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
  }
  
  @js.native
  trait ToArrayOptions[T /* <: js.Object */] extends StObject {
    
    /**
      * The array to initialize the operation with.
      *
      * @default
      * ```ts
      * new Array(0);
      * ```
      */
    var array: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * Function to test each object before it is added to the array.
      * Invoked with arguments (object).
      *
      * Should return `true` if an object is to be included.
      *
      * @param object
      */
    var filter: js.UndefOr[js.Function1[/* object */ T, _]] = js.native
    
    /** Value to use as `this` when executing `filter`. */
    var thisArg: js.UndefOr[js.Any] = js.native
  }
  object ToArrayOptions {
    
    @scala.inline
    def apply[T /* <: js.Object */](): ToArrayOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToArrayOptions[T]]
    }
    
    @scala.inline
    implicit class ToArrayOptionsMutableBuilder[Self <: ToArrayOptions[_], T /* <: js.Object */] (val x: Self with ToArrayOptions[T]) extends AnyVal {
      
      @scala.inline
      def setArray(value: js.Array[T]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setArrayVarargs(value: T*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: /* object */ T => _): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setThisArg(value: js.Any): Self = StObject.set(x, "thisArg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThisArgUndefined: Self = StObject.set(x, "thisArg", js.undefined)
    }
  }
}
