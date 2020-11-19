package typingsSlinky.umbraco.umbraco.resources

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.authResource
  * @description
  * This Resource perfomrs actions to common authentication tasks for the Umbraco backoffice user
  *
  * @requires $q
  * @requires $http
  * @requires umbRequestHelper
  * @requires angularHelper
  */
@js.native
trait IAuthResource extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#getCurrentUser
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Sends a request to the server to get the current user details, will return a 401 if the user is not logged in
    *
    * ##usage
    * <pre>
    * authResource.getCurrentUser()
    *    .then(function(data) {
    *        //Do stuff for fetching the current logged in Umbraco backoffice user
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def getCurrentUser(): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#getRemainingTimeoutSeconds
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Gets the user's remaining seconds before their login times out
    *
    * ##usage
    * <pre>
    * authResource.getRemainingTimeoutSeconds()
    *    .then(function(data) {
    *        //Number of seconds is returned
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def getRemainingTimeoutSeconds(): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#isAuthenticated
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Checks if the user is logged in or not - does not return 401 or 403
    *
    * ##usage
    * <pre>
    * authResource.isAuthenticated()
    *    .then(function(data) {
    *        //Do stuff to check if user is authenticated
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def isAuthenticated(): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#performLogin
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Logs the Umbraco backoffice user in if the credentials are good
    *
    * ##usage
    * <pre>
    * authResource.performLogin(login, password)
    *    .then(function(data) {
    *        //Do stuff for login...
    *    });
    * </pre>
    * @param {string} login Username of backoffice user
    * @param {string} password Password of backoffice user
    * @returns {Promise} resourcePromise object
    *
    */
  def performLogin(username: String, password: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.authResource#performLogout
    * @methodOf umbraco.resources.authResource
    *
    * @description
    * Logs out the Umbraco backoffice user
    *
    * ##usage
    * <pre>
    * authResource.performLogout()
    *    .then(function(data) {
    *        //Do stuff for logging out...
    *    });
    * </pre>
    * @returns {Promise} resourcePromise object
    *
    */
  def performLogout(): IPromise[IResourcePromise] = js.native
}
object IAuthResource {
  
  @scala.inline
  def apply(
    getCurrentUser: () => IPromise[IResourcePromise],
    getRemainingTimeoutSeconds: () => IPromise[IResourcePromise],
    isAuthenticated: () => IPromise[IResourcePromise],
    performLogin: (String, String) => IPromise[IResourcePromise],
    performLogout: () => IPromise[IResourcePromise]
  ): IAuthResource = {
    val __obj = js.Dynamic.literal(getCurrentUser = js.Any.fromFunction0(getCurrentUser), getRemainingTimeoutSeconds = js.Any.fromFunction0(getRemainingTimeoutSeconds), isAuthenticated = js.Any.fromFunction0(isAuthenticated), performLogin = js.Any.fromFunction2(performLogin), performLogout = js.Any.fromFunction0(performLogout))
    __obj.asInstanceOf[IAuthResource]
  }
  
  @scala.inline
  implicit class IAuthResourceOps[Self <: IAuthResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCurrentUser(value: () => IPromise[IResourcePromise]): Self = this.set("getCurrentUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemainingTimeoutSeconds(value: () => IPromise[IResourcePromise]): Self = this.set("getRemainingTimeoutSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAuthenticated(value: () => IPromise[IResourcePromise]): Self = this.set("isAuthenticated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPerformLogin(value: (String, String) => IPromise[IResourcePromise]): Self = this.set("performLogin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPerformLogout(value: () => IPromise[IResourcePromise]): Self = this.set("performLogout", js.Any.fromFunction0(value))
  }
}
