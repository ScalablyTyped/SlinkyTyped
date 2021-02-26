package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionedSeparatedList extends PositionedElement {
  
  def list(): ISeparatedSyntaxList = js.native
}
object PositionedSeparatedList {
  
  @scala.inline
  def apply(
    _element: js.Any,
    _fullStart: js.Any,
    _parent: js.Any,
    childAt: Double => PositionedElement,
    childCount: () => Double,
    childEnd: ISyntaxElement => Double,
    childEndAt: Double => Double,
    childIndex: ISyntaxElement => Double,
    childStart: ISyntaxElement => Double,
    childStartAt: Double => Double,
    containingNode: () => PositionedNode,
    element: () => ISyntaxElement,
    end: () => Double,
    fullEnd: () => Double,
    fullStart: () => Double,
    fullWidth: () => Double,
    getPositionedChild: ISyntaxElement => PositionedElement,
    kind: () => SyntaxKind,
    list: () => ISeparatedSyntaxList,
    parent: () => PositionedElement,
    parentElement: () => ISyntaxElement,
    root: () => PositionedNode,
    start: () => Double
  ): PositionedSeparatedList = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), childEnd = js.Any.fromFunction1(childEnd), childEndAt = js.Any.fromFunction1(childEndAt), childIndex = js.Any.fromFunction1(childIndex), childStart = js.Any.fromFunction1(childStart), childStartAt = js.Any.fromFunction1(childStartAt), containingNode = js.Any.fromFunction0(containingNode), element = js.Any.fromFunction0(element), end = js.Any.fromFunction0(end), fullEnd = js.Any.fromFunction0(fullEnd), fullStart = js.Any.fromFunction0(fullStart), fullWidth = js.Any.fromFunction0(fullWidth), getPositionedChild = js.Any.fromFunction1(getPositionedChild), kind = js.Any.fromFunction0(kind), list = js.Any.fromFunction0(list), parent = js.Any.fromFunction0(parent), parentElement = js.Any.fromFunction0(parentElement), root = js.Any.fromFunction0(root), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[PositionedSeparatedList]
  }
  
  @scala.inline
  implicit class PositionedSeparatedListMutableBuilder[Self <: PositionedSeparatedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: () => ISeparatedSyntaxList): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
  }
}
