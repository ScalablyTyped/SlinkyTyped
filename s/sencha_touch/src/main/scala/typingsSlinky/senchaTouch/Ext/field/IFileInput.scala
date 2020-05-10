package typingsSlinky.senchaTouch.Ext.field

import org.scalajs.dom.raw.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInput extends IInput {
  /** [Method] Updated the capture attribute with the  ink capture configuration
  		* @param value Object
  		*/
  var applyCapture: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of accept
  		* @returns Object
  		*/
  var getAccept: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of capture
  		* @returns Object
  		*/
  var getCapture: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the field files
  		* @returns FileList List of the files selected.
  		*/
  var getFiles: js.UndefOr[js.Function0[FileList]] = js.native
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the field data value
  		* @returns String value The field value.
  		*/
  @JSName("getValue")
  var getValue_IFileInput: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Function) */
  var me: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var newValue: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of accept
  		* @param accept Object The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of capture
  		* @param capture Object The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  @JSName("setName")
  var setName_IFileInput: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called when the multiple property is updated  */
  var updateMultiple: js.UndefOr[js.Function0[Unit]] = js.native
}

object IFileInput {
  @scala.inline
  def apply(): IFileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInput]
  }
  @scala.inline
  implicit class IFileInputOps[Self <: IFileInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyCapture(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAccept(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccept")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCapture(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCapture")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFiles(value: () => FileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMultiple(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultiple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAccept(value: /* accept */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCapture(value: /* capture */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMultiple(value: /* multiple */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMultiple(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMultiple")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMultiple")(js.undefined)
        ret
    }
  }
  
}

