package typingsSlinky.tstl.tstlModuleMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.anon.Iteratoranyanyany
import typingsSlinky.tstl.binaryPredicatorMod.BinaryPredicator
import typingsSlinky.tstl.hasherMod.Hasher
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.setContainerMod.SetContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "HashSet")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashSet[Key] ()
  extends typingsSlinky.tstl.tstlMod.HashSet[Key] {
  def this(hash: Hasher[Key]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[Key]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: typingsSlinky.tstl.hashSetMod.HashSet[Key]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]]
  ) = this()
  def this(hash: js.UndefOr[scala.Nothing], equal: BinaryPredicator[Key, Key]) = this()
  def this(hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
  def this(items: js.Array[Key], hash: Hasher[Key]) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: Hasher[Key]
  ) = this()
  def this(items: js.Array[Key], hash: js.UndefOr[scala.Nothing], equal: BinaryPredicator[Key, Key]) = this()
  def this(items: js.Array[Key], hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: js.UndefOr[scala.Nothing],
    equal: BinaryPredicator[Key, Key]
  ) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: Hasher[Key],
    equal: BinaryPredicator[Key, Key]
  ) = this()
}
@JSImport("tstl/module", "HashSet")
@js.native
object HashSet extends js.Object {
  
  val Iterator: Instantiable0[
    typingsSlinky.tstl.setElementListMod.SetElementList.Iterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        Iteratoranyanyany, 
        typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  
  val ReverseIterator: Instantiable0[
    typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        Iteratoranyanyany, 
        typingsSlinky.tstl.setElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
}
