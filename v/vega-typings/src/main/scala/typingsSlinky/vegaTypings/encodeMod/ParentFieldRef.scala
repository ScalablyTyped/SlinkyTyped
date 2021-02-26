package typingsSlinky.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentFieldRef extends _Field {
  
  var level: js.UndefOr[Double] = js.native
  
  var parent: Field = js.native
}
object ParentFieldRef {
  
  @scala.inline
  def apply(parent: Field): ParentFieldRef = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentFieldRef]
  }
  
  @scala.inline
  implicit class ParentFieldRefMutableBuilder[Self <: ParentFieldRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setParent(value: Field): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
