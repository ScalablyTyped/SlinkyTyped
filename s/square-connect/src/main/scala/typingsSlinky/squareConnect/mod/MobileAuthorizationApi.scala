package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "MobileAuthorizationApi")
@js.native
/**
  * Constructs a new MobileAuthorizationApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class MobileAuthorizationApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Generates code to authorize a mobile application to connect to a Square card reader Authorization codes are
    * one-time-use and expire __60 minutes__ after being issued.
    * @note The `Authorization` header you provide to this endpoint must have the following format:
    * `Authorization: Bearer ACCESS_TOKEN` Replace `ACCESS_TOKEN` with a [valid production authorization credential]
    * @link https://docs.connect.squareup.com/get-started#step-4-understand-the-different-application-credentials
    */
  def createMobileAuthorizationCode(body: CreateMobileAuthorizationCodeRequest): js.Promise[CreateMobileAuthorizationCodeResponse] = js.native
}
