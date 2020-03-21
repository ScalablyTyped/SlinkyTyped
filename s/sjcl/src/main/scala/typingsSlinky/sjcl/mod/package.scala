package typingsSlinky.sjcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
}
