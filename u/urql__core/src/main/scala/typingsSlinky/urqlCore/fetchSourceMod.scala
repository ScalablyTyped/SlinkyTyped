package typingsSlinky.urqlCore

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationResult
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/internal/fetchSource", JSImport.Namespace)
@js.native
object fetchSourceMod extends js.Object {
  def makeFetchSource(operation: Operation, url: String, fetchOptions: RequestInit): sourceT[OperationResult[_]] = js.native
}

