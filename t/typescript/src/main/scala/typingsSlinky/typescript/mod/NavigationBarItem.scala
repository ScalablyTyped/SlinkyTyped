package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navigation bar interface designed for visual studio's dual-column layout.
  * This does not form a proper tree.
  * The navbar is returned as a list of top-level items, each of which has a list of child items.
  * Child items always have an empty array for their `childItems`.
  */
@js.native
trait NavigationBarItem extends StObject {
  
  var bolded: Boolean = js.native
  
  var childItems: js.Array[NavigationBarItem] = js.native
  
  var grayed: Boolean = js.native
  
  var indent: Double = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: java.lang.String = js.native
  
  var spans: js.Array[TextSpan] = js.native
  
  var text: java.lang.String = js.native
}
object NavigationBarItem {
  
  @scala.inline
  def apply(
    bolded: Boolean,
    childItems: js.Array[NavigationBarItem],
    grayed: Boolean,
    indent: Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded.asInstanceOf[js.Any], childItems = childItems.asInstanceOf[js.Any], grayed = grayed.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarItem]
  }
  
  @scala.inline
  implicit class NavigationBarItemMutableBuilder[Self <: NavigationBarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBolded(value: Boolean): Self = StObject.set(x, "bolded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItems(value: js.Array[NavigationBarItem]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItemsVarargs(value: NavigationBarItem*): Self = StObject.set(x, "childItems", js.Array(value :_*))
    
    @scala.inline
    def setGrayed(value: Boolean): Self = StObject.set(x, "grayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpans(value: js.Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpansVarargs(value: TextSpan*): Self = StObject.set(x, "spans", js.Array(value :_*))
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
