package typingsSlinky.sjcl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def bn: typingsSlinky.sjcl.mod.BigNumberStatic = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bn").asInstanceOf[typingsSlinky.sjcl.mod.BigNumberStatic]
  @scala.inline
  def bn_=(x: typingsSlinky.sjcl.mod.BigNumberStatic): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("bn")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def prng: typingsSlinky.sjcl.mod.SjclRandomStatic = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("prng").asInstanceOf[typingsSlinky.sjcl.mod.SjclRandomStatic]
  @scala.inline
  def prng_=(x: typingsSlinky.sjcl.mod.SjclRandomStatic): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("prng")(x.asInstanceOf[js.Any])
  
  // ________________________________________________________________________
  type BitArray_ = js.Array[scala.Double]
  
  type SjclConvenienceDecryptor = js.Function4[
    /* password */ typingsSlinky.sjcl.mod.SjclElGamalSecretKey | typingsSlinky.sjcl.mod.BitArray_ | java.lang.String, 
    /* ciphertext */ typingsSlinky.sjcl.mod.SjclCipherEncrypted | java.lang.String, 
    /* params */ js.UndefOr[typingsSlinky.sjcl.mod.SjclCipherDecryptParams], 
    /* rp */ js.UndefOr[typingsSlinky.sjcl.mod.SjclCipherDecrypted], 
    java.lang.String
  ]
  
  type SjclConvenienceEncryptor = js.Function4[
    /* password */ typingsSlinky.sjcl.mod.SjclElGamalPublicKey | typingsSlinky.sjcl.mod.BitArray_ | java.lang.String, 
    /* plaintext */ java.lang.String, 
    /* params */ js.UndefOr[typingsSlinky.sjcl.mod.SjclCipherEncryptParams], 
    /* rp */ js.UndefOr[typingsSlinky.sjcl.mod.SjclCipherEncrypted], 
    typingsSlinky.sjcl.mod.SjclCipherEncrypted
  ]
  
  type SjclKeysGenerator[P /* <: typingsSlinky.sjcl.mod.SjclECCPublicKey */, S /* <: typingsSlinky.sjcl.mod.SjclECCSecretKey */] = js.Function3[
    /* curve */ typingsSlinky.sjcl.mod.SjclEllipticalCurve | scala.Double, 
    /* paranoia */ scala.Double, 
    /* sec */ js.UndefOr[typingsSlinky.sjcl.mod.BigNumber], 
    typingsSlinky.sjcl.mod.SjclKeyPair[P, S]
  ]
  
  @scala.inline
  def arrayBuffer: typingsSlinky.sjcl.mod.SjclArrayBufferModes = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("arrayBuffer").asInstanceOf[typingsSlinky.sjcl.mod.SjclArrayBufferModes]
  @scala.inline
  def arrayBuffer_=(x: typingsSlinky.sjcl.mod.SjclArrayBufferModes): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def bitArray: typingsSlinky.sjcl.mod.BitArrayStatic = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bitArray").asInstanceOf[typingsSlinky.sjcl.mod.BitArrayStatic]
  @scala.inline
  def bitArray_=(x: typingsSlinky.sjcl.mod.BitArrayStatic): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def codec: typingsSlinky.sjcl.mod.SjclCodecs = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("codec").asInstanceOf[typingsSlinky.sjcl.mod.SjclCodecs]
  @scala.inline
  def codec_=(x: typingsSlinky.sjcl.mod.SjclCodecs): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("codec")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def decrypt: typingsSlinky.sjcl.mod.SjclConvenienceDecryptor = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("decrypt").asInstanceOf[typingsSlinky.sjcl.mod.SjclConvenienceDecryptor]
  @scala.inline
  def decrypt_=(x: typingsSlinky.sjcl.mod.SjclConvenienceDecryptor): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def encrypt: typingsSlinky.sjcl.mod.SjclConvenienceEncryptor = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("encrypt").asInstanceOf[typingsSlinky.sjcl.mod.SjclConvenienceEncryptor]
  @scala.inline
  def encrypt_=(x: typingsSlinky.sjcl.mod.SjclConvenienceEncryptor): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def json: typingsSlinky.sjcl.mod.SjclJson = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("json").asInstanceOf[typingsSlinky.sjcl.mod.SjclJson]
  @scala.inline
  def json_=(x: typingsSlinky.sjcl.mod.SjclJson): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def keyexchange: typingsSlinky.sjcl.mod.SjclKeyExchange = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("keyexchange").asInstanceOf[typingsSlinky.sjcl.mod.SjclKeyExchange]
  @scala.inline
  def keyexchange_=(x: typingsSlinky.sjcl.mod.SjclKeyExchange): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("keyexchange")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def mode: typingsSlinky.sjcl.mod.SjclModes = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mode").asInstanceOf[typingsSlinky.sjcl.mod.SjclModes]
  @scala.inline
  def mode_=(x: typingsSlinky.sjcl.mod.SjclModes): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def random: typingsSlinky.sjcl.mod.SjclRandom = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("random").asInstanceOf[typingsSlinky.sjcl.mod.SjclRandom]
  @scala.inline
  def random_=(x: typingsSlinky.sjcl.mod.SjclRandom): scala.Unit = typingsSlinky.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("random")(x.asInstanceOf[js.Any])
}
