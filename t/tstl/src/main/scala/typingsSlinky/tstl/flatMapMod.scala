package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.flatMapMod.FlatMap.Iterator
import typingsSlinky.tstl.flatMapMod.FlatMap.ReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.itreemapMod.ITreeMap
import typingsSlinky.tstl.tstlBooleans.`true`
import typingsSlinky.tstl.uniqueTreeMapMod.UniqueTreeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/experimental/container/FlatMap", JSImport.Namespace)
@js.native
object flatMapMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMap[Key, T] () extends UniqueTreeMap[Key, T, FlatMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    def this(comp: Comparator[Key, Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: Comparator[Key, Key]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: Comparator[Key, Key]
    ) = this()
    
    var _Capsule_key: js.Any = js.native
    
    /* protected */ def _Handle_erase(has0: js.Object, has1: js.Object): Unit = js.native
    
    /* protected */ def _Handle_insert(has0: js.Object, has1: js.Object): Unit = js.native
    
    var key_comp_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def nth(index: Double): Iterator[Key, T] = js.native
  }
  @js.native
  object FlatMap extends js.Object {
    
    val Iterator: Instantiable0[
        typingsSlinky.tstl.mapElementVectorMod.MapElementVector.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          ITreeMap[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.mapElementVectorMod.MapElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    
    val ReverseIterator: Instantiable0[
        typingsSlinky.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          ITreeMap[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typingsSlinky.tstl.mapElementVectorMod.MapElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typingsSlinky.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    
    val __MODULE: /* "experimental" */ String = js.native
    
    type Iterator[Key, T] = typingsSlinky.tstl.mapElementVectorMod.MapElementVector.Iterator[Key, T, `true`, FlatMap[Key, T]]
    
    type ReverseIterator[Key, T] = typingsSlinky.tstl.mapElementVectorMod.MapElementVector.ReverseIterator[Key, T, `true`, FlatMap[Key, T]]
  }
}
