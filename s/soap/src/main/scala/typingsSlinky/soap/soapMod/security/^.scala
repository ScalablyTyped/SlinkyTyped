package typingsSlinky.soap.soapMod.security

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.node.Buffer
import typingsSlinky.soap.libSecurityWSSecurityCertMod.IWSSecurityCertOptions
import typingsSlinky.soap.libSecurityWSSecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security")
@js.native
object ^ extends js.Object {
  var BasicAuthSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsSlinky.soap.libSecurityMod.BasicAuthSecurity
  ] = js.native
  var BearerSecurity: Instantiable2[
    /* token */ String, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsSlinky.soap.libSecurityMod.BearerSecurity
  ] = js.native
  var ClientSSLSecurity: Instantiable3[
    /* key */ String | Buffer, 
    /* cert */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsSlinky.soap.libSecurityMod.ClientSSLSecurity
  ] = js.native
  var ClientSSLSecurityPFX: Instantiable2[
    /* pfx */ String | Buffer, 
    js.UndefOr[/* defaults */ js.Any], 
    typingsSlinky.soap.libSecurityMod.ClientSSLSecurityPFX
  ] = js.native
  var NTLMSecurity: Instantiable1[/* defaults */ js.Any, typingsSlinky.soap.libSecurityMod.NTLMSecurity] = js.native
  var WSSecurity: Instantiable3[
    /* username */ String, 
    /* password */ String, 
    js.UndefOr[String | IWSSecurityOptions], 
    typingsSlinky.soap.libSecurityMod.WSSecurity
  ] = js.native
  var WSSecurityCert: Instantiable4[
    /* privatePEM */ js.Any, 
    /* publicP12PEM */ js.Any, 
    /* password */ js.Any, 
    js.UndefOr[/* options */ IWSSecurityCertOptions], 
    typingsSlinky.soap.libSecurityMod.WSSecurityCert
  ] = js.native
}

