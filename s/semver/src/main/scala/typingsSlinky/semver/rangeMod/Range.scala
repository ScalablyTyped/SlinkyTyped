package typingsSlinky.semver.rangeMod

import typingsSlinky.semver.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends js.Object {
  
  def format(): String = js.native
  
  var includePrerelease: Boolean = js.native
  
  def inspect(): String = js.native
  
  def intersects(range: Range): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Boolean): Boolean = js.native
  def intersects(range: Range, optionsOrLoose: Options): Boolean = js.native
  
  var loose: Boolean = js.native
  
  var options: Options = js.native
  
  def parseRange(range: String): js.Array[typingsSlinky.semver.comparatorMod.^] = js.native
  
  var range: String = js.native
  
  var raw: String = js.native
  
  var set: js.Array[js.Array[typingsSlinky.semver.comparatorMod.^]] = js.native
  
  def test(version: String): Boolean = js.native
  def test(version: typingsSlinky.semver.semverMod.^): Boolean = js.native
}
