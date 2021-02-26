package typingsSlinky.semver

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  @JSImport("semver/functions/sort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver/functions/sort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver/functions/sort", JSImport.Namespace)
  @js.native
  def apply[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
}
