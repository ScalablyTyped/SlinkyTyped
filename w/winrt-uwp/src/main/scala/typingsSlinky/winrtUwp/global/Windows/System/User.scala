package typingsSlinky.winrtUwp.global.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user. */
@JSGlobal("Windows.System.User")
@js.native
abstract class User ()
  extends typingsSlinky.winrtUwp.Windows.System.User

/* static members */
@JSGlobal("Windows.System.User")
@js.native
object User extends js.Object {
  /**
    * Creates a UserWatcher which enumerates users and raises events when the collection of users changes or when a user’s authentication state changes.
    * @return A UserWatcher which enumerates users and raises events when the collection of users changes.
    */
  def createWatcher(): typingsSlinky.winrtUwp.Windows.System.UserWatcher = js.native
  /**
    * Finds all users asynchronously.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type asynchronously.
    * @param type The type of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(`type`: typingsSlinky.winrtUwp.Windows.System.UserType): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Finds all users of a given type and authentication status asynchronously.
    * @param type The type of users to find.
    * @param status The authentication status of users to find.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of Users .
    */
  def findAllAsync(
    `type`: typingsSlinky.winrtUwp.Windows.System.UserType,
    status: typingsSlinky.winrtUwp.Windows.System.UserAuthenticationStatus
  ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a user with a given Id.
    * @param nonRoamableId The Id of the user to get.
    * @return The user with the given Id.
    */
  def getFromId(nonRoamableId: String): typingsSlinky.winrtUwp.Windows.System.User = js.native
}

