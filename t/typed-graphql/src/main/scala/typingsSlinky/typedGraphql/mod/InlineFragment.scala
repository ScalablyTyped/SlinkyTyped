package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineFragment
  extends Node
     with Selection {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var selectionSet: SelectionSet = js.native
  
  var typeCondition: js.UndefOr[NamedType] = js.native
}
object InlineFragment {
  
  @scala.inline
  def apply(kind: String, selectionSet: SelectionSet): InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragment]
  }
  
  @scala.inline
  implicit class InlineFragmentMutableBuilder[Self <: InlineFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCondition(value: NamedType): Self = StObject.set(x, "typeCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeConditionUndefined: Self = StObject.set(x, "typeCondition", js.undefined)
  }
}
