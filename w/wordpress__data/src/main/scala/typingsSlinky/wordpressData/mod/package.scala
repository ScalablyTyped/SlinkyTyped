package typingsSlinky.wordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DispatcherMap = typingsSlinky.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]]
  
  type Plugin[T /* <: typingsSlinky.std.Record[java.lang.String, _] */] = js.Function2[
    /* registry */ typingsSlinky.wordpressData.mod.DataRegistry, 
    /* options */ T, 
    typingsSlinky.wordpressData.anon.PartialDataRegistry
  ]
  
  type SelectorMap = typingsSlinky.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  
  type Subscriber = js.Function1[/* callback */ js.Function0[scala.Unit], js.Function0[scala.Unit]]
}
