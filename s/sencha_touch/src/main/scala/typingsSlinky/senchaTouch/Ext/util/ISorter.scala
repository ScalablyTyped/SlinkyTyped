package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISorter extends IBase {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of id
  		* @returns Mixed
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of sorterFn
  		* @returns Function
  		*/
  var getSorterFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of transform
  		* @returns Function
  		*/
  var getTransform: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Mixed) */
  var id: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of id
  		* @param id Mixed The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sorterFn
  		* @param sorterFn Function The new value.
  		*/
  var setSorterFn: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of transform
  		* @param transform Function The new value.
  		*/
  var setTransform: js.UndefOr[js.Function1[/* transform */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.native
  /** [Method] Toggles the direction of this Sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.native
}

object ISorter {
  @scala.inline
  def apply(): ISorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISorter]
  }
  @scala.inline
  implicit class ISorterOps[Self <: ISorter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirection(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSorterFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorterFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSorterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransform(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProperty(value: /* property */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRoot(value: /* root */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSorterFn(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorterFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSorterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransform(value: /* transform */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withSorterFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorterFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

