package typingsSlinky.winrt.Windows.Security.Cryptography

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICryptographicBufferStatics extends StObject {
  
  def compare(object1: IBuffer, object2: IBuffer): Boolean = js.native
  
  def convertBinaryToString(encoding: BinaryStringEncoding, buffer: IBuffer): String = js.native
  
  def convertStringToBinary(value: String, encoding: BinaryStringEncoding): IBuffer = js.native
  
  def copyToByteArray(buffer: IBuffer): js.typedarray.Uint8Array = js.native
  
  def createFromByteArray(value: js.typedarray.Uint8Array): IBuffer = js.native
  
  def decodeFromBase64String(value: String): IBuffer = js.native
  
  def decodeFromHexString(value: String): IBuffer = js.native
  
  def encodeToBase64String(buffer: IBuffer): String = js.native
  
  def encodeToHexString(buffer: IBuffer): String = js.native
  
  def generateRandom(length: Double): IBuffer = js.native
  
  def generateRandomNumber(): Double = js.native
}
object ICryptographicBufferStatics {
  
  @scala.inline
  def apply(
    compare: (IBuffer, IBuffer) => Boolean,
    convertBinaryToString: (BinaryStringEncoding, IBuffer) => String,
    convertStringToBinary: (String, BinaryStringEncoding) => IBuffer,
    copyToByteArray: IBuffer => js.typedarray.Uint8Array,
    createFromByteArray: js.typedarray.Uint8Array => IBuffer,
    decodeFromBase64String: String => IBuffer,
    decodeFromHexString: String => IBuffer,
    encodeToBase64String: IBuffer => String,
    encodeToHexString: IBuffer => String,
    generateRandom: Double => IBuffer,
    generateRandomNumber: () => Double
  ): ICryptographicBufferStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), convertBinaryToString = js.Any.fromFunction2(convertBinaryToString), convertStringToBinary = js.Any.fromFunction2(convertStringToBinary), copyToByteArray = js.Any.fromFunction1(copyToByteArray), createFromByteArray = js.Any.fromFunction1(createFromByteArray), decodeFromBase64String = js.Any.fromFunction1(decodeFromBase64String), decodeFromHexString = js.Any.fromFunction1(decodeFromHexString), encodeToBase64String = js.Any.fromFunction1(encodeToBase64String), encodeToHexString = js.Any.fromFunction1(encodeToHexString), generateRandom = js.Any.fromFunction1(generateRandom), generateRandomNumber = js.Any.fromFunction0(generateRandomNumber))
    __obj.asInstanceOf[ICryptographicBufferStatics]
  }
  
  @scala.inline
  implicit class ICryptographicBufferStaticsMutableBuilder[Self <: ICryptographicBufferStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: (IBuffer, IBuffer) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertBinaryToString(value: (BinaryStringEncoding, IBuffer) => String): Self = StObject.set(x, "convertBinaryToString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertStringToBinary(value: (String, BinaryStringEncoding) => IBuffer): Self = StObject.set(x, "convertStringToBinary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyToByteArray(value: IBuffer => js.typedarray.Uint8Array): Self = StObject.set(x, "copyToByteArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromByteArray(value: js.typedarray.Uint8Array => IBuffer): Self = StObject.set(x, "createFromByteArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeFromBase64String(value: String => IBuffer): Self = StObject.set(x, "decodeFromBase64String", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeFromHexString(value: String => IBuffer): Self = StObject.set(x, "decodeFromHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeToBase64String(value: IBuffer => String): Self = StObject.set(x, "encodeToBase64String", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeToHexString(value: IBuffer => String): Self = StObject.set(x, "encodeToHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateRandom(value: Double => IBuffer): Self = StObject.set(x, "generateRandom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateRandomNumber(value: () => Double): Self = StObject.set(x, "generateRandomNumber", js.Any.fromFunction0(value))
  }
}
