package typingsSlinky.semver

import typingsSlinky.semver.mod.Operator
import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cmpMod {
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: ^): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: String, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: ^): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/functions/cmp", JSImport.Namespace)
  @js.native
  def apply(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
}
