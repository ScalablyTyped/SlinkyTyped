package typingsSlinky.webpackConfigUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefinedObjKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends undefined? never : P}[keyof T] */ js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsBooleans.`false`
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings._empty
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.`false`
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.webpackConfigUtils.webpackConfigUtilsNumbers.`0`
  */
  type Falsy = js.UndefOr[typingsSlinky.webpackConfigUtils.mod._Falsy | scala.Null]
  type NonEmptyObject[T, P /* <: typingsSlinky.webpackConfigUtils.mod.DefinedObjKeys[T] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ PP in P ]: T[PP]}
    */ typingsSlinky.webpackConfigUtils.webpackConfigUtilsStrings.NonEmptyObject with org.scalablytyped.runtime.TopLevel[T]
}
