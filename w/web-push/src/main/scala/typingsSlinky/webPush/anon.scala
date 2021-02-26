package typingsSlinky.webPush

import typingsSlinky.node.Buffer
import typingsSlinky.webPush.mod.Headers
import typingsSlinky.webPush.webPushStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Auth extends StObject {
    
    var auth: String = js.native
    
    var p256dh: String = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(auth: String, p256dh: String): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Authorization extends StObject {
    
    var Authorization: String = js.native
  }
  object Authorization {
    
    @scala.inline
    def apply(Authorization: String): Authorization = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    @scala.inline
    implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthorizationCryptoKey extends StObject {
    
    var Authorization: String = js.native
    
    var `Crypto-Key`: js.UndefOr[String] = js.native
  }
  object AuthorizationCryptoKey {
    
    @scala.inline
    def apply(Authorization: String): AuthorizationCryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationCryptoKey]
    }
    
    @scala.inline
    implicit class AuthorizationCryptoKeyMutableBuilder[Self <: AuthorizationCryptoKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-KeyUndefined`: Self = StObject.set(x, "Crypto-Key", js.undefined)
    }
  }
  
  @js.native
  trait CryptoKey extends StObject {
    
    var Authorization: String = js.native
    
    var `Crypto-Key`: String = js.native
  }
  object CryptoKey {
    
    @scala.inline
    def apply(Authorization: String, `Crypto-Key`: String): CryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoKey]
    }
    
    @scala.inline
    implicit class CryptoKeyMutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrivateKey extends StObject {
    
    var privateKey: String = js.native
    
    var publicKey: String = js.native
    
    // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
    var subject: String = js.native
  }
  object PrivateKey {
    
    @scala.inline
    def apply(privateKey: String, publicKey: String, subject: String): PrivateKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    @scala.inline
    implicit class PrivateKeyMutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined web-push.web-push.RequestDetails & {  body :node.Buffer} */
  @js.native
  trait RequestDetailsbodyBuffer extends StObject {
    
    var body: (Buffer | Null) with Buffer = js.native
    
    var endpoint: String = js.native
    
    var headers: Headers = js.native
    
    var method: POST = js.native
    
    var proxy: js.UndefOr[String] = js.native
  }
  object RequestDetailsbodyBuffer {
    
    @scala.inline
    def apply(body: (Buffer | Null) with Buffer, endpoint: String, headers: Headers, method: POST): RequestDetailsbodyBuffer = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDetailsbodyBuffer]
    }
    
    @scala.inline
    implicit class RequestDetailsbodyBufferMutableBuilder[Self <: RequestDetailsbodyBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: (Buffer | Null) with Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  /* Inlined web-push.web-push.RequestDetails & {  body :null} */
  @js.native
  trait RequestDetailsbodynull extends StObject {
    
    var body: (Buffer | Null) with Null = js.native
    
    var endpoint: String = js.native
    
    var headers: Headers = js.native
    
    var method: POST = js.native
    
    var proxy: js.UndefOr[String] = js.native
  }
  object RequestDetailsbodynull {
    
    @scala.inline
    def apply(body: (Buffer | Null) with Null, endpoint: String, headers: Headers, method: POST): RequestDetailsbodynull = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDetailsbodynull]
    }
    
    @scala.inline
    implicit class RequestDetailsbodynullMutableBuilder[Self <: RequestDetailsbodynull] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: (Buffer | Null) with Null): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
