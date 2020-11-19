package typingsSlinky.tstl.mapContainerMod

import typingsSlinky.tstl.containerContainerMod.Container
import typingsSlinky.tstl.entryMod.Entry
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.mapContainerMod.MapContainer.InsertRet
import typingsSlinky.tstl.mapContainerMod.MapContainer.Iterator
import typingsSlinky.tstl.mapContainerMod.MapContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.tstl.isizeMod.ISize because Already inherited
- typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
- typingsSlinky.tstl.ipushMod.IPush because Already inherited
- typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
- typingsSlinky.std.Iterable because Already inherited
- typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
- typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
- typingsSlinky.tstl.iassociativecontainerMod.IAssociativeContainer because var conflicts: iterator. Inlined find, has, count */ @JSImport("tstl/base/container/MapContainer", "MapContainer")
@js.native
abstract class MapContainer_[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected () extends Container[Entry[Key, T], Source, IteratorT, ReverseT, IPair[Key, T]] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ Source, 
        ILinearContainerBase[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
      ]) = this()
  
  /* protected */ def _Erase_by_key(key: Key): Double = js.native
  
  /* protected */ def _Erase_by_range(first: IteratorT): IteratorT = js.native
  /* protected */ def _Erase_by_range(first: IteratorT, last: IteratorT): IteratorT = js.native
  
  /* protected */ def _Handle_erase(first: IteratorT, last: IteratorT): Unit = js.native
  
  /* protected */ def _Handle_insert(first: IteratorT, last: IteratorT): Unit = js.native
  
  /* protected */ def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  
  /**
    * @inheritDoc
    */
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  def count(key: Key): Double = js.native
  
  var data_ : ILinearContainerBase[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]] = js.native
  
  def emplace(key: Key, `val`: T): InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
  
  def emplace_hint(hint: IteratorT, key: Key, `val`: T): IteratorT = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("erase")
  def erase_IteratorT(it: IteratorT): IteratorT = js.native
  
  /**
    * @inheritDoc
    */
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  def find(key: Key): IteratorT = js.native
  
  /**
    * @inheritDoc
    */
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  def has(key: Key): Boolean = js.native
  
  def insert(hint: IteratorT, pair: IPair[Key, T]): IteratorT = js.native
  def insert(pair: IPair[Key, T]): InsertRet[Key, T, Unique, Source, IteratorT, ReverseT] = js.native
  def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  
  /**
    * Merge two containers.
    *
    * @param source Source container to transfer.
    */
  def merge(source: Source): Unit = js.native
}
