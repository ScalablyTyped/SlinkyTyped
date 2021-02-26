package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement extends HTMLMediaElement {
  
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  
  /**
    * Gets or sets the height of the video element.
    */
  var height: Double = js.native
  
  /**
    * Gets or sets the playsinline of the video element. for example, On iPhone, video elements will now be allowed to play inline, and will not automatically enter fullscreen mode when playback begins.
    */
  var playsInline: scala.Boolean = js.native
  
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoHeight: Double = js.native
  
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoWidth: Double = js.native
  
  /**
    * Gets or sets the width of the video element.
    */
  var width: Double = js.native
}
