package typingsSlinky.smartFoxServer.global.SFS2X.Requests.System

import typingsSlinky.smartFoxServer.SFS2X.Entities.Match.MatchExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.System.FindRoomsRequest")
@js.native
class FindRoomsRequest protected ()
  extends typingsSlinky.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest {
  /**
    * Creates a new FindRoomsRequest instance.
    * @param {Entities.Match.MatchExpression} expr    A matching expression that the system will use to retrieve the Rooms.
    * @param {string}                         {groupId=null} The name of the Group where to search for matching Rooms; if null, the search is performed in the whole Zone.
    * @param {number}                         [limit=0]   The maximum size of the list of Rooms that will be returned by the roomFindResult event. If 0, all the found Rooms are returned.
    */
  def this(expr: MatchExpression) = this()
  def this(expr: MatchExpression, groupId: String) = this()
  def this(expr: MatchExpression, groupId: js.UndefOr[scala.Nothing], limit: Double) = this()
  def this(expr: MatchExpression, groupId: String, limit: Double) = this()
}
