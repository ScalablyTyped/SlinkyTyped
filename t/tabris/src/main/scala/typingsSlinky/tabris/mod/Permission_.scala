package typingsSlinky.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Permission")
@js.native
class Permission_ protected () extends NativeObject {
  /**
    * Checks the authorization status for a given set of permissions.
    * Since an app permission can change during the apps lifecycle or when it is changed in the app
    * settings, it is recommended to check the permissions status before making API calls that require a
    * granted permission.
    * @param permissions A list of permissions to get the authorization status for.
    */
  def getAuthorizationStatus(permissions: String*): String = js.native
  /**
    * Checks if any of the given permissions allow to request authorization. A permission is regarded as
    * allowed to authorize when its status is either `'undetermined'` or `'declined'`.
    * @param permissions A list of permissions to check if authorization is possible.
    */
  def isAuthorizationPossible(permissions: String*): Boolean = js.native
  /**
    * Checks whether the given set of permissions is authorized. A set of permissions is regarded as
    * authorized when the status of all permissions is `'granted'`.
    * @param permissions A list of permissions to check its authorization status.
    */
  def isAuthorized(permissions: String*): Boolean = js.native
  /**
    * Request authorization for a set of permissions.
    * If any of the permissions allow to request authorization, the method call will prompt the user to
    * grant the permission and returns the result in the resolved promise. If the status can not be
    * changed, the current status is returned by the resolved promise.
    * @param permissions A list of permissions to request authorization for.
    */
  def requestAuthorization(permissions: String*): js.Promise[String] = js.native
  /**
    * Tries to authorize access to the given permissions, either by already holding the permissions or by
    * requesting authorization for the given permissions. When the result is `'granted' the `onAuthorized`
    * callback will be invoked. If any other state is determined the `onUnauthorized` callback will be
    * invoked. In case of an `Error` the `onError` callback will be invoked.
    * @param permissions An individual permission or a list of permissions to gain authorization for.
    * @param onAuthorized A callback to be invoked if the desired permissions could be granted. The permissions will have the status `'granted`'.
    * @param onUnauthorized A callback to be invoked when the desired permissions could not be granted.
    * @param onError A callback to be invoked if the request failed.
    */
  def withAuthorization(permissions: String, onAuthorized: js.Function, onUnauthorized: js.Function, onError: js.Function): Unit = js.native
  def withAuthorization(
    permissions: js.Array[String],
    onAuthorized: js.Function,
    onUnauthorized: js.Function,
    onError: js.Function
  ): Unit = js.native
}

