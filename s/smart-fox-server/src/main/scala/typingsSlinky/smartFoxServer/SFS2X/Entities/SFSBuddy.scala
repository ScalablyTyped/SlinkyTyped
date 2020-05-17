package typingsSlinky.smartFoxServer.SFS2X.Entities

import typingsSlinky.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFSBuddy extends js.Object {
  /** @type {number} Indicates the id of this buddy. */
  var id: Double = js.native
  /** @type {string} Indicates the name of this buddy. */
  var name: String = js.native
  /**
    * Indicates whether this user has the specified Buddy Variable set or not.
    * @param  {string}  varName The name of the Buddy Variable whose existance must be checked.
    * @return {boolean}         Returns: true if a Buddy Variable with the passed name is set for this buddy.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Returns the nickname of this buddy. If the nickname is not set, null is returned.
    * @return {string} Returns: The nickname of the buddy.
    */
  def getNickName(): String = js.native
  /**
    * Retrieves the list of persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOfflineVariables(): js.Array[SFSBuddyVariable] = js.native
  /**
    * Retrieves the list of non-persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOnlineVariables(): js.Array[SFSBuddyVariable] = js.native
  /**
    * Returns the custom state of this buddy. Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state is not set, null is returned.
    * @return {string} Returns: The custom state of the buddy.
    */
  def getState(): String = js.native
  /**
    * Retrieves a Buddy Variable from its name.
    * @param  {string}                     varName The name of the Buddy Variable to be retrieved.
    * @return {Variables.SFSBuddyVariable}         Returns: The object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to this buddy.
    */
  def getVariable(varName: String): SFSBuddyVariable = js.native
  /**
    * Retrieves all the Buddy Variables of this user.
    * @return {Variables.SFSBuddyVariable[]} Returns: The list of SFSBuddyVariable objects associated to the buddy.
    */
  def getVariables(): js.Array[SFSBuddyVariable] = js.native
  /**
    * Indicates whether this buddy is blocked in the current user's buddy list or not. A buddy can be blocked by means of a BlockBuddyRequest request.
    * @return {boolean} Returns: true if the buddy is blocked.
    */
  def isBlocked(): Boolean = js.native
  /**
    * Indicates whether this buddy is online in the Buddy List system or not.
    * @return {boolean} Returns: true if the buddy is online.
    */
  def isOnline(): Boolean = js.native
  /**
    * Indicates whether this buddy is temporary (non-persistent) in the current user's buddy list or not.
    * @return {boolean} Returns: true if the buddy is temporary.
    */
  def isTemp(): Boolean = js.native
}

object SFSBuddy {
  @scala.inline
  def apply(
    containsVariable: String => Boolean,
    getNickName: () => String,
    getOfflineVariables: () => js.Array[SFSBuddyVariable],
    getOnlineVariables: () => js.Array[SFSBuddyVariable],
    getState: () => String,
    getVariable: String => SFSBuddyVariable,
    getVariables: () => js.Array[SFSBuddyVariable],
    id: Double,
    isBlocked: () => Boolean,
    isOnline: () => Boolean,
    isTemp: () => Boolean,
    name: String
  ): SFSBuddy = {
    val __obj = js.Dynamic.literal(containsVariable = js.Any.fromFunction1(containsVariable), getNickName = js.Any.fromFunction0(getNickName), getOfflineVariables = js.Any.fromFunction0(getOfflineVariables), getOnlineVariables = js.Any.fromFunction0(getOnlineVariables), getState = js.Any.fromFunction0(getState), getVariable = js.Any.fromFunction1(getVariable), getVariables = js.Any.fromFunction0(getVariables), id = id.asInstanceOf[js.Any], isBlocked = js.Any.fromFunction0(isBlocked), isOnline = js.Any.fromFunction0(isOnline), isTemp = js.Any.fromFunction0(isTemp), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSBuddy]
  }
  @scala.inline
  implicit class SFSBuddyOps[Self <: SFSBuddy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsVariable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNickName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNickName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOfflineVariables(value: () => js.Array[SFSBuddyVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOfflineVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOnlineVariables(value: () => js.Array[SFSBuddyVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnlineVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVariable(value: String => SFSBuddyVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVariables(value: () => js.Array[SFSBuddyVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOnline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTemp(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

