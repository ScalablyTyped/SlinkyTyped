package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsNumbers.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends StObject {
  
  var build: `1.5` = js.native
  
  var repair: `1.5` = js.native
}
object Build {
  
  @scala.inline
  def apply(build: `1.5`, repair: `1.5`): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: `1.5`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepair(value: `1.5`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
