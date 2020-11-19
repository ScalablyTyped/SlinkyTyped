package typingsSlinky.urqlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type DebugEvent[T /* <: typingsSlinky.urqlCore.urqlCoreStrings.cacheHit | typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation | typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest | typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess | typingsSlinky.urqlCore.urqlCoreStrings.fetchError | typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */] = typingsSlinky.urqlCore.typesMod.DebugEventArg[T] with typingsSlinky.urqlCore.anon.Source
  
  type DebugEventArg[T /* <: typingsSlinky.urqlCore.urqlCoreStrings.cacheHit | typingsSlinky.urqlCore.urqlCoreStrings.cacheInvalidation | typingsSlinky.urqlCore.urqlCoreStrings.fetchRequest | typingsSlinky.urqlCore.urqlCoreStrings.fetchSuccess | typingsSlinky.urqlCore.urqlCoreStrings.fetchError | typingsSlinky.urqlCore.urqlCoreStrings.retryRetrying | java.lang.String */] = typingsSlinky.urqlCore.anon.Message[T] with (typingsSlinky.urqlCore.anon.`0` | typingsSlinky.urqlCore.anon.Data[T])
  
  type Exchange = js.Function1[
    /* input */ typingsSlinky.urqlCore.typesMod.ExchangeInput, 
    typingsSlinky.urqlCore.typesMod.ExchangeIO
  ]
  
  type ExchangeIO = js.Function1[
    /* ops$ */ typingsSlinky.wonka.wonkaTypesGenMod.sourceT[typingsSlinky.urqlCore.typesMod.Operation], 
    typingsSlinky.wonka.wonkaTypesGenMod.sourceT[typingsSlinky.urqlCore.typesMod.OperationResult[js.Any]]
  ]
  
  type PromisifiedSource[T] = typingsSlinky.wonka.wonkaTypesGenMod.sourceT[T] with typingsSlinky.urqlCore.anon.ToPromise[T]
}
