package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.PublicMessageRequest")
@js.native
class PublicMessageRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.PublicMessageRequest {
  /**
    * Creates a new PublicMessageRequest instance.
    * @param {string}           message    The message to be sent to all the users in the target Room.
    * @param {Object}           [params=null]     An object containing additional custom parameters to be sent to the message recipients (for example the color of the text, etc).
    * @param {Entities.SFSRoom} [targetRoom=null] The SFSRoom object corresponding to the Room where the message should be dispatched; if null, the last Room joined by the user is used.
    */
  def this(message: String) = this()
  def this(message: String, params: js.Object) = this()
  def this(message: String, params: js.UndefOr[scala.Nothing], targetRoom: SFSRoom) = this()
  def this(message: String, params: js.Object, targetRoom: SFSRoom) = this()
}
