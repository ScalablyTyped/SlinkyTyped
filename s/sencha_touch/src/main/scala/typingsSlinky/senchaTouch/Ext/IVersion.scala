package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVersion extends js.Object {
  /** [Method] Create a closure for deprecated code
  		* @param packageName String The package name.
  		* @param since String The last version before it's deprecated.
  		* @param closure Function The callback function to be executed with the specified version is less than the current version.
  		* @param scope Object The execution scope (this) if the closure
  		*/
  var deprecate: js.UndefOr[
    js.Function4[
      /* packageName */ js.UndefOr[java.lang.String], 
      /* since */ js.UndefOr[java.lang.String], 
      /* closure */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns whether this version equals to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version equals to the target, false otherwise.
  		*/
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns the build component value
  		* @returns Number build
  		*/
  var getBuild: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the major component value
  		* @returns Number major
  		*/
  var getMajor: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the minor component value
  		* @returns Number minor
  		*/
  var getMinor: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the patch component value
  		* @returns Number patch
  		*/
  var getPatch: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the release component value
  		* @returns Number release
  		*/
  var getRelease: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns shortVersion version without dots and release
  		* @returns String
  		*/
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Get the version number of the supplied package name will return the last registered version last Ext setVersion  c
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @returns Ext.Version The version.
  		*/
  var getVersion: js.UndefOr[js.Function1[/* packageName */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Convenient alias to isGreaterThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isGreaterThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if greater than the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than the target, false otherwise.
  		*/
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than or equal to the target, false otherwise.
  		*/
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if smaller than the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if smaller than the target, false otherwise.
  		*/
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if less than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if less than or equal to the target, false otherwise.
  		*/
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isLessThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isLessThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version matches the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version matches the target, false otherwise.
  		*/
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Set version number for the given package name
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @param version String/Ext.Version The version, for example: '1.2.3alpha', '2.4.0-dev'.
  		* @returns any
  		*/
  var setVersion: js.UndefOr[
    js.Function2[/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Returns this format  major minor patch build release
  		* @returns Number[]
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method]
  		* @param value Number
  		* @returns Number
  		*/
  var toNumber: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Double]] = js.native
}

object IVersion {
  @scala.inline
  def apply(): IVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersion]
  }
  @scala.inline
  implicit class IVersionOps[Self <: IVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecate(
      value: (/* packageName */ js.UndefOr[java.lang.String], /* since */ js.UndefOr[java.lang.String], /* closure */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDeprecate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBuild(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMajor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMajor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPatch(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPatch")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRelease(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelease")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShortVersion(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetShortVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVersion(value: /* packageName */ js.UndefOr[java.lang.String] => IVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.undefined)
        ret
    }
    @scala.inline
    def withGtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtEq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGtEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtEq")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGreaterThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGreaterThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsGreaterThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGreaterThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLessThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLessThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLessThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLessThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withLt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.undefined)
        ret
    }
    @scala.inline
    def withLtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltEq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLtEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltEq")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVersion(value: (/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVersion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withToArray(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.undefined)
        ret
    }
    @scala.inline
    def withToNumber(value: /* value */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumber")(js.undefined)
        ret
    }
  }
  
}

