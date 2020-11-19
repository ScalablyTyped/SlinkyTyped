package typingsSlinky.umbraco.umbraco.resources

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.dashboardResource
  * @description Handles loading the dashboard manifest
  **/
@js.native
trait IDashboardResource extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.dashboardResource#getDashboard
    * @methodOf umbraco.resources.dashboardResource
    *
    * @description
    * Retrieves the dashboard configuration for a given section
    *
    * @param {string} section Alias of section to retrieve dashboard configuraton for
    * @returns {Promise} resourcePromise object containing the user array.
    *
    */
  def getDashboard(section: String): IPromise[IResourcePromise] = js.native
}
object IDashboardResource {
  
  @scala.inline
  def apply(getDashboard: String => IPromise[IResourcePromise]): IDashboardResource = {
    val __obj = js.Dynamic.literal(getDashboard = js.Any.fromFunction1(getDashboard))
    __obj.asInstanceOf[IDashboardResource]
  }
  
  @scala.inline
  implicit class IDashboardResourceOps[Self <: IDashboardResource] (val x: Self) extends AnyVal {
    
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
    def setGetDashboard(value: String => IPromise[IResourcePromise]): Self = this.set("getDashboard", js.Any.fromFunction1(value))
  }
}
