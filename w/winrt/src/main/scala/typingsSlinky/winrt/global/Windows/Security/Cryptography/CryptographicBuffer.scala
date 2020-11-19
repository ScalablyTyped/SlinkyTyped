package typingsSlinky.winrt.global.Windows.Security.Cryptography

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
class CryptographicBuffer ()
  extends typingsSlinky.winrt.Windows.Security.Cryptography.CryptographicBuffer
/* static members */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
object CryptographicBuffer extends js.Object {
  
  def compare(object1: IBuffer, object2: IBuffer): Boolean = js.native
  
  def convertBinaryToString(encoding: typingsSlinky.winrt.Windows.Security.Cryptography.BinaryStringEncoding, buffer: IBuffer): String = js.native
  
  def convertStringToBinary(value: String, encoding: typingsSlinky.winrt.Windows.Security.Cryptography.BinaryStringEncoding): IBuffer = js.native
  
  def copyToByteArray(buffer: IBuffer): js.typedarray.Uint8Array = js.native
  
  def createFromByteArray(value: js.typedarray.Uint8Array): IBuffer = js.native
  
  def decodeFromBase64String(value: String): IBuffer = js.native
  
  def decodeFromHexString(value: String): IBuffer = js.native
  
  def encodeToBase64String(buffer: IBuffer): String = js.native
  
  def encodeToHexString(buffer: IBuffer): String = js.native
  
  def generateRandom(length: Double): IBuffer = js.native
  
  def generateRandomNumber(): Double = js.native
}
