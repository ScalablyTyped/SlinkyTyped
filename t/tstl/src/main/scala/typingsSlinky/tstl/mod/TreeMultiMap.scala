package typingsSlinky.tstl.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.anon.Iteratoranyanyanyany
import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipairMod.IPair
import typingsSlinky.tstl.mapContainerMod.MapContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "TreeMultiMap")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class TreeMultiMap[Key, T] ()
  extends typingsSlinky.tstl.tstlModuleMod.TreeMultiMap[Key, T] {
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
  def this(obj: typingsSlinky.tstl.treeMultiMapMod.TreeMultiMap[Key, T]) = this()
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
}
@JSImport("tstl", "TreeMultiMap")
@js.native
object TreeMultiMap extends js.Object {
  
  val Iterator: Instantiable0[
    typingsSlinky.tstl.mapElementListMod.MapElementList.Iterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        Iteratoranyanyanyany, 
        typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  
  val ReverseIterator: Instantiable0[
    typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        Iteratoranyanyanyany, 
        typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
}
