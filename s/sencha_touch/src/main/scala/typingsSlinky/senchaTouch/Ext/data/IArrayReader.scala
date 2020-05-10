package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.data.reader.IJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayReader extends IJson {
  /** [Method] Sets the value of successProperty
  		* @param successProperty Object The new value.
  		*/
  @JSName("setSuccessProperty")
  var setSuccessProperty_IArrayReader: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of totalProperty
  		* @param totalProperty Object The new value.
  		*/
  @JSName("setTotalProperty")
  var setTotalProperty_IArrayReader: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[js.Any], Unit]] = js.native
}

object IArrayReader {
  @scala.inline
  def apply(): IArrayReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayReader]
  }
  @scala.inline
  implicit class IArrayReaderOps[Self <: IArrayReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetSuccessProperty(value: /* successProperty */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSuccessProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotalProperty(value: /* totalProperty */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotalProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalProperty")(js.undefined)
        ret
    }
  }
  
}

