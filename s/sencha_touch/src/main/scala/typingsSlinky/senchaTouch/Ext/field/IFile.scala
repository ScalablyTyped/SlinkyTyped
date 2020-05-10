package typingsSlinky.senchaTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFile extends IField {
  /** [Config Option] (String) */
  var accept: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var capture: js.UndefOr[String] = js.native
  /** [Method] Returns the value of accept
  		* @returns String
  		*/
  var getAccept: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of capture
  		* @returns String
  		*/
  var getCapture: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of multiple
  		* @returns Boolean
  		*/
  var getMultiple: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var multiple: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of accept
  		* @param accept String The new value.
  		*/
  var setAccept: js.UndefOr[js.Function1[/* accept */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of capture
  		* @param capture String The new value.
  		*/
  var setCapture: js.UndefOr[js.Function1[/* capture */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of multiple
  		* @param multiple Boolean The new value.
  		*/
  var setMultiple: js.UndefOr[js.Function1[/* multiple */ js.UndefOr[Boolean], Unit]] = js.native
}

object IFile {
  @scala.inline
  def apply(): IFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFile]
  }
  @scala.inline
  implicit class IFileOps[Self <: IFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAccept(value: () => String): Self = {
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
    def withGetCapture(value: () => String): Self = {
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
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAccept(value: /* accept */ js.UndefOr[String] => Unit): Self = {
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
    def withSetCapture(value: /* capture */ js.UndefOr[String] => Unit): Self = {
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
  }
  
}

