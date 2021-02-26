package typingsSlinky.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwtAuthorizer extends StObject {
  
  var audience: js.Array[String] = js.native
  
  var identitySource: String = js.native
  
  var issuerUrl: String = js.native
}
object JwtAuthorizer {
  
  @scala.inline
  def apply(audience: js.Array[String], identitySource: String, issuerUrl: String): JwtAuthorizer = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], identitySource = identitySource.asInstanceOf[js.Any], issuerUrl = issuerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthorizer]
  }
  
  @scala.inline
  implicit class JwtAuthorizerMutableBuilder[Self <: JwtAuthorizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
    
    @scala.inline
    def setIdentitySource(value: String): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUrl(value: String): Self = StObject.set(x, "issuerUrl", value.asInstanceOf[js.Any])
  }
}
