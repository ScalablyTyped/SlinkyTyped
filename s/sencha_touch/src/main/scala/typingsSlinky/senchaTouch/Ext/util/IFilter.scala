package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilter extends IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of anyMatch
  		* @returns Boolean
  		*/
  var getAnyMatch: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of caseSensitive
  		* @returns Boolean
  		*/
  var getCaseSensitive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of exactMatch
  		* @returns Boolean
  		*/
  var getExactMatch: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of filterFn
  		* @returns Function
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of id
  		* @returns String
  		*/
  var getId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of value
  		* @returns RegExp/Mixed
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of anyMatch
  		* @param anyMatch Boolean The new value.
  		*/
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of caseSensitive
  		* @param caseSensitive Boolean The new value.
  		*/
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of exactMatch
  		* @param exactMatch Boolean The new value.
  		*/
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of filterFn
  		* @param filterFn Function The new value.
  		*/
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of id
  		* @param id String The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of value
  		* @param value RegExp/Mixed The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IFilter {
  @scala.inline
  def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  @scala.inline
  implicit class IFilterOps[Self <: IFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withExactMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnyMatch(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnyMatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnyMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnyMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCaseSensitive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaseSensitive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExactMatch(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExactMatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilterFn(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
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
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
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
    def withId(value: String): Self = {
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
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnyMatch(value: /* anyMatch */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnyMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnyMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnyMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCaseSensitive(value: /* caseSensitive */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCaseSensitive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExactMatch(value: /* exactMatch */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExactMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilterFn(value: /* filterFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[String] => Unit): Self = {
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
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

