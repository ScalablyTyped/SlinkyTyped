package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
@js.native
trait NavigationTree extends StObject {
  
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.native
  
  var kind: ScriptElementKind = js.native
  
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String = js.native
  
  var nameSpan: js.UndefOr[TextSpan] = js.native
  
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan] = js.native
  
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String = js.native
}
object NavigationTree {
  
  @scala.inline
  def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTree]
  }
  
  @scala.inline
  implicit class NavigationTreeMutableBuilder[Self <: NavigationTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildItems(value: js.Array[NavigationTree]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
    
    @scala.inline
    def setChildItemsVarargs(value: NavigationTree*): Self = StObject.set(x, "childItems", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSpan(value: TextSpan): Self = StObject.set(x, "nameSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSpanUndefined: Self = StObject.set(x, "nameSpan", js.undefined)
    
    @scala.inline
    def setSpans(value: js.Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansVarargs(value: TextSpan*): Self = StObject.set(x, "spans", js.Array(value :_*))
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
