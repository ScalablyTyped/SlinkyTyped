package typingsSlinky.sodiumjs.mod

import typingsSlinky.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "Cell")
@js.native
class Cell[A] protected ()
  extends typingsSlinky.sodiumjs.cellMod.Cell[A] {
  def this(initValue: A) = this()
  def this(initValue: A, str: typingsSlinky.sodiumjs.streamMod.Stream[A]) = this()
}
/* static members */
@JSImport("sodiumjs", "Cell")
@js.native
object Cell extends js.Object {
  
  var _liftArray: js.Any = js.native
  
  /**
    * Apply a value inside a cell to a function inside a cell. This is the
    * primitive for all function lifting.
    */
  @JSName("apply")
  def apply[A, B](
    cf: typingsSlinky.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typingsSlinky.sodiumjs.cellMod.Cell[A]
  ): typingsSlinky.sodiumjs.cellMod.Cell[B] = js.native
  @JSName("apply")
  def apply[A, B](
    cf: typingsSlinky.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typingsSlinky.sodiumjs.cellMod.Cell[A],
    sources: js.Array[Source]
  ): typingsSlinky.sodiumjs.cellMod.Cell[B] = js.native
  
  /**
    * Fantasy-land Algebraic Data Type Compatability.
    * Cell satisfies the Functor, Apply, Applicative categories
    * @see {@link https://github.com/fantasyland/fantasy-land} for more info
    */
  @JSName("fantasy-land/of")
  def `fantasy-landSlashof`[A](a: A): typingsSlinky.sodiumjs.cellMod.Cell[A] = js.native
  
  /**
    * Lift an array of cells into a cell of an array.
    */
  def liftArray[A](ca: js.Array[typingsSlinky.sodiumjs.cellMod.Cell[A]]): typingsSlinky.sodiumjs.cellMod.Cell[js.Array[A]] = js.native
  
  /**
    * Unwrap a cell inside another cell to give a time-varying cell implementation.
    */
  def switchC[A](cca: typingsSlinky.sodiumjs.cellMod.Cell[typingsSlinky.sodiumjs.cellMod.Cell[A]]): typingsSlinky.sodiumjs.cellMod.Cell[A] = js.native
  
  /**
    * Unwrap a stream inside a cell to give a time-varying stream implementation.
    */
  def switchS[A](csa: typingsSlinky.sodiumjs.cellMod.Cell[typingsSlinky.sodiumjs.streamMod.Stream[A]]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
}
