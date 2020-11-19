package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.SPAnimation.ID
import typingsSlinky.sharepoint.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPAnimationUtility")
@js.native
object SPAnimationUtility extends js.Object {
  
  @js.native
  class BasicAnimator ()
    extends typingsSlinky.sharepoint.SPAnimationUtility.BasicAnimator
  /* static members */
  @js.native
  object BasicAnimator extends js.Object {
    
    def CommonResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any,
      animationId: ID
    ): Unit = js.native
    
    def FadeIn(element: HTMLElement): Unit = js.native
    def FadeIn(element: HTMLElement, finishFunc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    def FadeIn(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = js.native
    
    def FadeOut(element: HTMLElement): Unit = js.native
    def FadeOut(element: HTMLElement, finishFunc: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    def FadeOut(element: HTMLElement, finishFunc: js.Function1[/* data */ js.Any, Unit], data: js.Any): Unit = js.native
    
    def GetLeftOffset(element: HTMLElement): Double = js.native
    
    def GetRightOffset(element: HTMLElement): Double = js.native
    
    def GetTopOffset(element: HTMLElement): Double = js.native
    
    def GetWindowScrollPosition(): X = js.native
    
    def IsPositioned(element: HTMLElement): Boolean = js.native
    
    def Move(element: HTMLElement, posX: Double, posY: Double): Unit = js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    def Move(
      element: HTMLElement,
      posX: Double,
      posY: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    def PositionAbsolute(element: HTMLElement): Unit = js.native
    
    def PositionAbsoluteExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    def PositionElement(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    def PositionRelative(element: HTMLElement): Unit = js.native
    
    def PositionRelativeExact(element: HTMLElement, topValue: Double, leftValue: Double, heightValue: Double, widthValue: Double): Unit = js.native
    
    def QuickResize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    def QuickResize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    def Resize(element: HTMLElement, newHeight: Double, newWidth: Double): Unit = js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    def Resize(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
    
    def ResizeContainerAndFillContent(
      element: HTMLElement,
      newHeight: Double,
      newWidth: Double,
      finishFunc: js.Function0[Unit],
      fAddToEnd: Boolean
    ): Unit = js.native
    
    def StrikeThrough(element: HTMLElement, strikeThroughWidth: Double): Unit = js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ): Unit = js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ): Unit = js.native
    def StrikeThrough(
      element: HTMLElement,
      strikeThroughWidth: Double,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ): Unit = js.native
  }
}
