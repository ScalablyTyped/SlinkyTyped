package typingsSlinky.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Raw data representation._
  * @see https://docs.scriptable.app/data
  */
@js.native
trait Data extends js.Object {
  /**
    * _Gets bytes from data._
    * @see https://docs.scriptable.app/data/#-getbytes
    */
  def getBytes(): js.Array[Double] = js.native
  /**
    * _Creates a base 64 encoded string._
    *
    * Creates a base 64 encoded string from the data.
    * @see https://docs.scriptable.app/data/#-tobase64string
    */
  def toBase64String(): String = js.native
  /**
    * _Creates a string from the data._
    *
    * The data is assumed to represent a UTF8 encoded string. If the string is not UTF8 encoded string, the function will return null.
    * @see https://docs.scriptable.app/data/#-torawstring
    */
  def toRawString(): String = js.native
}

object Data {
  @scala.inline
  def apply(getBytes: () => js.Array[Double], toBase64String: () => String, toRawString: () => String): Data = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes), toBase64String = js.Any.fromFunction0(toBase64String), toRawString = js.Any.fromFunction0(toRawString))
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBytes(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBytes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBase64String(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBase64String")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToRawString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRawString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

