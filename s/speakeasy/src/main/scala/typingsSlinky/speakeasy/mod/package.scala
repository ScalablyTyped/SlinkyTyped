package typingsSlinky.speakeasy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def counter: typingsSlinky.speakeasy.mod.Hotp_ = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("counter").asInstanceOf[typingsSlinky.speakeasy.mod.Hotp_]
  
  @scala.inline
  def digest(options: typingsSlinky.speakeasy.mod.DigestOptions): typingsSlinky.node.Buffer = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("digest")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def generateKey(): typingsSlinky.speakeasy.mod.GeneratedSecret = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")().asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateKey(options: typingsSlinky.speakeasy.mod.GenerateSecretOptions): typingsSlinky.speakeasy.mod.GeneratedSecret = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateKey(options: typingsSlinky.speakeasy.mod.GenerateSecretWithOtpAuthUrlOptions): typingsSlinky.speakeasy.mod.GeneratedSecretWithOtpAuthUrl = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecretWithOtpAuthUrl]
  
  @scala.inline
  def generateKeyAscii: js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ] = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("generate_key_ascii").asInstanceOf[js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ]]
  
  @scala.inline
  def generateSecret(): typingsSlinky.speakeasy.mod.GeneratedSecret = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")().asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateSecret(options: typingsSlinky.speakeasy.mod.GenerateSecretOptions): typingsSlinky.speakeasy.mod.GeneratedSecret = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateSecret(options: typingsSlinky.speakeasy.mod.GenerateSecretWithOtpAuthUrlOptions): typingsSlinky.speakeasy.mod.GeneratedSecretWithOtpAuthUrl = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.speakeasy.mod.GeneratedSecretWithOtpAuthUrl]
  
  @scala.inline
  def generateSecretASCII(): java.lang.String = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")().asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: js.UndefOr[scala.Nothing], symbols: scala.Boolean): java.lang.String = (typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: scala.Double): java.lang.String = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: scala.Double, symbols: scala.Boolean): java.lang.String = (typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def hotp: typingsSlinky.speakeasy.mod.Hotp_ = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("hotp").asInstanceOf[typingsSlinky.speakeasy.mod.Hotp_]
  
  @scala.inline
  def otpauthURL(options: typingsSlinky.speakeasy.mod.OtpauthURLOptions): java.lang.String = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("otpauthURL")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def time: typingsSlinky.speakeasy.mod.Totp_ = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[typingsSlinky.speakeasy.mod.Totp_]
  
  @scala.inline
  def totp: typingsSlinky.speakeasy.mod.Totp_ = typingsSlinky.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("totp").asInstanceOf[typingsSlinky.speakeasy.mod.Totp_]
}
