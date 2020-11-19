package typingsSlinky.urqlCore.fetchOptionsMod

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.urqlCore.typesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/internal/fetchOptions", "makeFetchOptions")
@js.native
object makeFetchOptions extends js.Object {
  
  def apply(operation: Operation): RequestInit = js.native
  def apply(operation: Operation, body: FetchBody): RequestInit = js.native
}
