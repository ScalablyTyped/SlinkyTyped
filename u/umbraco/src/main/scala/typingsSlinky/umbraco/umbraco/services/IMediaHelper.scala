package typingsSlinky.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.mediaHelper
  * @description A helper object used for dealing with media items
  */
@js.native
trait IMediaHelper extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#detectIfImageByExtension
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns true/false, indicating if the given path has an allowed image extension
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def detectIfImageByExtension(imagePath: String): Boolean = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#formatFileTypes
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns a string with correctly formated file types for ng-file-upload
    *
    * @param {string} file types, ex: jpg,png,tiff
    */
  def formatFileTypes(file: String): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getImagePropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the actual image path associated with the image property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getImagePropertyValue(options: IMediaOptions): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getMediaPropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the file path associated with the media property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.mediaModel The media object to retrieve the image path from
    * @param {object} options.imageOnly Optional, if true then will only return a path if the media item is an image
    */
  def getMediaPropertyValue(options: IMediaOptions): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnail
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * formats the display model used to display the content to the model used to save the content
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getThumbnail(options: IMediaOptions): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnailFromPath
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the path to the thumbnail version of a given media library image path
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def getThumbnailFromPath(imagePath: String): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFile
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media object returned with the mediaResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFile(mediaItem: IMediaEntity, thumbnail: Boolean): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFileFromEntity
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media entity returned with the entityResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFileFromEntity(mediaEntity: IMediaEntity, thumbnail: Boolean): String = js.native
  
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#scaleToMaxSize
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Finds the corrct max width and max height, given maximum dimensions and keeping aspect ratios
    *
    * @param {number} maxSize Maximum width & height
    * @param {number} width Current width
    * @param {number} height Current height
    */
  def scaleToMaxSize(maxSize: Double, width: Double, height: Double): js.Any = js.native
}
object IMediaHelper {
  
  @scala.inline
  def apply(
    detectIfImageByExtension: String => Boolean,
    formatFileTypes: String => String,
    getImagePropertyValue: IMediaOptions => String,
    getMediaPropertyValue: IMediaOptions => String,
    getThumbnail: IMediaOptions => String,
    getThumbnailFromPath: String => String,
    resolveFile: (IMediaEntity, Boolean) => String,
    resolveFileFromEntity: (IMediaEntity, Boolean) => String,
    scaleToMaxSize: (Double, Double, Double) => js.Any
  ): IMediaHelper = {
    val __obj = js.Dynamic.literal(detectIfImageByExtension = js.Any.fromFunction1(detectIfImageByExtension), formatFileTypes = js.Any.fromFunction1(formatFileTypes), getImagePropertyValue = js.Any.fromFunction1(getImagePropertyValue), getMediaPropertyValue = js.Any.fromFunction1(getMediaPropertyValue), getThumbnail = js.Any.fromFunction1(getThumbnail), getThumbnailFromPath = js.Any.fromFunction1(getThumbnailFromPath), resolveFile = js.Any.fromFunction2(resolveFile), resolveFileFromEntity = js.Any.fromFunction2(resolveFileFromEntity), scaleToMaxSize = js.Any.fromFunction3(scaleToMaxSize))
    __obj.asInstanceOf[IMediaHelper]
  }
  
  @scala.inline
  implicit class IMediaHelperMutableBuilder[Self <: IMediaHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectIfImageByExtension(value: String => Boolean): Self = StObject.set(x, "detectIfImageByExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatFileTypes(value: String => String): Self = StObject.set(x, "formatFileTypes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetImagePropertyValue(value: IMediaOptions => String): Self = StObject.set(x, "getImagePropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMediaPropertyValue(value: IMediaOptions => String): Self = StObject.set(x, "getMediaPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetThumbnail(value: IMediaOptions => String): Self = StObject.set(x, "getThumbnail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetThumbnailFromPath(value: String => String): Self = StObject.set(x, "getThumbnailFromPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveFile(value: (IMediaEntity, Boolean) => String): Self = StObject.set(x, "resolveFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveFileFromEntity(value: (IMediaEntity, Boolean) => String): Self = StObject.set(x, "resolveFileFromEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScaleToMaxSize(value: (Double, Double, Double) => js.Any): Self = StObject.set(x, "scaleToMaxSize", js.Any.fromFunction3(value))
  }
}
