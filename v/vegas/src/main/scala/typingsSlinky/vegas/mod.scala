package typingsSlinky.vegas

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.Event
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.vegas.anon.ReadonlySettings
import typingsSlinky.vegas.mod.global.JQuery
import typingsSlinky.vegas.vegasStrings.auto
import typingsSlinky.vegas.vegasStrings.repeat
import typingsSlinky.vegas.vegasStrings.vegasend
import typingsSlinky.vegas.vegasStrings.vegasinit
import typingsSlinky.vegas.vegasStrings.vegaspause
import typingsSlinky.vegas.vegasStrings.vegasplay
import typingsSlinky.vegas.vegasStrings.vegaswalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.vegasStrings.center
    - typingsSlinky.vegas.vegasStrings.top
    - typingsSlinky.vegas.vegasStrings.right
    - typingsSlinky.vegas.vegasStrings.bottom
    - typingsSlinky.vegas.vegasStrings.left
    - scala.Double
  */
  type AlignType = _AlignType | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.vegasStrings.kenburns
    - typingsSlinky.vegas.vegasStrings.kenburnsLeft
    - typingsSlinky.vegas.vegasStrings.kenburnsRight
    - typingsSlinky.vegas.vegasStrings.kenburnsUp
    - typingsSlinky.vegas.vegasStrings.kenburnsUpLeft
    - typingsSlinky.vegas.vegasStrings.kenburnsUpRight
    - typingsSlinky.vegas.vegasStrings.kenburnsDown
    - typingsSlinky.vegas.vegasStrings.kenburnsDownLeft
    - typingsSlinky.vegas.vegasStrings.kenburnsDownRight
  */
  trait Animation extends _AnimationType
  object Animation {
    
    @scala.inline
    def kenburns: typingsSlinky.vegas.vegasStrings.kenburns = "kenburns".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburns]
    
    @scala.inline
    def kenburnsDown: typingsSlinky.vegas.vegasStrings.kenburnsDown = "kenburnsDown".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsDown]
    
    @scala.inline
    def kenburnsDownLeft: typingsSlinky.vegas.vegasStrings.kenburnsDownLeft = "kenburnsDownLeft".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsDownLeft]
    
    @scala.inline
    def kenburnsDownRight: typingsSlinky.vegas.vegasStrings.kenburnsDownRight = "kenburnsDownRight".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsDownRight]
    
    @scala.inline
    def kenburnsLeft: typingsSlinky.vegas.vegasStrings.kenburnsLeft = "kenburnsLeft".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsLeft]
    
    @scala.inline
    def kenburnsRight: typingsSlinky.vegas.vegasStrings.kenburnsRight = "kenburnsRight".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsRight]
    
    @scala.inline
    def kenburnsUp: typingsSlinky.vegas.vegasStrings.kenburnsUp = "kenburnsUp".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsUp]
    
    @scala.inline
    def kenburnsUpLeft: typingsSlinky.vegas.vegasStrings.kenburnsUpLeft = "kenburnsUpLeft".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsUpLeft]
    
    @scala.inline
    def kenburnsUpRight: typingsSlinky.vegas.vegasStrings.kenburnsUpRight = "kenburnsUpRight".asInstanceOf[typingsSlinky.vegas.vegasStrings.kenburnsUpRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.mod.Animation
    - typingsSlinky.vegas.vegasStrings.random
    - js.Array[typingsSlinky.vegas.mod.Animation]
  */
  type AnimationType = _AnimationType | js.Array[Animation]
  
  type Duration = auto | Double
  
  @js.native
  trait JQueryExtension extends StObject {
    
    def apply(): JQuery[HTMLElement] = js.native
    def apply(config: Settings): JQuery[HTMLElement] = js.native
    
    val defaults: ReadonlySettings = js.native
    
    def isVideoCompatible(): Boolean = js.native
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Horizontal alignment of the image in the slide.
      * Could be `center` `top` `right` `bottom` `left` or a percentage.
      * @default 'center'
      */
    var align: js.UndefOr[AlignType] = js.native
    
    /**
      * Set the animation of the slides.
      * Could be an animation name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animation: js.UndefOr[AnimationType] = js.native
    
    /**
      * Set the animation duration in milliseconds.
      * Could be `auto` so the animation duration will be equal to the slide delay .
      * @default 'auto'
      */
    var animationDuration: js.UndefOr[Duration] = js.native
    
    /**
      * Add custom animations to the animations list available in random mode.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animationRegister: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Start the Slideshow automatically.
      * @default true
      */
    var autoplay: js.UndefOr[Boolean] = js.native
    
    /**
      * Slide background color
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * `true` the slide image is scaled to fit the container.
      * `false` the slide image is displayed entirely.
      * `repeat` the slide image is repeated.
      * @default true
      */
    var cover: js.UndefOr[Boolean | repeat] = js.native
    
    /**
      * Delay beetween slides in milliseconds
      * @default 5_000
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Function called when the Slideshow is completed (loop: false).
      */
    var end: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    /**
      * Set the transition for the first played slide.
      * Could be a transition name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var firstTransition: js.UndefOr[TransitionType] = js.native
    
    /**
      * Set the transition duration in milliseconds for the first played slide.
      * Could be `auto` so the transition duration will be equal to the slide delay .
      */
    var firstTransitionDuration: js.UndefOr[Duration] = js.native
    
    /**
      * Function called when Vegas is applied to an element.
      */
    var init: js.UndefOr[js.Function1[/* settings */ this.type, Unit]] = js.native
    
    /**
      * Loop the Slideshow.
      * @default true
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * Display/hide the overlay.
      * Could be `true` `false` or the path of an overlay image pattern.
      * These image can be found in the overlays folder. Read the Overlay section for more information.
      * @default false
      */
    var overlay: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Function called when Vegas pauses the slideshow.
      */
    var pause: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    /**
      * Function called when Vegas starts to play the slideshow.
      */
    var play: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
    
    /**
      * Preload both images and videos at start.
      * @default false
      */
    var preload: js.UndefOr[Boolean] = js.native
    
    /**
      * Preload images at start. preload must be false .
      * @default false
      */
    var preloadImage: js.UndefOr[Boolean] = js.native
    
    /**
      * The array of slides is shuffled before.
      * @default false
      */
    var shuffle: js.UndefOr[Boolean] = js.native
    
    /**
      * Index number of initial slide.
      * @default 0
      */
    var slide: js.UndefOr[Double] = js.native
    
    /**
      * Array of slides
      * {@link http://vegas.jaysalvat.com/documentation/settings/#slide}
      */
    var slides: js.UndefOr[js.Array[Slide]] = js.native
    
    /**
      * Number of slides to keep in the background before removing it.
      * @default 1
      */
    var slidesToKeep: js.UndefOr[Double] = js.native
    
    /**
      * Display/hide timer bar.
      * The timer class is .vegas-timer-progress .
      * @default true
      */
    var timer: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the transition between slides.
      * Could be a transition name| random or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions}
      * @default 'fade'
      */
    var transition: js.UndefOr[TransitionType] = js.native
    
    /**
      * Set the transition duration in milliseconds.
      * Could be `auto` so the transition duration will be equal to the slide delay.
      * @default 1_000
      */
    var transitionDuration: js.UndefOr[Duration] = js.native
    
    /**
      * Add custom transitions to the transitions list available in random mode.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var transitionRegister: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Vertical alignment of the image in the slide.
      * Could be `center` `top` `right` `bottom` `left` or a percentage.
      * @default 'center'
      */
    var valign: js.UndefOr[AlignType] = js.native
    
    /**
      * Function called when Vegas changes the slide.
      */
    var walk: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
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
      def setInit(value: Settings => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
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
  
  @js.native
  trait Slide extends StObject {
    
    /**
      * Horizontal alignment of the image in the slide.
      * @default 'center'
      */
    var align: js.UndefOr[AlignType] = js.native
    
    /**
      * Set the animation of this slide.
      * Could be an animation name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animation: js.UndefOr[AnimationType] = js.native
    
    /**
      * Set the animation duration in milliseconds.
      * Could be `auto` so the animation duration will be equal to the slide delay .
      */
    var animationDuration: js.UndefOr[Duration] = js.native
    
    /**
      * Slide background color.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * `true` the background image is scaled to fit the container.
      * `false` the background image is displayed entirely.
      * @default true
      */
    var cover: js.UndefOr[Boolean] = js.native
    
    /**
      * Delay beetween slides in milliseconds.
      * @default 5_000
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Path of the image.
      */
    var src: js.UndefOr[String] = js.native
    
    /**
      * Set the transition of this slide.
      * Could be a transition name, random or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      * @default 'fade'
      */
    var transition: js.UndefOr[TransitionType] = js.native
    
    /**
      * Set the transition duration in milliseconds.
      * Could be `auto` so the transition duration will be equal to the slide delay .
      * @default 1_000
      */
    var transitionDuration: js.UndefOr[Double] = js.native
    
    /**
      * Vertical alignment of the image in the slide.
      * @default 'center'
      */
    var valing: js.UndefOr[AlignType] = js.native
    
    /**
      * {@link http://vegas.jaysalvat.com/documentation/settings/#videos}
      */
    var video: js.UndefOr[Video] = js.native
  }
  object Slide {
    
    @scala.inline
    def apply(): Slide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slide]
    }
    
    @scala.inline
    implicit class SlideMutableBuilder[Self <: Slide] (val x: Self) extends AnyVal {
      
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
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAnimationVarargs(value: Animation*): Self = StObject.set(x, "animation", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTransitionVarargs(value: Transition*): Self = StObject.set(x, "transition", js.Array(value :_*))
      
      @scala.inline
      def setValing(value: AlignType): Self = StObject.set(x, "valing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValingUndefined: Self = StObject.set(x, "valing", js.undefined)
      
      @scala.inline
      def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait Support extends StObject {
    
    val objectFit: Boolean = js.native
    
    val transition: Boolean = js.native
    
    val video: Boolean = js.native
  }
  object Support {
    
    @scala.inline
    def apply(objectFit: Boolean, transition: Boolean, video: Boolean): Support = {
      val __obj = js.Dynamic.literal(objectFit = objectFit.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Support]
    }
    
    @scala.inline
    implicit class SupportMutableBuilder[Self <: Support] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectFit(value: Boolean): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.vegasStrings.fade
    - typingsSlinky.vegas.vegasStrings.fade2
    - typingsSlinky.vegas.vegasStrings.blur
    - typingsSlinky.vegas.vegasStrings.blur2
    - typingsSlinky.vegas.vegasStrings.flash
    - typingsSlinky.vegas.vegasStrings.flash2
    - typingsSlinky.vegas.vegasStrings.negative
    - typingsSlinky.vegas.vegasStrings.negative2
    - typingsSlinky.vegas.vegasStrings.burn
    - typingsSlinky.vegas.vegasStrings.burn2
    - typingsSlinky.vegas.vegasStrings.slideLeft
    - typingsSlinky.vegas.vegasStrings.slideLeft2
    - typingsSlinky.vegas.vegasStrings.slideRight
    - typingsSlinky.vegas.vegasStrings.slideRight2
    - typingsSlinky.vegas.vegasStrings.slideUp
    - typingsSlinky.vegas.vegasStrings.slideUp2
    - typingsSlinky.vegas.vegasStrings.slideDown
    - typingsSlinky.vegas.vegasStrings.slideDown2
    - typingsSlinky.vegas.vegasStrings.zoomIn
    - typingsSlinky.vegas.vegasStrings.zoomIn2
    - typingsSlinky.vegas.vegasStrings.zoomOut
    - typingsSlinky.vegas.vegasStrings.zoomOut2
    - typingsSlinky.vegas.vegasStrings.swirlLeft
    - typingsSlinky.vegas.vegasStrings.swirlLeft2
    - typingsSlinky.vegas.vegasStrings.swirlRight
    - typingsSlinky.vegas.vegasStrings.swirlRight2
  */
  trait Transition extends _TransitionType
  object Transition {
    
    @scala.inline
    def blur: typingsSlinky.vegas.vegasStrings.blur = "blur".asInstanceOf[typingsSlinky.vegas.vegasStrings.blur]
    
    @scala.inline
    def blur2: typingsSlinky.vegas.vegasStrings.blur2 = "blur2".asInstanceOf[typingsSlinky.vegas.vegasStrings.blur2]
    
    @scala.inline
    def burn: typingsSlinky.vegas.vegasStrings.burn = "burn".asInstanceOf[typingsSlinky.vegas.vegasStrings.burn]
    
    @scala.inline
    def burn2: typingsSlinky.vegas.vegasStrings.burn2 = "burn2".asInstanceOf[typingsSlinky.vegas.vegasStrings.burn2]
    
    @scala.inline
    def fade: typingsSlinky.vegas.vegasStrings.fade = "fade".asInstanceOf[typingsSlinky.vegas.vegasStrings.fade]
    
    @scala.inline
    def fade2: typingsSlinky.vegas.vegasStrings.fade2 = "fade2".asInstanceOf[typingsSlinky.vegas.vegasStrings.fade2]
    
    @scala.inline
    def flash: typingsSlinky.vegas.vegasStrings.flash = "flash".asInstanceOf[typingsSlinky.vegas.vegasStrings.flash]
    
    @scala.inline
    def flash2: typingsSlinky.vegas.vegasStrings.flash2 = "flash2".asInstanceOf[typingsSlinky.vegas.vegasStrings.flash2]
    
    @scala.inline
    def negative: typingsSlinky.vegas.vegasStrings.negative = "negative".asInstanceOf[typingsSlinky.vegas.vegasStrings.negative]
    
    @scala.inline
    def negative2: typingsSlinky.vegas.vegasStrings.negative2 = "negative2".asInstanceOf[typingsSlinky.vegas.vegasStrings.negative2]
    
    @scala.inline
    def slideDown: typingsSlinky.vegas.vegasStrings.slideDown = "slideDown".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideDown]
    
    @scala.inline
    def slideDown2: typingsSlinky.vegas.vegasStrings.slideDown2 = "slideDown2".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideDown2]
    
    @scala.inline
    def slideLeft: typingsSlinky.vegas.vegasStrings.slideLeft = "slideLeft".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideLeft]
    
    @scala.inline
    def slideLeft2: typingsSlinky.vegas.vegasStrings.slideLeft2 = "slideLeft2".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideLeft2]
    
    @scala.inline
    def slideRight: typingsSlinky.vegas.vegasStrings.slideRight = "slideRight".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideRight]
    
    @scala.inline
    def slideRight2: typingsSlinky.vegas.vegasStrings.slideRight2 = "slideRight2".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideRight2]
    
    @scala.inline
    def slideUp: typingsSlinky.vegas.vegasStrings.slideUp = "slideUp".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideUp]
    
    @scala.inline
    def slideUp2: typingsSlinky.vegas.vegasStrings.slideUp2 = "slideUp2".asInstanceOf[typingsSlinky.vegas.vegasStrings.slideUp2]
    
    @scala.inline
    def swirlLeft: typingsSlinky.vegas.vegasStrings.swirlLeft = "swirlLeft".asInstanceOf[typingsSlinky.vegas.vegasStrings.swirlLeft]
    
    @scala.inline
    def swirlLeft2: typingsSlinky.vegas.vegasStrings.swirlLeft2 = "swirlLeft2".asInstanceOf[typingsSlinky.vegas.vegasStrings.swirlLeft2]
    
    @scala.inline
    def swirlRight: typingsSlinky.vegas.vegasStrings.swirlRight = "swirlRight".asInstanceOf[typingsSlinky.vegas.vegasStrings.swirlRight]
    
    @scala.inline
    def swirlRight2: typingsSlinky.vegas.vegasStrings.swirlRight2 = "swirlRight2".asInstanceOf[typingsSlinky.vegas.vegasStrings.swirlRight2]
    
    @scala.inline
    def zoomIn: typingsSlinky.vegas.vegasStrings.zoomIn = "zoomIn".asInstanceOf[typingsSlinky.vegas.vegasStrings.zoomIn]
    
    @scala.inline
    def zoomIn2: typingsSlinky.vegas.vegasStrings.zoomIn2 = "zoomIn2".asInstanceOf[typingsSlinky.vegas.vegasStrings.zoomIn2]
    
    @scala.inline
    def zoomOut: typingsSlinky.vegas.vegasStrings.zoomOut = "zoomOut".asInstanceOf[typingsSlinky.vegas.vegasStrings.zoomOut]
    
    @scala.inline
    def zoomOut2: typingsSlinky.vegas.vegasStrings.zoomOut2 = "zoomOut2".asInstanceOf[typingsSlinky.vegas.vegasStrings.zoomOut2]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.mod.Transition
    - typingsSlinky.vegas.vegasStrings.random
    - js.Array[typingsSlinky.vegas.mod.Transition]
  */
  type TransitionType = _TransitionType | js.Array[Transition]
  
  type VegasEnd = vegasend
  
  type VegasInitEvent = vegasinit
  
  type VegasInitHnalder[TElement] = TriggeredEvent[TElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement]
  
  type VegasPause = vegaspause
  
  type VegasPlay = vegasplay
  
  type VegasWalk = vegaswalk
  
  @js.native
  trait Video extends StObject {
    
    /**
      * @default false
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var mute: js.UndefOr[Boolean] = js.native
    
    /**
      * Path of the video.
      * Could be a string or an array of sources.
      */
    var src: String | js.Array[String] = js.native
  }
  object Video {
    
    @scala.inline
    def apply(src: String | js.Array[String]): Video = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    @scala.inline
    implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    }
  }
  
  trait _AlignType extends StObject
  
  trait _AnimationType extends StObject
  
  trait _TransitionType extends StObject
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      def on(
        events: VegasEnd,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(events: VegasInitEvent, handler: js.Function2[/* event */ Event, /* settings */ Settings, Unit]): this.type = js.native
      def on(
        events: VegasPause,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(
        events: VegasPlay,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(
        events: VegasWalk,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      
      def vegas(): JQuery[HTMLElement] = js.native
      def vegas(config: Settings): JQuery[HTMLElement] = js.native
      @JSName("vegas")
      var vegas_Original: JQueryExtension = js.native
    }
    
    @js.native
    trait JQueryStatic extends StObject {
      
      def vegas(): JQuery[HTMLElement] = js.native
      def vegas(config: Settings): JQuery[HTMLElement] = js.native
      @JSName("vegas")
      var vegas_Original: JQueryExtension = js.native
    }
  }
}
