package typingsSlinky.tsNode.mod

import typingsSlinky.makeError.mod.BaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-node", "TSError")
@js.native
class TSError protected () extends BaseError {
  def this(diagnosticText: String, diagnosticCodes: js.Array[Double]) = this()
  
  var diagnosticCodes: js.Array[Double] = js.native
  
  var diagnosticText: String = js.native
}
