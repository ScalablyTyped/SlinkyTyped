package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Requests.MessageRecipientMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.AdminMessageRequest")
@js.native
class AdminMessageRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.AdminMessageRequest {
  /**
    * Creates a new AdminMessageRequest instance.
    * @param {string}               message       The message of the administrator to be sent to the target user/s defined by the recipientMode parameter.
    * @param {MessageRecipientMode} recipientMode An instance of MessageRecipientMode containing the target to which the message should be delivered.
    * @param {Object}               [params=null]        An object containing custom parameters to be sent to the recipient user/s.
    */
  def this(message: String, recipientMode: MessageRecipientMode) = this()
  def this(message: String, recipientMode: MessageRecipientMode, params: js.Object) = this()
}
