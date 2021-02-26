package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.TextTrack.Mode
import typingsSlinky.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of this class.
  *
  * @param options={}
  *        Object of option names and values
  *
  * @param options.tech
  *        A reference to the tech that owns this TextTrack.
  *
  * @param [options.kind='subtitles']
  *        A valid text track kind.
  *
  * @param [options.mode='disabled']
  *        A valid text track mode.
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this TextTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.srclang='']
  *        A valid two character language code. An alternative, but deprioritized
  *        version of `options.language`
  *
  * @param [options.src]
  *        A url to TextTrack cues.
  *
  * @param [options.default]
  *        If this track should default to on or off.
  */
@js.native
trait TextTrack extends Track {
  
  /**
    * If this track was set to be on or off by default. Cannot be changed after creation.
    */
  val default: Boolean = js.native
  
  /**
    * The list text track cues that are currently active for this TextTrack.
    */
  var activeCues: TextTrackCueList = js.native
  
  /**
    * Add a cue to the internal list of cues.
    *
    * @param cue
    *        The cue to add to our internal list
    */
  def addCue(cue: TextTrackCue): Unit = js.native
  
  /**
    * @The text track cue list for this TextTrack.
    */
  var cues: TextTrackCueList = js.native
  
  /**
    * Set the mode of this TextTrack to a valid {@link TextTrack~Mode}. Will
    * not be set if setting to an invalid mode.
    * @fires TextTrack#modechange
    */
  var mode: Mode = js.native
  
  /**
    * Remove a cue from our internal list
    *
    * @param cue
    *        The cue to remove from our internal list
    */
  def removeCue(cue: TextTrackCue): Unit = js.native
}
object TextTrack {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.videoJs.videoJsStrings.subtitles
    - typingsSlinky.videoJs.videoJsStrings.captions
    - typingsSlinky.videoJs.videoJsStrings.descriptions
    - typingsSlinky.videoJs.videoJsStrings.chapters
    - typingsSlinky.videoJs.videoJsStrings.metadata
  */
  trait Kind extends StObject
  object Kind {
    
    @scala.inline
    def captions: typingsSlinky.videoJs.videoJsStrings.captions = "captions".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.captions]
    
    @scala.inline
    def chapters: typingsSlinky.videoJs.videoJsStrings.chapters = "chapters".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.chapters]
    
    @scala.inline
    def descriptions: typingsSlinky.videoJs.videoJsStrings.descriptions = "descriptions".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.descriptions]
    
    @scala.inline
    def metadata: typingsSlinky.videoJs.videoJsStrings.metadata = "metadata".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.metadata]
    
    @scala.inline
    def subtitles: typingsSlinky.videoJs.videoJsStrings.subtitles = "subtitles".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.subtitles]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.videoJs.videoJsStrings.disabled
    - typingsSlinky.videoJs.videoJsStrings.hidden
    - typingsSlinky.videoJs.videoJsStrings.showing
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def disabled: typingsSlinky.videoJs.videoJsStrings.disabled = "disabled".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.disabled]
    
    @scala.inline
    def hidden: typingsSlinky.videoJs.videoJsStrings.hidden = "hidden".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.hidden]
    
    @scala.inline
    def showing: typingsSlinky.videoJs.videoJsStrings.showing = "showing".asInstanceOf[typingsSlinky.videoJs.videoJsStrings.showing]
  }
}
