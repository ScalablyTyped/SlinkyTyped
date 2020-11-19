package typingsSlinky.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("signalfx", "Ingest")
@js.native
class Ingest protected () extends js.Object {
  def this(token: String) = this()
  def this(token: String, options: IngestOptions) = this()
  
  def send(report: SignalReport): Unit = js.native
}
