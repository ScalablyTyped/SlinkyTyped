package typingsSlinky.tunnelSsh

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.netMod.Server
import typingsSlinky.tunnelSsh.anon.Cipher
import typingsSlinky.tunnelSsh.tunnelSshStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tunnel-ssh", JSImport.Namespace)
  @js.native
  def apply(): Server = js.native
  @JSImport("tunnel-ssh", JSImport.Namespace)
  @js.native
  def apply(
    config: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* error */ js.Error, /* server */ Server, Unit]
  ): Server = js.native
  @JSImport("tunnel-ssh", JSImport.Namespace)
  @js.native
  def apply(config: Config): Server = js.native
  @JSImport("tunnel-ssh", JSImport.Namespace)
  @js.native
  def apply(config: Config, cb: js.Function2[/* error */ js.Error, /* server */ Server, Unit]): Server = js.native
  
  @js.native
  trait Config extends StObject {
    
    var agent: js.UndefOr[String] = js.native
    
    var agentForward: js.UndefOr[Boolean] = js.native
    
    var algorithms: js.UndefOr[Cipher] = js.native
    
    var authHandler: js.UndefOr[
        js.Function3[
          /* methodsLeft */ Null | js.Array[String], 
          /* partialSuccess */ Null | Boolean, 
          /* cb */ js.Function1[/* nextMethod */ String, Unit], 
          String
        ]
      ] = js.native
    
    var compress: js.UndefOr[force | Boolean] = js.native
    
    var debug: js.UndefOr[js.Function1[/* info */ String, Unit]] = js.native
    
    var dstHost: js.UndefOr[String] = js.native
    
    var dstPort: js.UndefOr[Double] = js.native
    
    var forceIPv4: js.UndefOr[Boolean] = js.native
    
    var forceIPv6: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hostHast: js.UndefOr[String] = js.native
    
    var hostVerifier: js.UndefOr[
        js.Function2[
          /* hashedKey */ String, 
          /* repeated */ js.Function1[/* doContinue */ Boolean, Unit], 
          Boolean
        ]
      ] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var keepaliveCountMax: js.UndefOr[Double] = js.native
    
    var keepaliveInterval: js.UndefOr[Double] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var localHost: js.UndefOr[String] = js.native
    
    var localHostname: js.UndefOr[String] = js.native
    
    var localPort: js.UndefOr[Double] = js.native
    
    var localUsername: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var privateKey: js.UndefOr[Buffer | String] = js.native
    
    var readyTimeout: js.UndefOr[Double] = js.native
    
    var sock: js.UndefOr[ReadableStream] = js.native
    
    var strictVendor: js.UndefOr[Boolean] = js.native
    
    var tryKeyboard: js.UndefOr[Boolean] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentForward(value: Boolean): Self = StObject.set(x, "agentForward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentForwardUndefined: Self = StObject.set(x, "agentForward", js.undefined)
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAlgorithms(value: Cipher): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAuthHandler(
        value: (/* methodsLeft */ Null | js.Array[String], /* partialSuccess */ Null | Boolean, /* cb */ js.Function1[/* nextMethod */ String, Unit]) => String
      ): Self = StObject.set(x, "authHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAuthHandlerUndefined: Self = StObject.set(x, "authHandler", js.undefined)
      
      @scala.inline
      def setCompress(value: force | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setDebug(value: /* info */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDstHost(value: String): Self = StObject.set(x, "dstHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstHostUndefined: Self = StObject.set(x, "dstHost", js.undefined)
      
      @scala.inline
      def setDstPort(value: Double): Self = StObject.set(x, "dstPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstPortUndefined: Self = StObject.set(x, "dstPort", js.undefined)
      
      @scala.inline
      def setForceIPv4(value: Boolean): Self = StObject.set(x, "forceIPv4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIPv4Undefined: Self = StObject.set(x, "forceIPv4", js.undefined)
      
      @scala.inline
      def setForceIPv6(value: Boolean): Self = StObject.set(x, "forceIPv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIPv6Undefined: Self = StObject.set(x, "forceIPv6", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHast(value: String): Self = StObject.set(x, "hostHast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostHastUndefined: Self = StObject.set(x, "hostHast", js.undefined)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostVerifier(
        value: (/* hashedKey */ String, /* repeated */ js.Function1[/* doContinue */ Boolean, Unit]) => Boolean
      ): Self = StObject.set(x, "hostVerifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHostVerifierUndefined: Self = StObject.set(x, "hostVerifier", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setKeepaliveCountMax(value: Double): Self = StObject.set(x, "keepaliveCountMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveCountMaxUndefined: Self = StObject.set(x, "keepaliveCountMax", js.undefined)
      
      @scala.inline
      def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalHost(value: String): Self = StObject.set(x, "localHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalHostUndefined: Self = StObject.set(x, "localHost", js.undefined)
      
      @scala.inline
      def setLocalHostname(value: String): Self = StObject.set(x, "localHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalHostnameUndefined: Self = StObject.set(x, "localHostname", js.undefined)
      
      @scala.inline
      def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setLocalUsername(value: String): Self = StObject.set(x, "localUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUsernameUndefined: Self = StObject.set(x, "localUsername", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Buffer | String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
      
      @scala.inline
      def setSock(value: ReadableStream): Self = StObject.set(x, "sock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockUndefined: Self = StObject.set(x, "sock", js.undefined)
      
      @scala.inline
      def setStrictVendor(value: Boolean): Self = StObject.set(x, "strictVendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictVendorUndefined: Self = StObject.set(x, "strictVendor", js.undefined)
      
      @scala.inline
      def setTryKeyboard(value: Boolean): Self = StObject.set(x, "tryKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTryKeyboardUndefined: Self = StObject.set(x, "tryKeyboard", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
