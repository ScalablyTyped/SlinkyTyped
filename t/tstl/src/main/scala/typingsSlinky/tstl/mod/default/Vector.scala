package typingsSlinky.tstl.mod.default

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.tstl.arrayContainerMod.ArrayContainer
import typingsSlinky.tstl.arrayIteratorMod.ArrayIterator
import typingsSlinky.tstl.arrayReverseIteratorMod.ArrayReverseIterator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "Vector")
@js.native
/**
  * Default Constructor.
  */
class Vector[T] ()
  extends typingsSlinky.tstl.tstlModuleMod.Vector[T] {
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
  def this(obj: typingsSlinky.tstl.vectorMod.Vector[T]) = this()
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
}
/* static members */
@JSImport("tstl", "Vector")
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
  def wrap[T](data: js.Array[T]): typingsSlinky.tstl.vectorMod.Vector[T] = js.native
}
