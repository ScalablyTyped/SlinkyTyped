package typingsSlinky.wordpressBlocks.anon

import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var default: js.UndefOr[js.Array[_]] = js.native
  
  var `type`: array = js.native
}
object `1` {
  
  @scala.inline
  def apply(`type`: array): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Array[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDefaultVarargs(value: js.Any*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
