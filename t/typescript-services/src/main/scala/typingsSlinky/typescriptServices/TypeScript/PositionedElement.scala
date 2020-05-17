package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedElement extends js.Object {
  var _element: js.Any = js.native
  var _fullStart: js.Any = js.native
  var _parent: js.Any = js.native
  def childAt(index: Double): PositionedElement = js.native
  def childCount(): Double = js.native
  def childEnd(child: ISyntaxElement): Double = js.native
  def childEndAt(index: Double): Double = js.native
  def childIndex(child: ISyntaxElement): Double = js.native
  def childStart(child: ISyntaxElement): Double = js.native
  def childStartAt(index: Double): Double = js.native
  def containingNode(): PositionedNode = js.native
  def element(): ISyntaxElement = js.native
  def end(): Double = js.native
  def fullEnd(): Double = js.native
  def fullStart(): Double = js.native
  def fullWidth(): Double = js.native
  def getPositionedChild(child: ISyntaxElement): PositionedElement = js.native
  def kind(): SyntaxKind = js.native
  def parent(): PositionedElement = js.native
  def parentElement(): ISyntaxElement = js.native
  def root(): PositionedNode = js.native
  def start(): Double = js.native
}

object PositionedElement {
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
    parent: () => PositionedElement,
    parentElement: () => ISyntaxElement,
    root: () => PositionedNode,
    start: () => Double
  ): PositionedElement = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), childEnd = js.Any.fromFunction1(childEnd), childEndAt = js.Any.fromFunction1(childEndAt), childIndex = js.Any.fromFunction1(childIndex), childStart = js.Any.fromFunction1(childStart), childStartAt = js.Any.fromFunction1(childStartAt), containingNode = js.Any.fromFunction0(containingNode), element = js.Any.fromFunction0(element), end = js.Any.fromFunction0(end), fullEnd = js.Any.fromFunction0(fullEnd), fullStart = js.Any.fromFunction0(fullStart), fullWidth = js.Any.fromFunction0(fullWidth), getPositionedChild = js.Any.fromFunction1(getPositionedChild), kind = js.Any.fromFunction0(kind), parent = js.Any.fromFunction0(parent), parentElement = js.Any.fromFunction0(parentElement), root = js.Any.fromFunction0(root), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[PositionedElement]
  }
  @scala.inline
  implicit class PositionedElementOps[Self <: PositionedElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_element(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fullStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fullStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_parent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildAt(value: Double => PositionedElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildEnd(value: ISyntaxElement => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildEndAt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childEndAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildIndex(value: ISyntaxElement => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildStart(value: ISyntaxElement => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildStartAt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childStartAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainingNode(value: () => PositionedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElement(value: () => ISyntaxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPositionedChild(value: ISyntaxElement => PositionedElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPositionedChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKind(value: () => SyntaxKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: () => PositionedElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentElement(value: () => ISyntaxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoot(value: () => PositionedNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

