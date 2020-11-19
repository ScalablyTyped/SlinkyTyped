package typingsSlinky.semver.mod

import typingsSlinky.semver.rangeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semver", "intersects")
@js.native
object intersects extends js.Object {
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  def apply(range1: String, range2: String): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: String, range2: ^): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: String, range2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: ^, range2: String): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(range1: ^, range2: ^): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(range1: ^, range2: ^, optionsOrLoose: Options): Boolean = js.native
}
