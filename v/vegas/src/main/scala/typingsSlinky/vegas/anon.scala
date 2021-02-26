package typingsSlinky.vegas

import typingsSlinky.vegas.mod.AlignType
import typingsSlinky.vegas.mod.Animation
import typingsSlinky.vegas.mod.AnimationType
import typingsSlinky.vegas.mod.Duration
import typingsSlinky.vegas.mod.Settings
import typingsSlinky.vegas.mod.Slide
import typingsSlinky.vegas.mod.Transition
import typingsSlinky.vegas.mod.TransitionType
import typingsSlinky.vegas.vegasStrings.repeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<vegas.vegas.Settings> */
  @js.native
  trait ReadonlySettings extends StObject {
    
    val align: js.UndefOr[AlignType] = js.native
    
    val animation: js.UndefOr[AnimationType] = js.native
    
    val animationDuration: js.UndefOr[Duration] = js.native
    
    val animationRegister: js.UndefOr[js.Array[String]] = js.native
    
    val autoplay: js.UndefOr[Boolean] = js.native
    
    val color: js.UndefOr[String] = js.native
    
    val cover: js.UndefOr[Boolean | repeat] = js.native
    
    val delay: js.UndefOr[Double] = js.native
    
    val end: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    val firstTransition: js.UndefOr[TransitionType] = js.native
    
    val firstTransitionDuration: js.UndefOr[Duration] = js.native
    
    val init: js.UndefOr[js.Function1[/* settings */ Settings, Unit]] = js.native
    
    val loop: js.UndefOr[Boolean] = js.native
    
    val overlay: js.UndefOr[Boolean | String] = js.native
    
    val pause: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    val play: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    val preload: js.UndefOr[Boolean] = js.native
    
    val preloadImage: js.UndefOr[Boolean] = js.native
    
    val shuffle: js.UndefOr[Boolean] = js.native
    
    val slide: js.UndefOr[Double] = js.native
    
    val slides: js.UndefOr[js.Array[Slide]] = js.native
    
    val slidesToKeep: js.UndefOr[Double] = js.native
    
    val timer: js.UndefOr[Boolean] = js.native
    
    val transition: js.UndefOr[TransitionType] = js.native
    
    val transitionDuration: js.UndefOr[Duration] = js.native
    
    val transitionRegister: js.UndefOr[js.Array[String]] = js.native
    
    val valign: js.UndefOr[AlignType] = js.native
    
    val walk: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
  }
  object ReadonlySettings {
    
    @scala.inline
    def apply(): ReadonlySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySettings]
    }
    
    @scala.inline
    implicit class ReadonlySettingsMutableBuilder[Self <: ReadonlySettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDuration(value: Duration): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationRegister(value: js.Array[String]): Self = StObject.set(x, "animationRegister", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationRegisterUndefined: Self = StObject.set(x, "animationRegister", js.undefined)
      
      @scala.inline
      def setAnimationRegisterVarargs(value: String*): Self = StObject.set(x, "animationRegister", js.Array(value :_*))
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAnimationVarargs(value: Animation*): Self = StObject.set(x, "animation", js.Array(value :_*))
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCover(value: Boolean | repeat): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEnd(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFirstTransition(value: TransitionType): Self = StObject.set(x, "firstTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstTransitionDuration(value: Duration): Self = StObject.set(x, "firstTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstTransitionDurationUndefined: Self = StObject.set(x, "firstTransitionDuration", js.undefined)
      
      @scala.inline
      def setFirstTransitionUndefined: Self = StObject.set(x, "firstTransition", js.undefined)
      
      @scala.inline
      def setFirstTransitionVarargs(value: Transition*): Self = StObject.set(x, "firstTransition", js.Array(value :_*))
      
      @scala.inline
      def setInit(value: /* settings */ Settings => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean | String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPause(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPlay(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadImage(value: Boolean): Self = StObject.set(x, "preloadImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadImageUndefined: Self = StObject.set(x, "preloadImage", js.undefined)
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      @scala.inline
      def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setSlides(value: js.Array[Slide]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToKeep(value: Double): Self = StObject.set(x, "slidesToKeep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToKeepUndefined: Self = StObject.set(x, "slidesToKeep", js.undefined)
      
      @scala.inline
      def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      @scala.inline
      def setSlidesVarargs(value: Slide*): Self = StObject.set(x, "slides", js.Array(value :_*))
      
      @scala.inline
      def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      @scala.inline
      def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDuration(value: Duration): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionRegister(value: js.Array[String]): Self = StObject.set(x, "transitionRegister", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionRegisterUndefined: Self = StObject.set(x, "transitionRegister", js.undefined)
      
      @scala.inline
      def setTransitionRegisterVarargs(value: String*): Self = StObject.set(x, "transitionRegister", js.Array(value :_*))
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTransitionVarargs(value: Transition*): Self = StObject.set(x, "transition", js.Array(value :_*))
      
      @scala.inline
      def setValign(value: AlignType): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      @scala.inline
      def setWalk(value: (/* index */ Double, /* slide */ Slide) => Unit): Self = StObject.set(x, "walk", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWalkUndefined: Self = StObject.set(x, "walk", js.undefined)
    }
  }
}
