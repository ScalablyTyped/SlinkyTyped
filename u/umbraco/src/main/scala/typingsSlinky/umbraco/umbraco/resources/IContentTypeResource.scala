package typingsSlinky.umbraco.umbraco.resources

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.contentTypeResource
  * @description Loads in data for content types
  **/
@js.native
trait IContentTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllPropertyTypeAliases
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of defined property type aliases
    *
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllPropertyTypeAliases(): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllowedTypes
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of allowed content types underneath a content item with a given ID
    *
    * ##usage
    * <pre>
    * contentTypeResource.getAllowedTypes(1234)
    *    .then(function(array) {
    *        $scope.type = type;
    *    });
    * </pre>
    * @param {Int} contentId id of the content item to retrive allowed child types for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllowedTypes(contentId: Double): IPromise[IResourcePromise] = js.native
}

object IContentTypeResource {
  @scala.inline
  def apply(
    getAllPropertyTypeAliases: () => IPromise[IResourcePromise],
    getAllowedTypes: Double => IPromise[IResourcePromise]
  ): IContentTypeResource = {
    val __obj = js.Dynamic.literal(getAllPropertyTypeAliases = js.Any.fromFunction0(getAllPropertyTypeAliases), getAllowedTypes = js.Any.fromFunction1(getAllowedTypes))
    __obj.asInstanceOf[IContentTypeResource]
  }
  @scala.inline
  implicit class IContentTypeResourceOps[Self <: IContentTypeResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllPropertyTypeAliases(value: () => IPromise[IResourcePromise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllPropertyTypeAliases")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllowedTypes(value: Double => IPromise[IResourcePromise]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowedTypes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

