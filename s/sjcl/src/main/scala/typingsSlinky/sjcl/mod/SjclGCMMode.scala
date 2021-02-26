package typingsSlinky.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclGCMMode extends StObject {
  
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
}
