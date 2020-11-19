package typingsSlinky.useCombinedReducers

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-combined-reducers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T, A](
    combinedReducers: Record[
      /* keyof T */ String, 
      js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
        Dispatch[A]
      ]
    ]
  ): js.Tuple2[T, js.Function1[/* action */ A, Unit]] = js.native
}
