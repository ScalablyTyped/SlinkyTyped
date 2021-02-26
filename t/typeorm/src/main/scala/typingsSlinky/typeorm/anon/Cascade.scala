package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.typeormStrings.`soft-remove`
import typingsSlinky.typeorm.typeormStrings.insert
import typingsSlinky.typeorm.typeormStrings.recover
import typingsSlinky.typeorm.typeormStrings.remove
import typingsSlinky.typeorm.typeormStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cascade extends StObject {
  
  var cascade: js.UndefOr[Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])] = js.native
}
object Cascade {
  
  @scala.inline
  def apply(): Cascade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cascade]
  }
  
  @scala.inline
  implicit class CascadeMutableBuilder[Self <: Cascade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascade(value: Boolean | (js.Array[insert | update | remove | `soft-remove` | recover])): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    @scala.inline
    def setCascadeVarargs(value: (insert | update | remove | `soft-remove` | recover)*): Self = StObject.set(x, "cascade", js.Array(value :_*))
  }
}
