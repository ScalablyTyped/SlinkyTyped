package typingsSlinky.sharp.mod

import typingsSlinky.sharp.anon.Current
import typingsSlinky.sharp.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheResult extends StObject {
  
  var files: Max = js.native
  
  var items: Max = js.native
  
  var memory: Current = js.native
}
object CacheResult {
  
  @scala.inline
  def apply(files: Max, items: Max, memory: Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResult]
  }
  
  @scala.inline
  implicit class CacheResultMutableBuilder[Self <: CacheResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: Max): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: Max): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Current): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
