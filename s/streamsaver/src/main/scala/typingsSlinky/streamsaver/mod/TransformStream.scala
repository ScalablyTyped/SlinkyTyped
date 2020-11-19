package typingsSlinky.streamsaver.mod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.QueuingStrategy
import typingsSlinky.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streamsaver", "TransformStream")
@js.native
class TransformStream[I, O] protected ()
  extends typingsSlinky.std.TransformStream[I, O] {
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
}
@JSImport("streamsaver", "TransformStream")
@js.native
object TransformStream
  extends Instantiable3[
      /* transformer */ Transformer[js.Object, js.Object], 
      /* writableStrategy */ QueuingStrategy[js.Object], 
      /* readableStrategy */ QueuingStrategy[js.Object], 
      typingsSlinky.std.TransformStream[js.Object, js.Object]
    ]
