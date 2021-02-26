package typingsSlinky.watsonDeveloperCloud.sdkMod

import typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.Options
import typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IBM Watson&trade; Visual Recognition service uses deep learning algorithms to identify scenes, objects, and faces  in images you upload to the service. You can create and train a custom classifier to identify subjects that suit your needs.
  */
@JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3")
@js.native
class VisualRecognitionV3 protected () extends ^ {
  /**
    * Construct a VisualRecognitionV3 object.
    *
    * @param {Object} options - Options for the service.
    * @param {string} options.version - The API version date to use with the service, in "YYYY-MM-DD" format. Whenever the API is changed in a backwards incompatible way, a new minor version of the API is released. The service uses the API version for the date you specify, or the most recent version before that date. Note that you should not programmatically specify the current date at runtime, in case the API has been updated since your application's release. Instead, specify a version date that is compatible with your application, and don't change it until your application is ready for a later version.
    * @param {string} [options.url] - The base url to use when contacting the service (e.g. 'https://gateway.watsonplatform.net/visual-recognition/api'). The base url may differ between Bluemix regions.
    * @param {string} [options.iam_access_token] - An IAM access token fully managed by the application. Responsibility falls on the application to refresh the token, either before it expires or reactively upon receiving a 401 from the service, as any requests made with an expired token will fail.
    * @param {string} [options.iam_apikey] - An API key that can be used to request IAM tokens. If this API key is provided, the SDK will manage the token and handle the refreshing.
    * @param {string} [options.iam_url] - An optional URL for the IAM service API. Defaults to 'https://iam.bluemix.net/identity/token'.
    * @param {boolean} [options.use_unauthenticated] - Set to `true` to avoid including an authorization header. This option may be useful for requests that are proxied.
    * @param {Object} [options.headers] - Default headers that shall be included with every request to the service.
    * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out] - Set to `true` to opt-out of data collection. By default, all IBM Watson services log requests and their results. Logging is done only to improve the services for future users. The logged data is not shared or made public. If you are concerned with protecting the privacy of users' personal information or otherwise do not want your requests to be logged, you can opt out of logging.
    * @constructor
    * @returns {VisualRecognitionV3}
    * @throws {Error}
    */
  def this(options: Options) = this()
}
object VisualRecognitionV3 {
  
  @JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Constants for the `classify` operation. */
  object ClassifyConstants {
    
    /** The desired language of parts of the response. See the response for details. */
    @JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3.ClassifyConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage with String
          ] = js.native
      
      /* "ar" */ val AR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.AR with String = js.native
      
      /* "de" */ val DE: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.DE with String = js.native
      
      /* "en" */ val EN: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.EN with String = js.native
      
      /* "es" */ val ES: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ES with String = js.native
      
      /* "fr" */ val FR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.FR with String = js.native
      
      /* "it" */ val IT: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.IT with String = js.native
      
      /* "ja" */ val JA: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.JA with String = js.native
      
      /* "ko" */ val KO: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.KO with String = js.native
      
      /* "pt-br" */ val PT_BR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.PT_BR with String = js.native
      
      /* "zh-cn" */ val ZH_CN: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ZH_CN with String = js.native
      
      /* "zh-tw" */ val ZH_TW: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.ClassifyConstants.AcceptLanguage.ZH_TW with String = js.native
    }
  }
  
  /** Constants for the `detectFaces` operation. */
  object DetectFacesConstants {
    
    /** The desired language of parts of the response. See the response for details. */
    @JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3.DetectFacesConstants.AcceptLanguage")
    @js.native
    object AcceptLanguage extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage with String
          ] = js.native
      
      /* "ar" */ val AR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.AR with String = js.native
      
      /* "de" */ val DE: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.DE with String = js.native
      
      /* "en" */ val EN: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.EN with String = js.native
      
      /* "es" */ val ES: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ES with String = js.native
      
      /* "fr" */ val FR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.FR with String = js.native
      
      /* "it" */ val IT: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.IT with String = js.native
      
      /* "ja" */ val JA: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.JA with String = js.native
      
      /* "ko" */ val KO: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.KO with String = js.native
      
      /* "pt-br" */ val PT_BR: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.PT_BR with String = js.native
      
      /* "zh-cn" */ val ZH_CN: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_CN with String = js.native
      
      /* "zh-tw" */ val ZH_TW: typingsSlinky.watsonDeveloperCloud.visualRecognitionV3GeneratedMod.DetectFacesConstants.AcceptLanguage.ZH_TW with String = js.native
    }
  }
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "VisualRecognitionV3.URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
