package typingsSlinky.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextArea
  extends typingsSlinky.senchaTouch.Ext.field.IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.native
}

object ITextArea {
  @scala.inline
  def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  @scala.inline
  implicit class ITextAreaOps[Self <: ITextArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMaxRows(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxRows")(js.undefined)
        ret
    }
  }
  
}

