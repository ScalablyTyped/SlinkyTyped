package typingsSlinky.smartFoxServer.SFS2X.Managers

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserManager extends js.Object {
  /**
    * Indicates whether a user exists in the local users list or not.
    * @param  {Entities.SFSUser} user The SFSUser object representing the user whose presence in the users list is to be tested.
    * @return {boolean}               Returns: true if the passed user exists in the users list.
    */
  def containsUser(user: SFSUser): Boolean = js.native
  /**
    * Indicates whether a user exists in the local users list or not from the id.
    * @param  {number}  userId The id of the user whose presence in the users list is to be tested.
    * @return {boolean}        Returns: true if the passed user exists in the users list.
    */
  def containsUserId(userId: Double): Boolean = js.native
  /**
    * Indicates whether a user exists in the local users list or not from the name.
    * @param  {string}  userName The name of the user whose presence in the users list is to be tested.
    * @return {boolean}          Returns: true if the passed user exists in the users list.
    */
  def containsUserName(userName: String): Boolean = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}           userId The id of the user to be found.
    * @return {Entities.SFSUser}        Returns: The SFSUser object representing the user, or null if no user with the passed id exists in the local users list.
    */
  def getUserById(userId: Double): SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}           userName The name of the user to be found.
    * @return {Entities.SFSUser}          Returns: The SFSUser object representing the user, or null if no user with the passed name exists in the local users list.
    */
  def getUserByName(userName: String): SFSUser = js.native
  /**
    * Returns the total number of users in the local users list.
    * @return {number} Returns: The number of users in the local users list.
    */
  def getUserCount(): Double = js.native
  /**
    * Get the whole list of users inside the Rooms joined by the client.
    * @return {Entities.SFSUser[]} Returns: The list of SFSUser objects representing the users in the local users list.
    */
  def getUserList(): js.Array[SFSUser] = js.native
}

object UserManager {
  @scala.inline
  def apply(
    containsUser: SFSUser => Boolean,
    containsUserId: Double => Boolean,
    containsUserName: String => Boolean,
    getUserById: Double => SFSUser,
    getUserByName: String => SFSUser,
    getUserCount: () => Double,
    getUserList: () => js.Array[SFSUser]
  ): UserManager = {
    val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsUserId = js.Any.fromFunction1(containsUserId), containsUserName = js.Any.fromFunction1(containsUserName), getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = js.Any.fromFunction0(getUserCount), getUserList = js.Any.fromFunction0(getUserList))
    __obj.asInstanceOf[UserManager]
  }
  @scala.inline
  implicit class UserManagerOps[Self <: UserManager] (val x: Self) extends AnyVal {
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
    def withContainsUserId(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsUserId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainsUserName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsUserName")(js.Any.fromFunction1(value))
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
  }
  
}

