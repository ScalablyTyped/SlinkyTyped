package typingsSlinky.spotifyWebPlaybackSdk

import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`0`
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`1`
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`2`
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ad
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.audio
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.episode
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.track
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spotify {
  
  type AddListenerFn = (js.Function2[/* event */ ready | not_ready, /* cb */ PlaybackInstanceListener, Unit]) with (js.Function2[player_state_changed, /* cb */ PlaybackStateListener, Unit]) with (js.Function2[/* event */ ErrorTypes, /* cb */ ErrorListener, Unit])
  
  @js.native
  trait Album extends StObject {
    
    var images: js.Array[Image] = js.native
    
    var name: String = js.native
    
    var uri: String = js.native
  }
  object Album {
    
    @scala.inline
    def apply(images: js.Array[Image], name: String, uri: String): Album = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Album]
    }
    
    @scala.inline
    implicit class AlbumMutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Artist extends StObject {
    
    var name: String = js.native
    
    var uri: String = js.native
  }
  object Artist {
    
    @scala.inline
    def apply(name: String, uri: String): Artist = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Artist]
    }
    
    @scala.inline
    implicit class ArtistMutableBuilder[Self <: Artist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var message: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorListener = js.Function1[/* err */ Error, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error
    - typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error
    - typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error
    - typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error
  */
  trait ErrorTypes extends StObject
  object ErrorTypes {
    
    @scala.inline
    def account_error: typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error = "account_error".asInstanceOf[typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error]
    
    @scala.inline
    def authentication_error: typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error = "authentication_error".asInstanceOf[typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error]
    
    @scala.inline
    def initialization_error: typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error = "initialization_error".asInstanceOf[typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error]
    
    @scala.inline
    def playback_error: typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error = "playback_error".asInstanceOf[typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error]
  }
  
  @js.native
  trait Image extends StObject {
    
    var height: js.UndefOr[Double | Null] = js.native
    
    var url: String = js.native
    
    var width: js.UndefOr[Double | Null] = js.native
  }
  object Image {
    
    @scala.inline
    def apply(url: String): Image = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PlaybackContext extends StObject {
    
    var metadata: js.Any = js.native
    
    var uri: String | Null = js.native
  }
  object PlaybackContext {
    
    @scala.inline
    def apply(metadata: js.Any): PlaybackContext = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackContext]
    }
    
    @scala.inline
    implicit class PlaybackContextMutableBuilder[Self <: PlaybackContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriNull: Self = StObject.set(x, "uri", null)
    }
  }
  
  @js.native
  trait PlaybackDisallows extends StObject {
    
    var pausing: Boolean = js.native
    
    var peeking_next: Boolean = js.native
    
    var peeking_prev: Boolean = js.native
    
    var resuming: Boolean = js.native
    
    var seeking: Boolean = js.native
    
    var skipping_next: Boolean = js.native
    
    var skipping_prev: Boolean = js.native
  }
  object PlaybackDisallows {
    
    @scala.inline
    def apply(
      pausing: Boolean,
      peeking_next: Boolean,
      peeking_prev: Boolean,
      resuming: Boolean,
      seeking: Boolean,
      skipping_next: Boolean,
      skipping_prev: Boolean
    ): PlaybackDisallows = {
      val __obj = js.Dynamic.literal(pausing = pausing.asInstanceOf[js.Any], peeking_next = peeking_next.asInstanceOf[js.Any], peeking_prev = peeking_prev.asInstanceOf[js.Any], resuming = resuming.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], skipping_next = skipping_next.asInstanceOf[js.Any], skipping_prev = skipping_prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackDisallows]
    }
    
    @scala.inline
    implicit class PlaybackDisallowsMutableBuilder[Self <: PlaybackDisallows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPausing(value: Boolean): Self = StObject.set(x, "pausing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeeking_next(value: Boolean): Self = StObject.set(x, "peeking_next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeeking_prev(value: Boolean): Self = StObject.set(x, "peeking_prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResuming(value: Boolean): Self = StObject.set(x, "resuming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeeking(value: Boolean): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipping_next(value: Boolean): Self = StObject.set(x, "skipping_next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipping_prev(value: Boolean): Self = StObject.set(x, "skipping_prev", value.asInstanceOf[js.Any])
    }
  }
  
  type PlaybackInstanceListener = js.Function1[/* inst */ WebPlaybackInstance, Unit]
  
  @js.native
  trait PlaybackRestrictions extends StObject {
    
    var disallow_pausing_reasons: js.Array[String] = js.native
    
    var disallow_peeking_next_reasons: js.Array[String] = js.native
    
    var disallow_peeking_prev_reasons: js.Array[String] = js.native
    
    var disallow_resuming_reasons: js.Array[String] = js.native
    
    var disallow_seeking_reasons: js.Array[String] = js.native
    
    var disallow_skipping_next_reasons: js.Array[String] = js.native
    
    var disallow_skipping_prev_reasons: js.Array[String] = js.native
  }
  object PlaybackRestrictions {
    
    @scala.inline
    def apply(
      disallow_pausing_reasons: js.Array[String],
      disallow_peeking_next_reasons: js.Array[String],
      disallow_peeking_prev_reasons: js.Array[String],
      disallow_resuming_reasons: js.Array[String],
      disallow_seeking_reasons: js.Array[String],
      disallow_skipping_next_reasons: js.Array[String],
      disallow_skipping_prev_reasons: js.Array[String]
    ): PlaybackRestrictions = {
      val __obj = js.Dynamic.literal(disallow_pausing_reasons = disallow_pausing_reasons.asInstanceOf[js.Any], disallow_peeking_next_reasons = disallow_peeking_next_reasons.asInstanceOf[js.Any], disallow_peeking_prev_reasons = disallow_peeking_prev_reasons.asInstanceOf[js.Any], disallow_resuming_reasons = disallow_resuming_reasons.asInstanceOf[js.Any], disallow_seeking_reasons = disallow_seeking_reasons.asInstanceOf[js.Any], disallow_skipping_next_reasons = disallow_skipping_next_reasons.asInstanceOf[js.Any], disallow_skipping_prev_reasons = disallow_skipping_prev_reasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackRestrictions]
    }
    
    @scala.inline
    implicit class PlaybackRestrictionsMutableBuilder[Self <: PlaybackRestrictions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisallow_pausing_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_pausing_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_pausing_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_pausing_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_peeking_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_next_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_peeking_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_next_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_peeking_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_peeking_prev_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_peeking_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_peeking_prev_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_resuming_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_resuming_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_resuming_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_resuming_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_seeking_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_seeking_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_seeking_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_seeking_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_skipping_next_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_next_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_skipping_next_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_next_reasons", js.Array(value :_*))
      
      @scala.inline
      def setDisallow_skipping_prev_reasons(value: js.Array[String]): Self = StObject.set(x, "disallow_skipping_prev_reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallow_skipping_prev_reasonsVarargs(value: String*): Self = StObject.set(x, "disallow_skipping_prev_reasons", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PlaybackState extends StObject {
    
    var context: PlaybackContext = js.native
    
    var disallows: PlaybackDisallows = js.native
    
    var duration: Double = js.native
    
    var paused: Boolean = js.native
    
    var position: Double = js.native
    
    /**
      * 0: NO_REPEAT
      * 1: ONCE_REPEAT
      * 2: FULL_REPEAT
      */
    var repeat_mode: `0` | `1` | `2` = js.native
    
    var restrictions: PlaybackRestrictions = js.native
    
    var shuffle: Boolean = js.native
    
    var track_window: PlaybackTrackWindow = js.native
  }
  object PlaybackState {
    
    @scala.inline
    def apply(
      context: PlaybackContext,
      disallows: PlaybackDisallows,
      duration: Double,
      paused: Boolean,
      position: Double,
      repeat_mode: `0` | `1` | `2`,
      restrictions: PlaybackRestrictions,
      shuffle: Boolean,
      track_window: PlaybackTrackWindow
    ): PlaybackState = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], disallows = disallows.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], track_window = track_window.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackState]
    }
    
    @scala.inline
    implicit class PlaybackStateMutableBuilder[Self <: PlaybackState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: PlaybackContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallows(value: PlaybackDisallows): Self = StObject.set(x, "disallows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat_mode(value: `0` | `1` | `2`): Self = StObject.set(x, "repeat_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictions(value: PlaybackRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_window(value: PlaybackTrackWindow): Self = StObject.set(x, "track_window", value.asInstanceOf[js.Any])
    }
  }
  
  type PlaybackStateListener = js.Function1[/* s */ PlaybackState, Unit]
  
  @js.native
  trait PlaybackTrackWindow extends StObject {
    
    var current_track: Track = js.native
    
    var next_tracks: js.Array[Track] = js.native
    
    var previous_tracks: js.Array[Track] = js.native
  }
  object PlaybackTrackWindow {
    
    @scala.inline
    def apply(current_track: Track, next_tracks: js.Array[Track], previous_tracks: js.Array[Track]): PlaybackTrackWindow = {
      val __obj = js.Dynamic.literal(current_track = current_track.asInstanceOf[js.Any], next_tracks = next_tracks.asInstanceOf[js.Any], previous_tracks = previous_tracks.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackTrackWindow]
    }
    
    @scala.inline
    implicit class PlaybackTrackWindowMutableBuilder[Self <: PlaybackTrackWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent_track(value: Track): Self = StObject.set(x, "current_track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_tracks(value: js.Array[Track]): Self = StObject.set(x, "next_tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_tracksVarargs(value: Track*): Self = StObject.set(x, "next_tracks", js.Array(value :_*))
      
      @scala.inline
      def setPrevious_tracks(value: js.Array[Track]): Self = StObject.set(x, "previous_tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious_tracksVarargs(value: Track*): Self = StObject.set(x, "previous_tracks", js.Array(value :_*))
    }
  }
  
  /* was `typeof SpotifyPlayer` */
  type Player = SpotifyPlayer
  
  @js.native
  trait PlayerInit extends StObject {
    
    def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit = js.native
    
    var name: String = js.native
    
    var volume: js.UndefOr[Double] = js.native
  }
  object PlayerInit {
    
    @scala.inline
    def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Unit, name: String): PlayerInit = {
      val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerInit]
    }
    
    @scala.inline
    implicit class PlayerInitMutableBuilder[Self <: PlayerInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Unit): Self = StObject.set(x, "getOAuthToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  @js.native
  trait SpotifyPlayer extends StObject {
    
    def addListener(event: ErrorTypes, cb: ErrorListener): Unit = js.native
    @JSName("addListener")
    var addListener_Original: AddListenerFn = js.native
    @JSName("addListener")
    def addListener_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
    @JSName("addListener")
    def addListener_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
    @JSName("addListener")
    def addListener_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
    
    def connect(): js.Promise[Boolean] = js.native
    
    def disconnect(): Unit = js.native
    
    def getCurrentState(): js.Promise[PlaybackState | Null] = js.native
    
    def getVolume(): js.Promise[Double] = js.native
    
    def nextTrack(): js.Promise[Unit] = js.native
    
    def on(event: ErrorTypes, cb: ErrorListener): Unit = js.native
    @JSName("on")
    var on_Original: AddListenerFn = js.native
    @JSName("on")
    def on_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
    @JSName("on")
    def on_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
    
    def pause(): js.Promise[Unit] = js.native
    
    def previousTrack(): js.Promise[Unit] = js.native
    
    def removeListener(event: ErrorTypes): Unit = js.native
    def removeListener(event: ErrorTypes, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_notready(event: not_ready): Unit = js.native
    @JSName("removeListener")
    def removeListener_notready(event: not_ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_playerstatechanged(event: player_state_changed): Unit = js.native
    @JSName("removeListener")
    def removeListener_playerstatechanged(event: player_state_changed, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready): Unit = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
    
    def resume(): js.Promise[Unit] = js.native
    
    def seek(pos_ms: Double): js.Promise[Unit] = js.native
    
    def setName(name: String): js.Promise[Unit] = js.native
    
    def setVolume(volume: Double): js.Promise[Unit] = js.native
    
    def togglePlay(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Track extends StObject {
    
    var album: Album = js.native
    
    var artists: js.Array[Artist] = js.native
    
    var id: String | Null = js.native
    
    var is_playable: Boolean = js.native
    
    var media_type: audio | video = js.native
    
    var name: String = js.native
    
    var `type`: track | episode | ad = js.native
    
    var uri: String = js.native
  }
  object Track {
    
    @scala.inline
    def apply(
      album: Album,
      artists: js.Array[Artist],
      is_playable: Boolean,
      media_type: audio | video,
      name: String,
      `type`: track | episode | ad,
      uri: String
    ): Track = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Track]
    }
    
    @scala.inline
    implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: Album): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtists(value: js.Array[Artist]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtistsVarargs(value: Artist*): Self = StObject.set(x, "artists", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: audio | video): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: track | episode | ad): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebPlaybackInstance extends StObject {
    
    var device_id: String = js.native
  }
  object WebPlaybackInstance {
    
    @scala.inline
    def apply(device_id: String): WebPlaybackInstance = {
      val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebPlaybackInstance]
    }
    
    @scala.inline
    implicit class WebPlaybackInstanceMutableBuilder[Self <: WebPlaybackInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    }
  }
}
