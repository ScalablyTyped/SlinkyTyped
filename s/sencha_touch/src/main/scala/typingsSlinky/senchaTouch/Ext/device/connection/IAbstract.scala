package typingsSlinky.senchaTouch.Ext.device.connection

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Property] (String) */
  var CELL_2G: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var CELL_3G: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var CELL_4G: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var ETHERNET: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var NONE: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var UNKNOWN: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var WIFI: js.UndefOr[String] = js.native
  /** [Method] Returns the value of online
  		* @returns Boolean
  		*/
  var getOnline: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the current connection type
  		* @returns String type
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] True if the device is currently online
  		* @returns Boolean online
  		*/
  var isOnline: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of online
  		* @param online Boolean The new value.
  		*/
  var setOnline: js.UndefOr[js.Function1[/* online */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of type
  		* @param type Object The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.native
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
    def withCELL_2G(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_2G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCELL_2G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_2G")(js.undefined)
        ret
    }
    @scala.inline
    def withCELL_3G(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_3G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCELL_3G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_3G")(js.undefined)
        ret
    }
    @scala.inline
    def withCELL_4G(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_4G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCELL_4G: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CELL_4G")(js.undefined)
        ret
    }
    @scala.inline
    def withETHERNET(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETHERNET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETHERNET: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETHERNET")(js.undefined)
        ret
    }
    @scala.inline
    def withNONE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNONE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(js.undefined)
        ret
    }
    @scala.inline
    def withUNKNOWN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUNKNOWN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(js.undefined)
        ret
    }
    @scala.inline
    def withWIFI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WIFI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWIFI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WIFI")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnline")(js.undefined)
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnline(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnline")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnline(value: /* online */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnline")(js.undefined)
        ret
    }
    @scala.inline
    def withSetType(value: /* type */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.undefined)
        ret
    }
  }
  
}

