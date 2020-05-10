package typingsSlinky.senchaTouch.Ext.device.filesystem

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of fileSystemSize
  		* @returns Number
  		*/
  var getFileSystemSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of fileSystemType
  		* @returns Number
  		*/
  var getFileSystemType: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of readerType
  		* @returns String
  		*/
  var getReaderType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of stringEncoding
  		* @returns String
  		*/
  var getStringEncoding: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of fileSystemSize
  		* @param fileSystemSize Number The new value.
  		*/
  var setFileSystemSize: js.UndefOr[js.Function1[/* fileSystemSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of fileSystemType
  		* @param fileSystemType Number The new value.
  		*/
  var setFileSystemType: js.UndefOr[js.Function1[/* fileSystemType */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of readerType
  		* @param readerType String The new value.
  		*/
  var setReaderType: js.UndefOr[js.Function1[/* readerType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of stringEncoding
  		* @param stringEncoding String The new value.
  		*/
  var setStringEncoding: js.UndefOr[js.Function1[/* stringEncoding */ js.UndefOr[String], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFileSystemSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystemSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFileSystemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystemSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFileSystemType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystemType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFileSystemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileSystemType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReaderType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReaderType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReaderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReaderType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStringEncoding(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringEncoding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStringEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStringEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFileSystemSize(value: /* fileSystemSize */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileSystemSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFileSystemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileSystemSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFileSystemType(value: /* fileSystemType */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileSystemType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFileSystemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileSystemType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReaderType(value: /* readerType */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReaderType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReaderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReaderType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStringEncoding(value: /* stringEncoding */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStringEncoding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStringEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStringEncoding")(js.undefined)
        ret
    }
  }
  
}

