package typingsSlinky.webpackConfigUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-config-utils", "getIfUtils")
  @js.native
  def getIfUtils[E /* <: EnvVars | String */](env: E): IfUtils = js.native
  @JSImport("webpack-config-utils", "getIfUtils")
  @js.native
  def getIfUtils[E /* <: EnvVars | String */](env: E, vars: js.Array[EnvVars | String]): IfUtils = js.native
  @JSImport("webpack-config-utils", "getIfUtils")
  @js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.getIfUtils with TopLevel[js.Any]
  ): IfUtils = js.native
  @JSImport("webpack-config-utils", "getIfUtils")
  @js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.getIfUtils with TopLevel[js.Any],
    vars: js.Array[EnvVars | String]
  ): IfUtils = js.native
  
  @JSImport("webpack-config-utils", "propIf")
  @js.native
  def propIf[I](a: js.Any, value: I, alternate: js.Any): I = js.native
  @JSImport("webpack-config-utils", "propIf")
  @js.native
  def propIf[E](a: Falsy, value: js.Any, alternate: E): E = js.native
  
  @JSImport("webpack-config-utils", "propIfNot")
  @js.native
  def propIfNot[E](a: js.Any, value: js.Any, alternate: E): E = js.native
  @JSImport("webpack-config-utils", "propIfNot")
  @js.native
  def propIfNot[I](a: Falsy, value: I, alternate: js.Any): I = js.native
  
  @JSImport("webpack-config-utils", "removeEmpty")
  @js.native
  def removeEmpty[T](
    input: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.removeEmpty with TopLevel[T]
  ): NonEmptyObject[T, DefinedObjKeys[T]] = js.native
  @JSImport("webpack-config-utils", "removeEmpty")
  @js.native
  def removeEmpty[T](input: js.Array[js.UndefOr[T]]): js.Array[T] = js.native
  
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.production
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.prod
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.test
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.development
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.dev
  */
  trait EnvVars extends StObject
  object EnvVars {
    
    @scala.inline
    def dev: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.dev = "dev".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.dev]
    
    @scala.inline
    def development: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.development = "development".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.development]
    
    @scala.inline
    def prod: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.prod = "prod".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.prod]
    
    @scala.inline
    def production: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.production = "production".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.production]
    
    @scala.inline
    def test: typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.test = "test".asInstanceOf[typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.test]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings._empty
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.`false`
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  @js.native
  trait IfUtils extends /* key */ StringDictionary[IfUtilsFn] {
    
    def ifDev(): Boolean = js.native
    def ifDev[Y, N](value: Y): Y | N = js.native
    def ifDev[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifDev")
    var ifDev_Original: IfUtilsFn = js.native
    
    def ifDevelopment(): Boolean = js.native
    def ifDevelopment[Y, N](value: Y): Y | N = js.native
    def ifDevelopment[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifDevelopment")
    var ifDevelopment_Original: IfUtilsFn = js.native
    
    def ifNotDev(): Boolean = js.native
    def ifNotDev[Y, N](value: Y): Y | N = js.native
    def ifNotDev[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifNotDev")
    var ifNotDev_Original: IfUtilsFn = js.native
    
    def ifNotDevelopment(): Boolean = js.native
    def ifNotDevelopment[Y, N](value: Y): Y | N = js.native
    def ifNotDevelopment[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifNotDevelopment")
    var ifNotDevelopment_Original: IfUtilsFn = js.native
    
    def ifNotProd(): Boolean = js.native
    def ifNotProd[Y, N](value: Y): Y | N = js.native
    def ifNotProd[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifNotProd")
    var ifNotProd_Original: IfUtilsFn = js.native
    
    def ifNotProduction(): Boolean = js.native
    def ifNotProduction[Y, N](value: Y): Y | N = js.native
    def ifNotProduction[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifNotProduction")
    var ifNotProduction_Original: IfUtilsFn = js.native
    
    def ifNotTest(): Boolean = js.native
    def ifNotTest[Y, N](value: Y): Y | N = js.native
    def ifNotTest[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifNotTest")
    var ifNotTest_Original: IfUtilsFn = js.native
    
    def ifProd(): Boolean = js.native
    def ifProd[Y, N](value: Y): Y | N = js.native
    def ifProd[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifProd")
    var ifProd_Original: IfUtilsFn = js.native
    
    def ifProduction(): Boolean = js.native
    def ifProduction[Y, N](value: Y): Y | N = js.native
    def ifProduction[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifProduction")
    var ifProduction_Original: IfUtilsFn = js.native
    
    def ifTest(): Boolean = js.native
    def ifTest[Y, N](value: Y): Y | N = js.native
    def ifTest[Y, N](value: Y, alternate: N): Y | N = js.native
    @JSName("ifTest")
    var ifTest_Original: IfUtilsFn = js.native
  }
  
  @js.native
  trait IfUtilsFn extends StObject {
    
    def apply(): Boolean = js.native
    def apply[Y, N](value: Y): Y | N = js.native
    def apply[Y, N](value: Y, alternate: N): Y | N = js.native
  }
  
  type NonEmptyObject[T, P /* <: DefinedObjKeys[T] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.NonEmptyObject with TopLevel[T]
  
  trait _Falsy extends StObject
}
