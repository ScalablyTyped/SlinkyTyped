package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferCCMMode extends js.Object {
  
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_decrypt(
    prf: SjclCipher,
    ciphertext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_encrypt(
    prf: SjclCipher,
    plaintext: BitArray_,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  
  def decrypt(prf: SjclCipher, ciphertext_buffer: js.typedarray.ArrayBuffer, iv: BitArray_, tag: BitArray_): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double,
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: js.UndefOr[scala.Nothing],
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: Double
  ): js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: Double,
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  
  def encrypt(prf: SjclCipher, plaintext_buffer: js.typedarray.ArrayBuffer, iv: BitArray_): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: Double,
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: js.UndefOr[scala.Nothing],
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: Double
  ): js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: js.typedarray.ArrayBuffer,
    tlen: Double,
    ol: Double
  ): js.typedarray.ArrayBuffer = js.native
}
