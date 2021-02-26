package typingsSlinky.whoisParsed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whois-parsed", "lookup")
  @js.native
  def lookup(domainName: String): js.Promise[WhoIsResult] = js.native
  @JSImport("whois-parsed", "lookup")
  @js.native
  def lookup(domainName: String, whoIsOptions: WhoIsOptions): js.Promise[WhoIsResult] = js.native
  
  @js.native
  trait BasicAuthCredentials extends StObject {
    
    var password: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object BasicAuthCredentials {
    
    @scala.inline
    def apply(): BasicAuthCredentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicAuthCredentials]
    }
    
    @scala.inline
    implicit class BasicAuthCredentialsMutableBuilder[Self <: BasicAuthCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait HttpProxy extends StObject {
    
    var authentication: js.UndefOr[BasicAuthCredentials] = js.native
    
    var ipaddress: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[Double] = js.native
  }
  object HttpProxy {
    
    @scala.inline
    def apply(): HttpProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProxy]
    }
    
    @scala.inline
    implicit class HttpProxyMutableBuilder[Self <: HttpProxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthentication(value: BasicAuthCredentials): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpaddressUndefined: Self = StObject.set(x, "ipaddress", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait WhoIsOptions extends StObject {
    
    var proxy: js.UndefOr[HttpProxy] = js.native
  }
  object WhoIsOptions {
    
    @scala.inline
    def apply(): WhoIsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhoIsOptions]
    }
    
    @scala.inline
    implicit class WhoIsOptionsMutableBuilder[Self <: WhoIsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: HttpProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait WhoIsResult extends StObject {
    
    var creationDate: js.UndefOr[String] = js.native
    
    var domainName: String = js.native
    
    var expirationDate: js.UndefOr[String] = js.native
    
    var isAvailable: Boolean = js.native
    
    var registrar: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[js.Array[String]] = js.native
    
    var updatedDate: js.UndefOr[String] = js.native
  }
  object WhoIsResult {
    
    @scala.inline
    def apply(domainName: String, isAvailable: Boolean): WhoIsResult = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[WhoIsResult]
    }
    
    @scala.inline
    implicit class WhoIsResultMutableBuilder[Self <: WhoIsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrar(value: String): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
      
      @scala.inline
      def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
      
      @scala.inline
      def setUpdatedDate(value: String): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedDateUndefined: Self = StObject.set(x, "updatedDate", js.undefined)
    }
  }
}
