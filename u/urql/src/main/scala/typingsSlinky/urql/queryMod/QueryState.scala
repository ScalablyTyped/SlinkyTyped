package typingsSlinky.urql.queryMod

import typingsSlinky.urql.anon.PartialOperationContext
import typingsSlinky.urql.useQueryMod.UseQueryState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryState[T] extends UseQueryState[T] {
  
  def executeQuery(): Unit = js.native
  def executeQuery(opts: PartialOperationContext): Unit = js.native
}
