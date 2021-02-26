package typingsSlinky.webgme.anon

import typingsSlinky.webgme.GmeCommon.DefIntegerObject
import typingsSlinky.webgme.GmeCommon.DefStringObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
  var level: DefIntegerObject = js.native
  
  var name: DefStringObject = js.native
}
object Level {
  
  @scala.inline
  def apply(level: DefIntegerObject, name: DefStringObject): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: DefIntegerObject): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DefStringObject): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
