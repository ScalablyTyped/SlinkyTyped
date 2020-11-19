package typingsSlinky.urql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useQueryMod {
  
  type UseQueryResponse[T] = js.Tuple2[
    typingsSlinky.urql.useQueryMod.UseQueryState[T], 
    js.Function1[/* opts */ js.UndefOr[typingsSlinky.urql.anon.PartialOperationContext], scala.Unit]
  ]
}
