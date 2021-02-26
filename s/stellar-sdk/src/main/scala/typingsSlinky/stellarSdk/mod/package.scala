package typingsSlinky.stellarSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def default: js.Any = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[js.Any]
  
  @scala.inline
  def AuthImmutableFlag: typingsSlinky.stellarSdk.stellarSdkNumbers.`4` = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthImmutableFlag").asInstanceOf[typingsSlinky.stellarSdk.stellarSdkNumbers.`4`]
  
  @scala.inline
  def AuthRequiredFlag: typingsSlinky.stellarSdk.stellarSdkNumbers.`1` = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRequiredFlag").asInstanceOf[typingsSlinky.stellarSdk.stellarSdkNumbers.`1`]
  
  @scala.inline
  def AuthRevocableFlag: typingsSlinky.stellarSdk.stellarSdkNumbers.`2` = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AuthRevocableFlag").asInstanceOf[typingsSlinky.stellarSdk.stellarSdkNumbers.`2`]
  
  @scala.inline
  def BASE_FEE: /* "100" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BASE_FEE").asInstanceOf[/* "100" */ java.lang.String]
  
  @scala.inline
  def FEDERATION_RESPONSE_MAX_SIZE: scala.Double = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FEDERATION_RESPONSE_MAX_SIZE").asInstanceOf[scala.Double]
  
  @scala.inline
  def FastSigning: scala.Boolean = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("FastSigning").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def HorizonAxiosClient: typingsSlinky.axios.mod.AxiosInstance = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HorizonAxiosClient").asInstanceOf[typingsSlinky.axios.mod.AxiosInstance]
  
  @scala.inline
  def MemoHash: /* "hash" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoHash").asInstanceOf[/* "hash" */ java.lang.String]
  
  @scala.inline
  def MemoID: /* "id" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoID").asInstanceOf[/* "id" */ java.lang.String]
  
  @scala.inline
  def MemoNone: /* "none" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoNone").asInstanceOf[/* "none" */ java.lang.String]
  
  @scala.inline
  def MemoReturn: /* "return" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoReturn").asInstanceOf[/* "return" */ java.lang.String]
  
  @scala.inline
  def MemoText: /* "text" */ java.lang.String = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MemoText").asInstanceOf[/* "text" */ java.lang.String]
  
  @scala.inline
  def SERVER_TIME_MAP: typingsSlinky.std.Record[java.lang.String, typingsSlinky.stellarSdk.horizonAxiosClientMod.ServerTime] = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SERVER_TIME_MAP").asInstanceOf[typingsSlinky.std.Record[java.lang.String, typingsSlinky.stellarSdk.horizonAxiosClientMod.ServerTime]]
  
  @scala.inline
  def STELLAR_TOML_MAX_SIZE: scala.Double = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("STELLAR_TOML_MAX_SIZE").asInstanceOf[scala.Double]
  
  @scala.inline
  def TimeoutInfinite: /* 0 */ scala.Double = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TimeoutInfinite").asInstanceOf[/* 0 */ scala.Double]
  
  @scala.inline
  def getCurrentServerTime(hostname: java.lang.String): scala.Double | scala.Null = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentServerTime")(hostname.asInstanceOf[js.Any]).asInstanceOf[scala.Double | scala.Null]
  
  @scala.inline
  def hash(data: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def sign(data: typingsSlinky.node.Buffer, rawSecret: typingsSlinky.node.Buffer): typingsSlinky.node.Buffer = (typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(data.asInstanceOf[js.Any], rawSecret.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def verify(
    data: typingsSlinky.node.Buffer,
    signature: typingsSlinky.node.Buffer,
    rawPublicKey: typingsSlinky.node.Buffer
  ): scala.Boolean = (typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(data.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], rawPublicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def version: js.Any = typingsSlinky.stellarSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[js.Any]
}
