package typingsSlinky.semver.comparatorMod

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverStrings.Equalssign
import typingsSlinky.semver.semverStrings.Greaterthansign
import typingsSlinky.semver.semverStrings.GreaterthansignEqualssign
import typingsSlinky.semver.semverStrings.Lessthansign
import typingsSlinky.semver.semverStrings.LessthansignEqualssign
import typingsSlinky.semver.semverStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparator extends js.Object {
  
  def intersects(comp: Comparator): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
  
  var loose: Boolean = js.native
  
  var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
  
  var options: Options = js.native
  
  def parse(comp: String): Unit = js.native
  
  var semver: typingsSlinky.semver.semverMod.^ = js.native
  
  def test(version: String): Boolean = js.native
  def test(version: typingsSlinky.semver.semverMod.^): Boolean = js.native
  
  var value: String = js.native
}
