package typingsSlinky.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useMutationMod {
  
  type UseMutationResponse[T, V] = js.Tuple2[
    typingsSlinky.urql.useMutationMod.UseMutationState[T], 
    js.Function2[
      /* variables */ js.UndefOr[V], 
      /* context */ js.UndefOr[typingsSlinky.urql.anon.PartialOperationContext], 
      js.Promise[typingsSlinky.urqlCore.typesMod.OperationResult[T]]
    ]
  ]
}
