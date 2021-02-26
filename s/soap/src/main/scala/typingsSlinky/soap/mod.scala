package typingsSlinky.soap

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.node.Buffer
import typingsSlinky.soap.serverMod.ServerType
import typingsSlinky.soap.typesMod.IOptions
import typingsSlinky.soap.typesMod.IServerOptions
import typingsSlinky.soap.typesMod.IServices
import typingsSlinky.soap.wssecurityMod.IWSSecurityOptions
import typingsSlinky.soap.wssecuritycertMod.IWSSecurityCertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("soap", "BasicAuthSecurity")
  @js.native
  class BasicAuthSecurity protected ()
    extends typingsSlinky.soap.securityMod.BasicAuthSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
  }
  
  @JSImport("soap", "BearerSecurity")
  @js.native
  class BearerSecurity protected ()
    extends typingsSlinky.soap.securityMod.BearerSecurity {
    def this(token: String) = this()
    def this(token: String, defaults: js.Any) = this()
  }
  
  @JSImport("soap", "Client")
  @js.native
  class Client protected ()
    extends typingsSlinky.soap.clientMod.Client {
    def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL) = this()
    def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL, endpoint: String) = this()
    def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL, endpoint: js.UndefOr[scala.Nothing], options: IOptions) = this()
    def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL, endpoint: String, options: IOptions) = this()
  }
  
  @JSImport("soap", "ClientSSLSecurity")
  @js.native
  class ClientSSLSecurity protected ()
    extends typingsSlinky.soap.securityMod.ClientSSLSecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, ca: String) = this()
    def this(key: String, cert: String, ca: js.Any) = this()
    def this(key: String, cert: String, ca: js.Array[_]) = this()
    def this(key: String, cert: String, ca: Buffer) = this()
    def this(key: String, cert: Buffer, ca: String) = this()
    def this(key: String, cert: Buffer, ca: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[_]) = this()
    def this(key: String, cert: Buffer, ca: Buffer) = this()
    def this(key: Buffer, cert: String, ca: String) = this()
    def this(key: Buffer, cert: String, ca: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[_]) = this()
    def this(key: Buffer, cert: String, ca: Buffer) = this()
    def this(key: Buffer, cert: Buffer, ca: String) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[_]) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
    def this(key: String, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: String, cert: String, ca: String, defaults: js.Any) = this()
    def this(key: String, cert: String, ca: js.Any, defaults: js.Any) = this()
    def this(key: String, cert: String, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: String, cert: String, ca: Buffer, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: String, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Any, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
  }
  
  @JSImport("soap", "ClientSSLSecurityPFX")
  @js.native
  class ClientSSLSecurityPFX protected ()
    extends typingsSlinky.soap.securityMod.ClientSSLSecurityPFX {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: js.Any) = this()
    def this(pfx: Buffer, defaults: js.Any) = this()
  }
  
  @JSImport("soap", "HttpClient")
  @js.native
  class HttpClient ()
    extends typingsSlinky.soap.httpMod.HttpClient {
    def this(options: IOptions) = this()
  }
  
  @JSImport("soap", "NTLMSecurity")
  @js.native
  class NTLMSecurity protected ()
    extends typingsSlinky.soap.securityMod.NTLMSecurity {
    def this(defaults: js.Any) = this()
  }
  
  @JSImport("soap", "Server")
  @js.native
  class Server protected ()
    extends typingsSlinky.soap.serverMod.Server {
    def this(server: ServerType, path: String, services: IServices, wsdl: typingsSlinky.soap.wsdlMod.WSDL) = this()
    def this(
      server: ServerType,
      path: String,
      services: IServices,
      wsdl: typingsSlinky.soap.wsdlMod.WSDL,
      options: IServerOptions
    ) = this()
  }
  
  @JSImport("soap", "WSDL")
  @js.native
  class WSDL protected ()
    extends typingsSlinky.soap.wsdlMod.WSDL {
    def this(definition: js.Any, uri: String, options: IOptions) = this()
  }
  
  @JSImport("soap", "WSSecurity")
  @js.native
  class WSSecurity protected ()
    extends typingsSlinky.soap.securityMod.WSSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
  }
  
  @JSImport("soap", "WSSecurityCert")
  @js.native
  class WSSecurityCert protected ()
    extends typingsSlinky.soap.securityMod.WSSecurityCert {
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
    def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
  }
  
  @JSImport("soap", "createClient")
  @js.native
  def createClient(url: String, callback: CreateClientCallback): Unit = js.native
  @JSImport("soap", "createClient")
  @js.native
  def createClient(url: String, callback: CreateClientCallback, endpoint: String): Unit = js.native
  @JSImport("soap", "createClient")
  @js.native
  def createClient(url: String, options: IOptions, callback: CreateClientCallback): Unit = js.native
  @JSImport("soap", "createClient")
  @js.native
  def createClient(url: String, options: IOptions, callback: CreateClientCallback, endpoint: String): Unit = js.native
  
  @JSImport("soap", "createClientAsync")
  @js.native
  def createClientAsync(url: String): js.Promise[typingsSlinky.soap.clientMod.Client] = js.native
  @JSImport("soap", "createClientAsync")
  @js.native
  def createClientAsync(url: String, options: js.UndefOr[scala.Nothing], endpoint: String): js.Promise[typingsSlinky.soap.clientMod.Client] = js.native
  @JSImport("soap", "createClientAsync")
  @js.native
  def createClientAsync(url: String, options: IOptions): js.Promise[typingsSlinky.soap.clientMod.Client] = js.native
  @JSImport("soap", "createClientAsync")
  @js.native
  def createClientAsync(url: String, options: IOptions, endpoint: String): js.Promise[typingsSlinky.soap.clientMod.Client] = js.native
  
  @JSImport("soap", "listen")
  @js.native
  def listen(server: ServerType, options: IServerOptions): typingsSlinky.soap.serverMod.Server = js.native
  @JSImport("soap", "listen")
  @js.native
  def listen(server: ServerType, path: String, services: IServices, wsdl: String): typingsSlinky.soap.serverMod.Server = js.native
  @JSImport("soap", "listen")
  @js.native
  def listen(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): typingsSlinky.soap.serverMod.Server = js.native
  
  @JSImport("soap", "passwordDigest")
  @js.native
  def passwordDigest(nonce: String, created: String, password: String): String = js.native
  
  object security {
    
    @JSImport("soap", "security")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("soap", "security.BasicAuthSecurity")
    @js.native
    def BasicAuthSecurity: Instantiable3[
        /* username */ String, 
        /* password */ String, 
        /* defaults */ js.UndefOr[js.Any], 
        typingsSlinky.soap.securityMod.BasicAuthSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.BasicAuthSecurity")
    @js.native
    class BasicAuthSecurityCls protected ()
      extends typingsSlinky.soap.securityMod.BasicAuthSecurity {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, defaults: js.Any) = this()
    }
    
    @scala.inline
    def BasicAuthSecurity_=(
      x: Instantiable3[
          /* username */ String, 
          /* password */ String, 
          /* defaults */ js.UndefOr[js.Any], 
          typingsSlinky.soap.securityMod.BasicAuthSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BasicAuthSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.BearerSecurity")
    @js.native
    def BearerSecurity: Instantiable2[
        /* token */ String, 
        /* defaults */ js.UndefOr[js.Any], 
        typingsSlinky.soap.securityMod.BearerSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.BearerSecurity")
    @js.native
    class BearerSecurityCls protected ()
      extends typingsSlinky.soap.securityMod.BearerSecurity {
      def this(token: String) = this()
      def this(token: String, defaults: js.Any) = this()
    }
    
    @scala.inline
    def BearerSecurity_=(
      x: Instantiable2[
          /* token */ String, 
          /* defaults */ js.UndefOr[js.Any], 
          typingsSlinky.soap.securityMod.BearerSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BearerSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.ClientSSLSecurity")
    @js.native
    def ClientSSLSecurity: Instantiable4[
        /* key */ String | Buffer, 
        /* cert */ String | Buffer, 
        /* ca */ js.UndefOr[Buffer | String | js.Array[js.Any] | js.Any], 
        /* defaults */ js.UndefOr[js.Any], 
        typingsSlinky.soap.securityMod.ClientSSLSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.ClientSSLSecurity")
    @js.native
    class ClientSSLSecurityCls protected ()
      extends typingsSlinky.soap.securityMod.ClientSSLSecurity {
      def this(key: String, cert: String) = this()
      def this(key: String, cert: Buffer) = this()
      def this(key: Buffer, cert: String) = this()
      def this(key: Buffer, cert: Buffer) = this()
      def this(key: String, cert: String, ca: String) = this()
      def this(key: String, cert: String, ca: js.Any) = this()
      def this(key: String, cert: String, ca: js.Array[_]) = this()
      def this(key: String, cert: String, ca: Buffer) = this()
      def this(key: String, cert: Buffer, ca: String) = this()
      def this(key: String, cert: Buffer, ca: js.Any) = this()
      def this(key: String, cert: Buffer, ca: js.Array[_]) = this()
      def this(key: String, cert: Buffer, ca: Buffer) = this()
      def this(key: Buffer, cert: String, ca: String) = this()
      def this(key: Buffer, cert: String, ca: js.Any) = this()
      def this(key: Buffer, cert: String, ca: js.Array[_]) = this()
      def this(key: Buffer, cert: String, ca: Buffer) = this()
      def this(key: Buffer, cert: Buffer, ca: String) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Array[_]) = this()
      def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
      def this(key: String, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
      def this(key: String, cert: String, ca: String, defaults: js.Any) = this()
      def this(key: String, cert: String, ca: js.Any, defaults: js.Any) = this()
      def this(key: String, cert: String, ca: js.Array[_], defaults: js.Any) = this()
      def this(key: String, cert: String, ca: Buffer, defaults: js.Any) = this()
      def this(key: String, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
      def this(key: String, cert: Buffer, ca: String, defaults: js.Any) = this()
      def this(key: String, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
      def this(key: String, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
      def this(key: String, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
      def this(key: Buffer, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
      def this(key: Buffer, cert: String, ca: String, defaults: js.Any) = this()
      def this(key: Buffer, cert: String, ca: js.Any, defaults: js.Any) = this()
      def this(key: Buffer, cert: String, ca: js.Array[_], defaults: js.Any) = this()
      def this(key: Buffer, cert: String, ca: Buffer, defaults: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: String, defaults: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
      def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
    }
    
    @JSImport("soap", "security.ClientSSLSecurityPFX")
    @js.native
    def ClientSSLSecurityPFX: Instantiable2[
        /* pfx */ String | Buffer, 
        /* defaults */ js.UndefOr[js.Any], 
        typingsSlinky.soap.securityMod.ClientSSLSecurityPFX
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.ClientSSLSecurityPFX")
    @js.native
    class ClientSSLSecurityPFXCls protected ()
      extends typingsSlinky.soap.securityMod.ClientSSLSecurityPFX {
      def this(pfx: String) = this()
      def this(pfx: Buffer) = this()
      def this(pfx: String, defaults: js.Any) = this()
      def this(pfx: Buffer, defaults: js.Any) = this()
    }
    
    @scala.inline
    def ClientSSLSecurityPFX_=(
      x: Instantiable2[
          /* pfx */ String | Buffer, 
          /* defaults */ js.UndefOr[js.Any], 
          typingsSlinky.soap.securityMod.ClientSSLSecurityPFX
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientSSLSecurityPFX")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ClientSSLSecurity_=(
      x: Instantiable4[
          /* key */ String | Buffer, 
          /* cert */ String | Buffer, 
          /* ca */ js.UndefOr[Buffer | String | js.Array[js.Any] | js.Any], 
          /* defaults */ js.UndefOr[js.Any], 
          typingsSlinky.soap.securityMod.ClientSSLSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientSSLSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.NTLMSecurity")
    @js.native
    def NTLMSecurity: Instantiable1[/* defaults */ js.Any, typingsSlinky.soap.securityMod.NTLMSecurity] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.NTLMSecurity")
    @js.native
    class NTLMSecurityCls protected ()
      extends typingsSlinky.soap.securityMod.NTLMSecurity {
      def this(defaults: js.Any) = this()
    }
    
    @scala.inline
    def NTLMSecurity_=(x: Instantiable1[/* defaults */ js.Any, typingsSlinky.soap.securityMod.NTLMSecurity]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NTLMSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.WSSecurity")
    @js.native
    def WSSecurity: Instantiable3[
        /* username */ String, 
        /* password */ String, 
        /* options */ js.UndefOr[String | IWSSecurityOptions], 
        typingsSlinky.soap.securityMod.WSSecurity
      ] = js.native
    
    @JSImport("soap", "security.WSSecurityCert")
    @js.native
    def WSSecurityCert: Instantiable4[
        /* privatePEM */ js.Any, 
        /* publicP12PEM */ js.Any, 
        /* password */ js.Any, 
        /* options */ js.UndefOr[IWSSecurityCertOptions], 
        typingsSlinky.soap.securityMod.WSSecurityCert
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.WSSecurityCert")
    @js.native
    class WSSecurityCertCls protected ()
      extends typingsSlinky.soap.securityMod.WSSecurityCert {
      def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any) = this()
      def this(privatePEM: js.Any, publicP12PEM: js.Any, password: js.Any, options: IWSSecurityCertOptions) = this()
    }
    
    @scala.inline
    def WSSecurityCert_=(
      x: Instantiable4[
          /* privatePEM */ js.Any, 
          /* publicP12PEM */ js.Any, 
          /* password */ js.Any, 
          /* options */ js.UndefOr[IWSSecurityCertOptions], 
          typingsSlinky.soap.securityMod.WSSecurityCert
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WSSecurityCert")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.WSSecurity")
    @js.native
    class WSSecurityCls protected ()
      extends typingsSlinky.soap.securityMod.WSSecurity {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, options: String) = this()
      def this(username: String, password: String, options: IWSSecurityOptions) = this()
    }
    
    @scala.inline
    def WSSecurity_=(
      x: Instantiable3[
          /* username */ String, 
          /* password */ String, 
          /* options */ js.UndefOr[String | IWSSecurityOptions], 
          typingsSlinky.soap.securityMod.WSSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WSSecurity")(x.asInstanceOf[js.Any])
  }
  
  type CreateClientCallback = js.Function2[/* err */ js.Any, /* client */ typingsSlinky.soap.clientMod.Client, Unit]
}
