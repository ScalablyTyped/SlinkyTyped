package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.QueuingStrategy
import typingsSlinky.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TransformStream")
@js.native
class TransformStream[I, O] ()
  extends typingsSlinky.std.TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: js.UndefOr[scala.Nothing], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(
    transformer: js.UndefOr[scala.Nothing],
    writableStrategy: js.UndefOr[scala.Nothing],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: js.UndefOr[scala.Nothing],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: js.UndefOr[scala.Nothing],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
}
@JSGlobal("TransformStream")
@js.native
object TransformStream
  extends Instantiable0[typingsSlinky.std.TransformStream[js.Object, js.Object]]
     with Instantiable1[
      /* transformer */ Transformer[js.Object, js.Object], 
      typingsSlinky.std.TransformStream[js.Object, js.Object]
    ]
     with Instantiable2[
      js.UndefOr[/* transformer */ Transformer[js.Object, js.Object]], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      typingsSlinky.std.TransformStream[js.Object, js.Object]
    ]
     with Instantiable3[
      js.UndefOr[/* transformer */ Transformer[js.Object, js.Object]], 
      js.UndefOr[/* writableStrategy */ QueuingStrategy[js.Object]], 
      /* readableStrategy */ QueuingStrategy[js.Object], 
      typingsSlinky.std.TransformStream[js.Object, js.Object]
    ]
