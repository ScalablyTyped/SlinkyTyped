package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVersion extends StObject {
  
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
  implicit class IVersionMutableBuilder[Self <: IVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecate(
      value: (/* packageName */ js.UndefOr[java.lang.String], /* since */ js.UndefOr[java.lang.String], /* closure */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "deprecate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDeprecateUndefined: Self = StObject.set(x, "deprecate", js.undefined)
    
    @scala.inline
    def setEquals_(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setGetBuild(value: () => Double): Self = StObject.set(x, "getBuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBuildUndefined: Self = StObject.set(x, "getBuild", js.undefined)
    
    @scala.inline
    def setGetMajor(value: () => Double): Self = StObject.set(x, "getMajor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMajorUndefined: Self = StObject.set(x, "getMajor", js.undefined)
    
    @scala.inline
    def setGetMinor(value: () => Double): Self = StObject.set(x, "getMinor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinorUndefined: Self = StObject.set(x, "getMinor", js.undefined)
    
    @scala.inline
    def setGetPatch(value: () => Double): Self = StObject.set(x, "getPatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPatchUndefined: Self = StObject.set(x, "getPatch", js.undefined)
    
    @scala.inline
    def setGetRelease(value: () => Double): Self = StObject.set(x, "getRelease", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReleaseUndefined: Self = StObject.set(x, "getRelease", js.undefined)
    
    @scala.inline
    def setGetShortVersion(value: () => java.lang.String): Self = StObject.set(x, "getShortVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShortVersionUndefined: Self = StObject.set(x, "getShortVersion", js.undefined)
    
    @scala.inline
    def setGetVersion(value: /* packageName */ js.UndefOr[java.lang.String] => IVersion): Self = StObject.set(x, "getVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVersionUndefined: Self = StObject.set(x, "getVersion", js.undefined)
    
    @scala.inline
    def setGt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "gtEq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGtEqUndefined: Self = StObject.set(x, "gtEq", js.undefined)
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setIsGreaterThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThanOrEqualUndefined: Self = StObject.set(x, "isGreaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setIsGreaterThanUndefined: Self = StObject.set(x, "isGreaterThan", js.undefined)
    
    @scala.inline
    def setIsLessThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThanOrEqualUndefined: Self = StObject.set(x, "isLessThanOrEqual", js.undefined)
    
    @scala.inline
    def setIsLessThanUndefined: Self = StObject.set(x, "isLessThan", js.undefined)
    
    @scala.inline
    def setLt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "ltEq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLtEqUndefined: Self = StObject.set(x, "ltEq", js.undefined)
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setMatch(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setSetVersion(value: (/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "setVersion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetVersionUndefined: Self = StObject.set(x, "setVersion", js.undefined)
    
    @scala.inline
    def setToArray(value: () => Array): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
    
    @scala.inline
    def setToNumber(value: /* value */ js.UndefOr[Double] => Double): Self = StObject.set(x, "toNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumberUndefined: Self = StObject.set(x, "toNumber", js.undefined)
  }
}
