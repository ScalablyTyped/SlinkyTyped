package typingsSlinky.urqlCore

import typingsSlinky.urqlCore.typesMod.Operation
import typingsSlinky.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/utils/result", JSImport.Namespace)
@js.native
object resultMod extends js.Object {
  
  def makeErrorResult(operation: Operation, error: js.Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: js.Error, response: js.Any): OperationResult[_] = js.native
  
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
}
