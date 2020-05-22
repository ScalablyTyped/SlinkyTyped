package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.anon.ReadonlyIForwardIteratorb
import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorMod.ArrayIterator
import typingsSlinky.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ifrontMod.IFront
import typingsSlinky.tstl.vectorBooleanMod.VectorBoolean.Iterator
import typingsSlinky.tstl.vectorBooleanMod.VectorBoolean.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/VectorBoolean", JSImport.Namespace)
@js.native
object vectorBooleanMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.tstl.isizeMod.ISize because Already inherited
  - typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsSlinky.tstl.ipushMod.IPush because Already inherited
  - typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
  - typingsSlinky.std.Iterable because Already inherited
  - typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsSlinky.tstl.ipushbackMod.IPushBack because Already inherited
  - typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
  - typingsSlinky.tstl.ilinearcontainerbaseMod.ILinearContainerBase because Already inherited
  - typingsSlinky.tstl.ilinearcontainerMod.ILinearContainer because var conflicts: iterator. Inlined 
  - typingsSlinky.tstl.iarraycontainerMod.IArrayContainer because var conflicts: iterator. Inlined  */ @js.native
  /**
    * Default Constructor.
    */
  class VectorBoolean ()
    extends ArrayContainer[Boolean, VectorBoolean, VectorBoolean, Iterator, ReverseIterator, Boolean]
       with IFront[Boolean] {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(array: js.Array[Boolean]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: VectorBoolean) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      */
    def this(first: ReadonlyIForwardIteratorb, last: ReadonlyIForwardIteratorb) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(n: Double, `val`: Boolean) = this()
    var _Find_node: js.Any = js.native
    var _Insert_to_end: js.Any = js.native
    var _Insert_to_middle: js.Any = js.native
    /**
      * Store not full elements, but their sequence.
      *
      *   - first: index
      *   - second: value
      */
    var data_ : js.Any = js.native
    /**
      * Number of elements
      */
    var size_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def assign(n: Double, `val`: Boolean): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[Boolean, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator, last: Iterator): Iterator = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator): Iterator = js.native
    /**
      * Flip all values.
      */
    def flip(): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(): Boolean = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(`val`: Boolean): Unit = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: VectorBoolean): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[Boolean] = js.native
  }
  
  @js.native
  object VectorBoolean extends js.Object {
    val Iterator: Instantiable0[
        ArrayIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        ArrayReverseIterator[
          js.Object, 
          ArrayContainer[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            ArrayIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            ArrayReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any
            ], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ]
        ]
      ] = js.native
    /**
      * Iterator of {@link VectorBoolean}
      */
    type Iterator = ArrayIterator[Boolean, VectorBoolean]
    /**
      * Reverse iterator of {@link VectorBoolean}
      */
    type ReverseIterator = ArrayReverseIterator[Boolean, VectorBoolean]
  }
  
}

