package typingsSlinky.umbraco.umbraco.services

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.searchService
  *
  *
  * @description
  * Service for handling the main application search, can currently search content, media and members
  *
  */
@js.native
trait ISearchService extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchAll
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches all available indexes and returns all results in one collection
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching items
    */
  def searchAll(args: ISearchArgs): IPromise[_] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchContent
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default internal content search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching content items
    */
  def searchContent(args: ISearchArgs): IPromise[js.Array[ISearchContent]] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchMedia
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default media search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching media items
    */
  def searchMedia(args: ISearchArgs): IPromise[js.Array[ISearchMedia]] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchMembers
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default member search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching members
    */
  def searchMembers(args: ISearchArgs): IPromise[js.Array[ISearchMember]] = js.native
}
object ISearchService {
  
  @scala.inline
  def apply(
    searchAll: ISearchArgs => IPromise[_],
    searchContent: ISearchArgs => IPromise[js.Array[ISearchContent]],
    searchMedia: ISearchArgs => IPromise[js.Array[ISearchMedia]],
    searchMembers: ISearchArgs => IPromise[js.Array[ISearchMember]]
  ): ISearchService = {
    val __obj = js.Dynamic.literal(searchAll = js.Any.fromFunction1(searchAll), searchContent = js.Any.fromFunction1(searchContent), searchMedia = js.Any.fromFunction1(searchMedia), searchMembers = js.Any.fromFunction1(searchMembers))
    __obj.asInstanceOf[ISearchService]
  }
  
  @scala.inline
  implicit class ISearchServiceMutableBuilder[Self <: ISearchService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchAll(value: ISearchArgs => IPromise[_]): Self = StObject.set(x, "searchAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchContent(value: ISearchArgs => IPromise[js.Array[ISearchContent]]): Self = StObject.set(x, "searchContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchMedia(value: ISearchArgs => IPromise[js.Array[ISearchMedia]]): Self = StObject.set(x, "searchMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchMembers(value: ISearchArgs => IPromise[js.Array[ISearchMember]]): Self = StObject.set(x, "searchMembers", js.Any.fromFunction1(value))
  }
}
