package typingsSlinky.smartFoxServer.SFS2X.Entities

import typingsSlinky.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typingsSlinky.smartFoxServer.SFS2X.Managers.RoomManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFSRoom extends js.Object {
  /** @type {string} Returns the Room Group name. */
  var groupId: String = js.native
  /** @type {number} Indicates the id of this Room. */
  var id: Double = js.native
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: Boolean = js.native
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: Boolean = js.native
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: Boolean = js.native
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: Boolean = js.native
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: Double = js.native
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: Double = js.native
  /** @type {string} Indicates the name of this Room. */
  var name: String = js.native
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object = js.native
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): Boolean = js.native
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): RoomManager = js.native
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  def getSpectatorList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  def getUserById(id: Double): SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: String): SFSUser = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): Double = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  def getUserList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  def getVariable(varName: String): SFSRoomVariable = js.native
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[SFSRoomVariable] = js.native
}

object SFSRoom {
  @scala.inline
  def apply(
    containsUser: SFSUser => Boolean,
    containsVariable: String => Boolean,
    getCapacity: () => Double,
    getPlayerList: () => js.Array[SFSUser],
    getRoomManager: () => RoomManager,
    getSpectatorCount: () => Double,
    getSpectatorList: () => js.Array[SFSUser],
    getUserById: Double => SFSUser,
    getUserByName: String => SFSUser,
    getUserCount: () => Double,
    getUserList: () => js.Array[SFSUser],
    getVariable: String => SFSRoomVariable,
    getVariables: () => js.Array[SFSRoomVariable],
    groupId: String,
    id: Double,
    isGame: Boolean,
    isHidden: Boolean,
    isJoined: Boolean,
    isPasswordProtected: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    name: String,
    properties: js.Object
  ): SFSRoom = {
    val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsVariable = js.Any.fromFunction1(containsVariable), getCapacity = js.Any.fromFunction0(getCapacity), getPlayerList = js.Any.fromFunction0(getPlayerList), getRoomManager = js.Any.fromFunction0(getRoomManager), getSpectatorCount = js.Any.fromFunction0(getSpectatorCount), getSpectatorList = js.Any.fromFunction0(getSpectatorList), getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = js.Any.fromFunction0(getUserCount), getUserList = js.Any.fromFunction0(getUserList), getVariable = js.Any.fromFunction1(getVariable), getVariables = js.Any.fromFunction0(getVariables), groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isJoined = isJoined.asInstanceOf[js.Any], isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSRoom]
  }
  @scala.inline
  implicit class SFSRoomOps[Self <: SFSRoom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsUser(value: SFSUser => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsVariable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCapacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCapacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlayerList(value: () => js.Array[SFSUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlayerList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRoomManager(value: () => RoomManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoomManager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpectatorCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpectatorCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpectatorList(value: () => js.Array[SFSUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpectatorList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserById(value: Double => SFSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUserByName(value: String => SFSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUserCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserList(value: () => js.Array[SFSUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariable(value: String => SFSRoomVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVariables(value: () => js.Array[SFSRoomVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsJoined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPasswordProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPasswordProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSpectators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpectators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxUsers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

