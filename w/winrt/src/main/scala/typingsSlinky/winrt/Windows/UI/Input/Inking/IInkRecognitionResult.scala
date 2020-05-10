package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkRecognitionResult extends js.Object {
  var boundingRect: Rect = js.native
  def getStrokes(): IVectorView[InkStroke] = js.native
  def getTextCandidates(): IVectorView[String] = js.native
}

object IInkRecognitionResult {
  @scala.inline
  def apply(
    boundingRect: Rect,
    getStrokes: () => IVectorView[InkStroke],
    getTextCandidates: () => IVectorView[String]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = js.Any.fromFunction0(getStrokes), getTextCandidates = js.Any.fromFunction0(getTextCandidates))
    __obj.asInstanceOf[IInkRecognitionResult]
  }
  @scala.inline
  implicit class IInkRecognitionResultOps[Self <: IInkRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStrokes(value: () => IVectorView[InkStroke]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextCandidates(value: () => IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextCandidates")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

