package typingsSlinky.soap.mod.security

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.node.Buffer
import typingsSlinky.soap.wssecurityMod.IWSSecurityOptions
import typingsSlinky.soap.wssecuritycertMod.IWSSecurityCertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap", "security")
@js.native
object ^ extends js.Object {
  
  var BasicAuthSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    /* defaults */ js.UndefOr[js.Any], 
    typingsSlinky.soap.securityMod.BasicAuthSecurity
  ] = js.native
  
  var BearerSecurity: Instantiable2[
    /* token */ String, 
    /* defaults */ js.UndefOr[js.Any], 
    typingsSlinky.soap.securityMod.BearerSecurity
  ] = js.native
  
  var ClientSSLSecurity: Instantiable4[
    /* key */ String | Buffer, 
    /* cert */ String | Buffer, 
    /* ca */ js.UndefOr[Buffer | String | js.Array[js.Any] | js.Any], 
    /* defaults */ js.UndefOr[js.Any], 
    typingsSlinky.soap.securityMod.ClientSSLSecurity
  ] = js.native
  
  var ClientSSLSecurityPFX: Instantiable2[
    /* pfx */ String | Buffer, 
    /* defaults */ js.UndefOr[js.Any], 
    typingsSlinky.soap.securityMod.ClientSSLSecurityPFX
  ] = js.native
  
  var NTLMSecurity: Instantiable1[/* defaults */ js.Any, typingsSlinky.soap.securityMod.NTLMSecurity] = js.native
  
  var WSSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    /* options */ js.UndefOr[String | IWSSecurityOptions], 
    typingsSlinky.soap.securityMod.WSSecurity
  ] = js.native
  
  var WSSecurityCert: Instantiable4[
    /* privatePEM */ js.Any, 
    /* publicP12PEM */ js.Any, 
    /* password */ js.Any, 
    /* options */ js.UndefOr[IWSSecurityCertOptions], 
    typingsSlinky.soap.securityMod.WSSecurityCert
  ] = js.native
}
