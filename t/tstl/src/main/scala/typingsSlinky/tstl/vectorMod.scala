package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorMod.ArrayIterator
import typingsSlinky.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ifrontMod.IFront
import typingsSlinky.tstl.vectorContainerMod.VectorContainer
import typingsSlinky.tstl.vectorMod.Vector.Iterator
import typingsSlinky.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
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
  class Vector[T] ()
    extends VectorContainer[T, Vector[T], Vector[T], Iterator[T], ReverseIterator[T]]
       with SourceType[js.Any]
       with IFront[T] {
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      */
    def this(items: js.Array[T]) = this()
    /**
      * Copy Constructor
      *
      * @param obj Object to copy.
      */
    def this(obj: Vector[T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iteartor of the last position.
      */
    def this(
      first: IForwardIterator[T, IForwardIterator[T, _]],
      last: IForwardIterator[T, IForwardIterator[T, _]]
    ) = this()
    /**
      * Fill Constructor.
      *
      * @param size Initial size.
      * @param val Value to fill.
      */
    def this(n: Double, `val`: T) = this()
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, Vector[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typingsSlinky.tstl.icontainerMod.IContainer.Iterator[T, Vector[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(): T = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def front(`val`: T): Unit = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    override def push_back(`val`: T): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: Vector[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
  /* static members */
  @js.native
  object Vector extends js.Object {
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
      * Wrap an array into a vector.
      *
      * @param data Target array to be wrapped
      * @return A vector wrapping the parametric array.
      */
    def wrap[T](data: js.Array[T]): Vector[T] = js.native
    /**
      * Iterator of {@link Vector}
      */
    type Iterator[T] = ArrayIterator[T, Vector[T]]
    /**
      * Reverse iterator of {@link Vector}
      */
    type ReverseIterator[T] = ArrayReverseIterator[T, Vector[T]]
  }
  
}

