package typingsSlinky.semver

import typingsSlinky.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("semver/classes/range", JSImport.Namespace)
  @js.native
  class ^ protected () extends Range {
    def this(range: String) = this()
    def this(range: Range) = this()
    def this(range: String, optionsOrLoose: Boolean) = this()
    def this(range: String, optionsOrLoose: Options) = this()
    def this(range: Range, optionsOrLoose: Boolean) = this()
    def this(range: Range, optionsOrLoose: Options) = this()
  }
  
  @js.native
  trait Range extends StObject {
    
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
}
