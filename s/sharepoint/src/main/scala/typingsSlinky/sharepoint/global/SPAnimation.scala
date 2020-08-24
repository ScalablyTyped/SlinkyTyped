package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.SPAnimation.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPAnimation")
@js.native
object SPAnimation extends js.Object {
  @js.native
  class Object protected ()
    extends typingsSlinky.sharepoint.SPAnimation.Object {
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsSlinky.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsSlinky.sharepoint.SPAnimation.State
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit]
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: js.Array[HTMLElement],
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.UndefOr[scala.Nothing],
      data: js.Any
    ) = this()
    def this(
      animationID: ID,
      delay: Double,
      element: HTMLElement,
      finalState: typingsSlinky.sharepoint.SPAnimation.State,
      finishFunc: js.Function1[/* data */ js.Any, Unit],
      data: js.Any
    ) = this()
  }
  
  @js.native
  class Settings ()
    extends typingsSlinky.sharepoint.SPAnimation.Settings
  
  @js.native
  class State ()
    extends typingsSlinky.sharepoint.SPAnimation.State
  
  @js.native
  object Attribute extends js.Object {
    /* 2 */ val Height: typingsSlinky.sharepoint.SPAnimation.Attribute.Height with Double = js.native
    /* 4 */ val Opacity: typingsSlinky.sharepoint.SPAnimation.Attribute.Opacity with Double = js.native
    /* 0 */ val PositionX: typingsSlinky.sharepoint.SPAnimation.Attribute.PositionX with Double = js.native
    /* 1 */ val PositionY: typingsSlinky.sharepoint.SPAnimation.Attribute.PositionY with Double = js.native
    /* 3 */ val Width: typingsSlinky.sharepoint.SPAnimation.Attribute.Width with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPAnimation.Attribute with Double] = js.native
  }
  
  @js.native
  object ID extends js.Object {
    /* 2 */ val Basic_Fade: typingsSlinky.sharepoint.SPAnimation.ID.Basic_Fade with Double = js.native
    /* 3 */ val Basic_Move: typingsSlinky.sharepoint.SPAnimation.ID.Basic_Move with Double = js.native
    /* 14 */ val Basic_Opacity: typingsSlinky.sharepoint.SPAnimation.ID.Basic_Opacity with Double = js.native
    /* 16 */ val Basic_QuickFade: typingsSlinky.sharepoint.SPAnimation.ID.Basic_QuickFade with Double = js.native
    /* 15 */ val Basic_QuickShow: typingsSlinky.sharepoint.SPAnimation.ID.Basic_QuickShow with Double = js.native
    /* 21 */ val Basic_QuickSize: typingsSlinky.sharepoint.SPAnimation.ID.Basic_QuickSize with Double = js.native
    /* 0 */ val Basic_Show: typingsSlinky.sharepoint.SPAnimation.ID.Basic_Show with Double = js.native
    /* 4 */ val Basic_Size: typingsSlinky.sharepoint.SPAnimation.ID.Basic_Size with Double = js.native
    /* 1 */ val Basic_SlowShow: typingsSlinky.sharepoint.SPAnimation.ID.Basic_SlowShow with Double = js.native
    /* 18 */ val Basic_StrikeThrough: typingsSlinky.sharepoint.SPAnimation.ID.Basic_StrikeThrough with Double = js.native
    /* 17 */ val Content_SlideInFadeInGeneric: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideInFadeInGeneric with Double = js.native
    /* 8 */ val Content_SlideInFadeInLeft: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeft with Double = js.native
    /* 9 */ val Content_SlideInFadeInLeftInc: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideInFadeInLeftInc with Double = js.native
    /* 5 */ val Content_SlideInFadeInRight: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideInFadeInRight with Double = js.native
    /* 6 */ val Content_SlideInFadeInRightInc: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideInFadeInRightInc with Double = js.native
    /* 7 */ val Content_SlideOutFadeOutRight: typingsSlinky.sharepoint.SPAnimation.ID.Content_SlideOutFadeOutRight with Double = js.native
    /* 19 */ val SmallObject_SlideInFadeInBottom: typingsSlinky.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInBottom with Double = js.native
    /* 11 */ val SmallObject_SlideInFadeInLeft: typingsSlinky.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInLeft with Double = js.native
    /* 10 */ val SmallObject_SlideInFadeInTop: typingsSlinky.sharepoint.SPAnimation.ID.SmallObject_SlideInFadeInTop with Double = js.native
    /* 20 */ val SmallObject_SlideOutFadeOutBottom: typingsSlinky.sharepoint.SPAnimation.ID.SmallObject_SlideOutFadeOutBottom with Double = js.native
    /* 13 */ val Test_Hold: typingsSlinky.sharepoint.SPAnimation.ID.Test_Hold with Double = js.native
    /* 12 */ val Test_Instant: typingsSlinky.sharepoint.SPAnimation.ID.Test_Instant with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SPAnimation.ID with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Settings extends js.Object {
    def DisableAnimation(): Unit = js.native
    def DisableSessionAnimation(): Unit = js.native
    def IsAnimationEnabled(): Boolean = js.native
  }
  
}

