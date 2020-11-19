package typingsSlinky.urqlCore

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.urqlCore.anon.Query
import typingsSlinky.urqlCore.fetchOptionsMod.FetchBody
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationResult
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/internal", JSImport.Namespace)
@js.native
object internalMod extends js.Object {
  
  def makeFetchBody(request: Query): FetchBody = js.native
  
  def makeFetchOptions(operation: Operation): RequestInit = js.native
  def makeFetchOptions(operation: Operation, body: FetchBody): RequestInit = js.native
  
  def makeFetchSource(operation: Operation, url: String, fetchOptions: RequestInit): sourceT[OperationResult[_]] = js.native
  
  def makeFetchURL(operation: Operation): String = js.native
  def makeFetchURL(operation: Operation, body: FetchBody): String = js.native
}
