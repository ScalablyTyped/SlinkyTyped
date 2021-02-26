package typingsSlinky.umbraco.umbraco.resources

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.logResource
  * @description Retrives log history from umbraco
  *
  *
  **/
@js.native
trait ILogResource extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getEntityLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a give entity id
    *
    * ##usage
    * <pre>
    * logResource.getEntityLog(1234)
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of entity to return log history
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getEntityLog(id: Double): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getLog(`type`: LogType, since: js.Date): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getUserLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the current users' log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getUserLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getUserLog(`type`: LogType, since: js.Date): IPromise[IResourcePromise] = js.native
}
object ILogResource {
  
  @scala.inline
  def apply(
    getEntityLog: Double => IPromise[IResourcePromise],
    getLog: (LogType, js.Date) => IPromise[IResourcePromise],
    getUserLog: (LogType, js.Date) => IPromise[IResourcePromise]
  ): ILogResource = {
    val __obj = js.Dynamic.literal(getEntityLog = js.Any.fromFunction1(getEntityLog), getLog = js.Any.fromFunction2(getLog), getUserLog = js.Any.fromFunction2(getUserLog))
    __obj.asInstanceOf[ILogResource]
  }
  
  @scala.inline
  implicit class ILogResourceMutableBuilder[Self <: ILogResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEntityLog(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "getEntityLog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLog(value: (LogType, js.Date) => IPromise[IResourcePromise]): Self = StObject.set(x, "getLog", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserLog(value: (LogType, js.Date) => IPromise[IResourcePromise]): Self = StObject.set(x, "getUserLog", js.Any.fromFunction2(value))
  }
}
