package typingsSlinky.tern.ternMod

import typingsSlinky.tern.anon.End
import typingsSlinky.tern.ternStrings.global
import typingsSlinky.tern.ternStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefsQueryResult extends StObject {
  
  /** The name of the variable or property */
  var name: String = js.native
  
  var refs: js.Array[End] = js.native
  
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[global | local] = js.native
}
object RefsQueryResult {
  
  @scala.inline
  def apply(name: String, refs: js.Array[End]): RefsQueryResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
  
  @scala.inline
  implicit class RefsQueryResultMutableBuilder[Self <: RefsQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: js.Array[End]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefsVarargs(value: End*): Self = StObject.set(x, "refs", js.Array(value :_*))
    
    @scala.inline
    def setType(value: global | local): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
