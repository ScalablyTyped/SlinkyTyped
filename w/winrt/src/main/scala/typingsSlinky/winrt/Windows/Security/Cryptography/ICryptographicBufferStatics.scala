package typingsSlinky.winrt.Windows.Security.Cryptography

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICryptographicBufferStatics extends js.Object {
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
  implicit class ICryptographicBufferStaticsOps[Self <: ICryptographicBufferStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: (IBuffer, IBuffer) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvertBinaryToString(value: (BinaryStringEncoding, IBuffer) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertBinaryToString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvertStringToBinary(value: (String, BinaryStringEncoding) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertStringToBinary")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopyToByteArray(value: IBuffer => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyToByteArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFromByteArray(value: js.typedarray.Uint8Array => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromByteArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeFromBase64String(value: String => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFromBase64String")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeFromHexString(value: String => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFromHexString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeToBase64String(value: IBuffer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeToBase64String")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeToHexString(value: IBuffer => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeToHexString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateRandom(value: Double => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateRandom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateRandomNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateRandomNumber")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

