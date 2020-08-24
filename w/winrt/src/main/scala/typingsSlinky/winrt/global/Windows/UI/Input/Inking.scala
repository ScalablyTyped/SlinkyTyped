package typingsSlinky.winrt.global.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking")
@js.native
object Inking extends js.Object {
  @js.native
  class InkDrawingAttributes ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkDrawingAttributes
  
  @js.native
  class InkManager ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkManager
  
  @js.native
  class InkRecognitionResult ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult
  
  @js.native
  class InkRecognizer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer
  
  @js.native
  class InkRecognizerContainer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizerContainer
  
  @js.native
  class InkStroke ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke
  
  @js.native
  class InkStrokeBuilder ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeBuilder
  
  @js.native
  class InkStrokeContainer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeContainer
  
  @js.native
  class InkStrokeRenderingSegment ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment
  
  @js.native
  object InkManipulationMode extends js.Object {
    /* 1 */ val erasing: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
    /* 0 */ val inking: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
    /* 2 */ val selecting: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
  }
  
  @js.native
  object InkRecognitionTarget extends js.Object {
    /* 0 */ val all: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
    /* 2 */ val recent: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
    /* 1 */ val selected: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
  }
  
  @js.native
  object PenTipShape extends js.Object {
    /* 0 */ val circle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
    /* 1 */ val rectangle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
  }
  
}

