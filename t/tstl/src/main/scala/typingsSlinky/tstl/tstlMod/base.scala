package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.baseContainerIContainerMod.IContainer
import typingsSlinky.tstl.baseContainerILinearContainerMod.ILinearContainer
import typingsSlinky.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import typingsSlinky.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typingsSlinky.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typingsSlinky.tstl.baseIteratorISetIteratorMod.ISetIterator
import typingsSlinky.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typingsSlinky.tstl.baseIteratorIteratorMod.Iterator
import typingsSlinky.tstl.baseIteratorListIteratorMod.ListIterator
import typingsSlinky.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typingsSlinky.tstl.tstlNumbers.`false`
import typingsSlinky.tstl.tstlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "base")
@js.native
object base extends js.Object {
  @js.native
  abstract class ArrayContainer[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: typingsSlinky.tstl.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
    extends typingsSlinky.tstl.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT]
  
  @js.native
  class ArrayIterator[T, SourceT /* <: typingsSlinky.tstl.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT]
  
  @js.native
  class ArrayReverseIterator[T, SourceT /* <: typingsSlinky.tstl.baseContainerArrayContainerMod.ArrayContainer[
    T, 
    SourceT, 
    SourceT, 
    typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayIterator[T, SourceT], 
    typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT], 
    T
  ] */] ()
    extends typingsSlinky.tstl.baseIteratorArrayIteratorMod.ArrayReverseIterator[T, SourceT]
  
  @js.native
  abstract class Container[T /* <: Elem */, SourceT /* <: typingsSlinky.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] ()
    extends typingsSlinky.tstl.baseContainerContainerMod.Container[T, SourceT, IteratorT, ReverseIteratorT, Elem]
  
  @js.native
  class ForOfAdaptor[T, InputIterator /* <: IForwardIterator[T, InputIterator] */] protected ()
    extends typingsSlinky.tstl.baseMod.ForOfAdaptor[T, InputIterator] {
    /**
      * Initializer Constructor.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def this(first: InputIterator, last: InputIterator) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ListContainer[T, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: typingsSlinky.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */] protected ()
    extends typingsSlinky.tstl.baseMod.ListContainer[T, SourceT, IteratorT, ReverseIteratorT]
  
  @js.native
  abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typingsSlinky.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends typingsSlinky.tstl.baseMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[
            /* thisArg */ Source, 
            ILinearContainer[
              typingsSlinky.tstl.utilityEntryMod.Entry[Key, T], 
              Source, 
              IteratorT, 
              ReverseT, 
              typingsSlinky.tstl.utilityEntryMod.Entry[Key, T]
            ]
          ]) = this()
  }
  
  @js.native
  abstract class MultiMap[Key, T, Source /* <: typingsSlinky.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, `false`, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, `false`, Source, Iterator, Reverse] */] ()
    extends typingsSlinky.tstl.baseContainerMultiMapMod.MultiMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class MultiSet[Key, Source /* <: typingsSlinky.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `false`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `false`, Source, IteratorT, ReverseT] */] ()
    extends typingsSlinky.tstl.baseContainerMultiSetMod.MultiSet[Key, Source, IteratorT, ReverseT]
  
  @js.native
  abstract class ReverseIterator[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: typingsSlinky.tstl.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, Base, This, Elem] */, Elem] protected ()
    extends typingsSlinky.tstl.baseMod.ReverseIterator[T, Source, Base, This, Elem] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: Base) = this()
  }
  
  @js.native
  abstract class SetContainer[Key, Unique /* <: Boolean */, Source /* <: typingsSlinky.tstl.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected ()
    extends typingsSlinky.tstl.baseMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
    /**
      * Default Constructor.
      */
    protected def this(factory: js.Function1[/* thisArg */ Source, ILinearContainer[Key, Source, IteratorT, ReverseT, Key]]) = this()
  }
  
  @js.native
  abstract class UniqueMap[Key, T, Source /* <: typingsSlinky.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, `true`, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, `true`, Source, Iterator, Reverse] */] ()
    extends typingsSlinky.tstl.baseContainerUniqueMapMod.UniqueMap[Key, T, Source, Iterator, Reverse]
  
  @js.native
  abstract class UniqueSet[Key, Source /* <: typingsSlinky.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `true`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `true`, Source, IteratorT, ReverseT] */] ()
    extends typingsSlinky.tstl.baseContainerUniqueSetMod.UniqueSet[Key, Source, IteratorT, ReverseT]
  
}

