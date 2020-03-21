package typingsSlinky.tstl

import typingsSlinky.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsSlinky.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsSlinky.tstl.entryMod.Entry
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.itreemapMod.ITreeMap
import typingsSlinky.tstl.mapElementVectorMod.MapElementVector.Iterator
import typingsSlinky.tstl.mapElementVectorMod.MapElementVector.ReverseIterator
import typingsSlinky.tstl.vectorContainerMod.VectorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/MapElementVector", JSImport.Namespace)
@js.native
object mapElementVectorMod extends js.Object {
  @js.native
  class MapElementVector[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends VectorContainer[
          Entry[Key, T], 
          Source, 
          MapElementVector[Key, T, Unique, Source], 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
  }
  
  @js.native
  object MapElementVector extends js.Object {
    /**
      * Iterator of map container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.itreemapMod.ITreeMap.Iterator because var conflicts: value. Inlined first, second */ @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] () extends ArrayIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
      /**
        * The first, key element.
        */
      @JSName("first")
      val first_FIterator: Key = js.native
      /**
        * The second, stored element.
        */
      @JSName("second")
      var second_FIterator: T = js.native
      /**
        * @inheritDoc
        */
      def first(): Key = js.native
      /**
        * @inheritDoc
        */
      def second(): T = js.native
      /**
        * @inheritDoc
        */
      def second(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of map container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsSlinky.tstl.itreemapMod.ITreeMap.ReverseIterator because var conflicts: value. Inlined first, second */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] () extends ArrayReverseIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
      /**
        * The first, key element.
        */
      @JSName("first")
      val first_FReverseIterator: Key = js.native
      /**
        * The second, stored element.
        */
      @JSName("second")
      var second_FReverseIterator: T = js.native
      /**
        * @inheritDoc
        */
      def first(): Key = js.native
      /**
        * @inheritDoc
        */
      def second(): T = js.native
      /**
        * @inheritDoc
        */
      def second(`val`: T): js.Any = js.native
    }
    
  }
  
}

