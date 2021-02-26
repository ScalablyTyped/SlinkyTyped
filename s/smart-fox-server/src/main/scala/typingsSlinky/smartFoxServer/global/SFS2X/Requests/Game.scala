package typingsSlinky.smartFoxServer.global.SFS2X.Requests

import typingsSlinky.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import typingsSlinky.smartFoxServer.SFS2X.IINVITATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Game
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.Game.html
object Game {
  
  @JSGlobal("SFS2X.Requests.Game.CreateSFSGameRequest")
  @js.native
  class CreateSFSGameRequest protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest {
    /**
      * Creates a new CreateSFSGameRequest instance.
      * @param {SFSGameSettings} settings An object containing the Game Room configuration settings.
      */
    def this(settings: typingsSlinky.smartFoxServer.SFS2X.Requests.Game.SFSGameSettings) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.InvitationReplyRequest")
  @js.native
  class InvitationReplyRequest protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.Game.InvitationReplyRequest {
    /**
      * Creates a new InvitationReplyRequest instance.
      * @param {IINVITATION} invitation      An instance of the Invitation class containing the invitation details (inviter, custom parameters, etc).
      * @param {number}      invitationReply The answer to be sent to the inviter, among those available as constants in the InvitationReply class.
      * @param {Object}      [params=null]          An object containing custom parameters to be returned to the inviter together with the reply (for example a message describing the reason of refusal).
      */
    def this(invitation: IINVITATION, invitationReply: Double) = this()
    def this(invitation: IINVITATION, invitationReply: Double, params: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.InviteUsersRequest")
  @js.native
  class InviteUsersRequest protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.Game.InviteUsersRequest {
    /**
      * Creates a new InviteUsersRequest instance.
      * @param {Entities.SFSUser[]} invitedUsers     A list of SFSUser objects, each representing a user to send the invitation to.
      * @param {number}             secondsForAnswer The number of seconds available to each invited user to reply to the invitation (recommended range: 15 to 40 seconds).
      * @param {Object}             [params=null]           An object containing custom parameters containing additional invitation details.
      */
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double) = this()
    def this(invitedUsers: js.Array[SFSUser], secondsForAnswer: Double, params: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.QuickJoinGameRequest")
  @js.native
  class QuickJoinGameRequest protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.Game.QuickJoinGameRequest {
    /**
      * Creates a new QuickJoinGameRequest instance.
      * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
      * @param {Entities.SFSRoom}   [roomToLeave=null]   A SFSRoom object representing the Room that the user should leave when joining the game.
      */
    def this(whereToSearch: js.Array[SFSRoom]) = this()
    /**
      * Creates a new QuickJoinGameRequest instance.
      * @param {Entities.Match.MatchExpression} matchExpression A matching expression that the system will use to search a Game Room where to join the current user.
      * @param {Entities.SFSRoom[]} whereToSearch An array of SFSRoom objects or an array of Group names to which the matching expression should be applied. The maximum number of elements that this array can contain is 32.
      * @param {Entities.SFSRoom}               [roomToLeave=null]     A SFSRoom object representing the Room that the user should leave when joining the game.
      */
    def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom]) = this()
    def this(whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
    def this(matchExpression: MatchExpression, whereToSearch: js.Array[SFSRoom], roomToLeave: SFSRoom) = this()
  }
  
  @JSGlobal("SFS2X.Requests.Game.SFSGameSettings")
  @js.native
  class SFSGameSettings protected ()
    extends typingsSlinky.smartFoxServer.SFS2X.Requests.Game.SFSGameSettings {
    /**
      * Creates a new SFSGameSettings instance.
      * @param {string} name The name of the Game Room to be created.
      */
    def this(name: String) = this()
  }
}
