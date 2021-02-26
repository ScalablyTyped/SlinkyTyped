package typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `detectFaces` operation. */
@js.native
trait DetectFacesParams extends StObject {
  
  /** The desired language of parts of the response. See the response for details. */
  var accept_language: js.UndefOr[AcceptLanguage | String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** An image file (gif, .jpg, .png, .tif.) or .zip file with images. Limit the .zip file to 100 MB. You can include a maximum of 15 images in a request. Encode the image and .zip file names in UTF-8 if they contain non-ASCII characters. The service assumes UTF-8 encoding if it encounters non-ASCII characters. You can also include an image with the **url** parameter. */
  var images_file: js.UndefOr[ReadableStream | FileObject | Buffer] = js.native
  
  /** The content type of images_file. */
  var images_file_content_type: js.UndefOr[String] = js.native
  
  /** The filename for images_file. */
  var images_filename: js.UndefOr[String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** The URL of an image to analyze. Must be in .gif, .jpg, .png, or .tif format. The minimum recommended pixel density is 32X32 pixels, but the service tends to perform better with images that are at least 224 x 224 pixels. The maximum image size is 10 MB. Redirects are followed, so you can use a shortened URL. You can also include images with the **images_file** parameter. */
  var url: js.UndefOr[String] = js.native
}
object DetectFacesParams {
  
  @scala.inline
  def apply(): DetectFacesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectFacesParams]
  }
  
  @scala.inline
  implicit class DetectFacesParamsMutableBuilder[Self <: DetectFacesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_language(value: AcceptLanguage | String): Self = StObject.set(x, "accept_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_languageUndefined: Self = StObject.set(x, "accept_language", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setImages_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "images_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_fileUndefined: Self = StObject.set(x, "images_file", js.undefined)
    
    @scala.inline
    def setImages_file_content_type(value: String): Self = StObject.set(x, "images_file_content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_file_content_typeUndefined: Self = StObject.set(x, "images_file_content_type", js.undefined)
    
    @scala.inline
    def setImages_filename(value: String): Self = StObject.set(x, "images_filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages_filenameUndefined: Self = StObject.set(x, "images_filename", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
