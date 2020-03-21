package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclArrayBufferCCMMode extends js.Object {
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_decrypt(prf: SjclCipher, ciphertext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_): BitArray_ = js.native
  def compat_encrypt(prf: SjclCipher, plaintext: BitArray_, iv: BitArray_, adata: BitArray_, tlen: Double): BitArray_ = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer,
    tlen: Double
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def decrypt(
    prf: SjclCipher,
    ciphertext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    tag: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer,
    tlen: Double,
    ol: Double
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def encrypt(prf: SjclCipher, plaintext_buffer: scala.scalajs.js.typedarray.ArrayBuffer, iv: BitArray_): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer,
    tlen: Double
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def encrypt(
    prf: SjclCipher,
    plaintext_buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    iv: BitArray_,
    adata: scala.scalajs.js.typedarray.ArrayBuffer,
    tlen: Double,
    ol: Double
  ): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

