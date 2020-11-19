package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateDisputeEvidenceTextResponse")
@js.native
class CreateDisputeEvidenceTextResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The newly uploaded dispute evidence metadata.
    */
  var evidence: js.UndefOr[DisputeEvidence] = js.native
}
