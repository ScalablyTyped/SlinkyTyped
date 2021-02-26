package typingsSlinky.youtubePlayer

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.ENDED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PAUSED
import typingsSlinky.youtubePlayer.playerStatesMod.PlayerStates.PLAYING
import typingsSlinky.youtubePlayer.typesMod.Options
import typingsSlinky.youtubePlayer.typesMod.YouTubePlayer
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`false`
import typingsSlinky.youtubePlayer.youtubePlayerBooleans.`true`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`0`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`1`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3000`
import typingsSlinky.youtubePlayer.youtubePlayerNumbers.`3`
import typingsSlinky.youtubePlayer.youtubePlayerStrings.playlist
import typingsSlinky.youtubePlayer.youtubePlayerStrings.red
import typingsSlinky.youtubePlayer.youtubePlayerStrings.search
import typingsSlinky.youtubePlayer.youtubePlayerStrings.user_uploads
import typingsSlinky.youtubePlayer.youtubePlayerStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AcceptableStates extends StObject {
    
    var acceptableStates: js.Tuple2[ENDED, PAUSED] = js.native
    
    var stateChangeRequired: `false` = js.native
  }
  object AcceptableStates {
    
    @scala.inline
    def apply(acceptableStates: js.Tuple2[ENDED, PAUSED], stateChangeRequired: `false`): AcceptableStates = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptableStates]
    }
    
    @scala.inline
    implicit class AcceptableStatesMutableBuilder[Self <: AcceptableStates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptableStates(value: js.Tuple2[ENDED, PAUSED]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateChangeRequired(value: `false`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Autoplay extends StObject {
    
    var autoplay: js.UndefOr[`0` | `1`] = js.native
    
    var cc_lang_pref: js.UndefOr[String] = js.native
    
    var cc_load_policy: js.UndefOr[`1`] = js.native
    
    var color: js.UndefOr[red | white] = js.native
    
    var controls: js.UndefOr[`0` | `1`] = js.native
    
    var disablekb: js.UndefOr[`0` | `1`] = js.native
    
    var enablejsapi: js.UndefOr[`0` | `1`] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var fs: js.UndefOr[`0` | `1`] = js.native
    
    var hl: js.UndefOr[String] = js.native
    
    var iv_load_policy: js.UndefOr[`1` | `3`] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var listType: js.UndefOr[playlist | search | user_uploads] = js.native
    
    var loop: js.UndefOr[`0` | `1`] = js.native
    
    var modestbranding: js.UndefOr[`1`] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var playlist: js.UndefOr[String] = js.native
    
    var playsinline: js.UndefOr[`0` | `1`] = js.native
    
    var rel: js.UndefOr[`0` | `1`] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var widget_referrer: js.UndefOr[String] = js.native
  }
  object Autoplay {
    
    @scala.inline
    def apply(): Autoplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoplay]
    }
    
    @scala.inline
    implicit class AutoplayMutableBuilder[Self <: Autoplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: `0` | `1`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setCc_lang_pref(value: String): Self = StObject.set(x, "cc_lang_pref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCc_lang_prefUndefined: Self = StObject.set(x, "cc_lang_pref", js.undefined)
      
      @scala.inline
      def setCc_load_policy(value: `1`): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
      
      @scala.inline
      def setColor(value: red | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setControls(value: `0` | `1`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setDisablekb(value: `0` | `1`): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
      
      @scala.inline
      def setEnablejsapi(value: `0` | `1`): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFs(value: `0` | `1`): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setIv_load_policy(value: `1` | `3`): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListType(value: playlist | search | user_uploads): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: `0` | `1`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setModestbranding(value: `1`): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      @scala.inline
      def setPlaysinline(value: `0` | `1`): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      @scala.inline
      def setRel(value: `0` | `1`): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setWidget_referrer(value: String): Self = StObject.set(x, "widget_referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidget_referrerUndefined: Self = StObject.set(x, "widget_referrer", js.undefined)
    }
  }
  
  /* Inlined std.CustomEvent<any> & {  data :number} */
  @js.native
  trait CustomEventanydatanumber extends StObject {
    
    val AT_TARGET: Double = js.native
    
    val BUBBLING_PHASE: Double = js.native
    
    val CAPTURING_PHASE: Double = js.native
    
    val NONE: Double = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
      */
    val bubbles: Boolean = js.native
    
    var cancelBubble: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
      */
    val cancelable: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
      */
    val composed: Boolean = js.native
    
    /**
      * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
      */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /**
      * Returns the object whose event listener's callback is currently being invoked.
      */
    val currentTarget: EventTarget | Null = js.native
    
    var data: Double = js.native
    
    /**
      * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
      */
    val defaultPrevented: Boolean = js.native
    
    /**
      * Returns any custom data event was created with. Typically used for synthetic events.
      */
    val detail: js.Any = js.native
    
    /**
      * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
      */
    val eventPhase: Double = js.native
    
    def initCustomEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, detailArg: js.Any): Unit = js.native
    
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    
    /**
      * Returns true if event was dispatched by the user agent, and false otherwise.
      */
    val isTrusted: Boolean = js.native
    
    /**
      * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
      */
    def preventDefault(): Unit = js.native
    
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    val srcElement: EventTarget | Null = js.native
    
    /**
      * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
      */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * Returns the object to which event is dispatched (its target).
      */
    val target: EventTarget | Null = js.native
    
    /**
      * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
      */
    val timeStamp: Double = js.native
    
    /**
      * Returns the type of event, e.g. "click", "hashchange", or "submit".
      */
    val `type`: String = js.native
  }
  
  @js.native
  trait EndSeconds extends StObject {
    
    var endSeconds: js.UndefOr[Double] = js.native
    
    var startSeconds: js.UndefOr[Double] = js.native
    
    var suggestedQuality: js.UndefOr[String] = js.native
    
    var videoId: String = js.native
  }
  object EndSeconds {
    
    @scala.inline
    def apply(videoId: String): EndSeconds = {
      val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndSeconds]
    }
    
    @scala.inline
    implicit class EndSecondsMutableBuilder[Self <: EndSeconds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      @scala.inline
      def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      @scala.inline
      def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
      
      @scala.inline
      def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var listType: String = js.native
    
    var startSeconds: js.UndefOr[Double] = js.native
    
    var suggestedQuality: js.UndefOr[String] = js.native
  }
  object Index {
    
    @scala.inline
    def apply(listType: String): Index = {
      val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListType(value: String): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      @scala.inline
      def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable2[/* elementId */ String, /* options */ Options, YouTubePlayer]
  
  @js.native
  trait MediaContentUrl extends StObject {
    
    var endSeconds: js.UndefOr[Double] = js.native
    
    var mediaContentUrl: String = js.native
    
    var startSeconds: js.UndefOr[Double] = js.native
    
    var suggestedQuality: js.UndefOr[String] = js.native
  }
  object MediaContentUrl {
    
    @scala.inline
    def apply(mediaContentUrl: String): MediaContentUrl = {
      val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaContentUrl]
    }
    
    @scala.inline
    implicit class MediaContentUrlMutableBuilder[Self <: MediaContentUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
      
      @scala.inline
      def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
      
      @scala.inline
      def setSuggestedQuality(value: String): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
    }
  }
  
  @js.native
  trait StateChangeRequired extends StObject {
    
    var acceptableStates: js.Tuple2[ENDED, PLAYING] = js.native
    
    var stateChangeRequired: `false` = js.native
  }
  object StateChangeRequired {
    
    @scala.inline
    def apply(acceptableStates: js.Tuple2[ENDED, PLAYING], stateChangeRequired: `false`): StateChangeRequired = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateChangeRequired]
    }
    
    @scala.inline
    implicit class StateChangeRequiredMutableBuilder[Self <: StateChangeRequired] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptableStates(value: js.Tuple2[ENDED, PLAYING]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateChangeRequired(value: `false`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Timeout extends StObject {
    
    var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED] = js.native
    
    var stateChangeRequired: `true` = js.native
    
    // TRICKY: `seekTo` may not cause a state change if no buffering is required.
    var timeout: `3000` = js.native
  }
  object Timeout {
    
    @scala.inline
    def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED], stateChangeRequired: `true`, timeout: `3000`): Timeout = {
      val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptableStates(value: js.Tuple3[ENDED, PLAYING, PAUSED]): Self = StObject.set(x, "acceptableStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateChangeRequired(value: `true`): Self = StObject.set(x, "stateChangeRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: `3000`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ eventType in youtube-player.youtube-player/dist/eventNames.EventType ]:? (event : std.CustomEvent<any>): void} */
  @js.native
  trait eventTypeinEventTypeevent extends StObject {
    
    var apiChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var error: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var playbackQualityChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var playbackRateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var ready: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var stateChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
    
    var volumeChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  }
  object eventTypeinEventTypeevent {
    
    @scala.inline
    def apply(): eventTypeinEventTypeevent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[eventTypeinEventTypeevent]
    }
    
    @scala.inline
    implicit class eventTypeinEventTypeeventMutableBuilder[Self <: eventTypeinEventTypeevent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "apiChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApiChangeUndefined: Self = StObject.set(x, "apiChange", js.undefined)
      
      @scala.inline
      def setError(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setPlaybackQualityChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "playbackQualityChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaybackQualityChangeUndefined: Self = StObject.set(x, "playbackQualityChange", js.undefined)
      
      @scala.inline
      def setPlaybackRateChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "playbackRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaybackRateChangeUndefined: Self = StObject.set(x, "playbackRateChange", js.undefined)
      
      @scala.inline
      def setReady(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      @scala.inline
      def setStateChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "stateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
      
      @scala.inline
      def setVolumeChange(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "volumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVolumeChangeUndefined: Self = StObject.set(x, "volumeChange", js.undefined)
    }
  }
}
