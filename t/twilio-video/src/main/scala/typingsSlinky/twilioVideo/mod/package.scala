package typingsSlinky.twilioVideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AudioLevel = scala.Double
  
  type NetworkQualityLevel = scala.Double
  
  @scala.inline
  def connect(token: java.lang.String): js.Promise[typingsSlinky.twilioVideo.mod.Room] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.Room]]
  @scala.inline
  def connect(token: java.lang.String, options: typingsSlinky.twilioVideo.mod.ConnectOptions): js.Promise[typingsSlinky.twilioVideo.mod.Room] = (typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.Room]]
  
  @scala.inline
  def createLocalAudioTrack(): js.Promise[typingsSlinky.twilioVideo.mod.LocalAudioTrack] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")().asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.LocalAudioTrack]]
  @scala.inline
  def createLocalAudioTrack(options: typingsSlinky.twilioVideo.mod.CreateLocalTrackOptions): js.Promise[typingsSlinky.twilioVideo.mod.LocalAudioTrack] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.LocalAudioTrack]]
  
  @scala.inline
  def createLocalTracks(): js.Promise[js.Array[typingsSlinky.twilioVideo.mod.LocalTrack]] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")().asInstanceOf[js.Promise[js.Array[typingsSlinky.twilioVideo.mod.LocalTrack]]]
  @scala.inline
  def createLocalTracks(options: typingsSlinky.twilioVideo.mod.CreateLocalTracksOptions): js.Promise[js.Array[typingsSlinky.twilioVideo.mod.LocalTrack]] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsSlinky.twilioVideo.mod.LocalTrack]]]
  
  @scala.inline
  def createLocalVideoTrack(): js.Promise[typingsSlinky.twilioVideo.mod.LocalVideoTrack] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")().asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.LocalVideoTrack]]
  @scala.inline
  def createLocalVideoTrack(options: typingsSlinky.twilioVideo.mod.CreateLocalTrackOptions): js.Promise[typingsSlinky.twilioVideo.mod.LocalVideoTrack] = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.twilioVideo.mod.LocalVideoTrack]]
  
  @scala.inline
  def isSupported: scala.Boolean = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].selectDynamic("isSupported").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def rewriteLocalTrackIds(
    room: typingsSlinky.twilioVideo.mod.Room,
    trackStats: js.Array[typingsSlinky.twilioVideo.mod.LocalTrackStats]
  ): js.Array[typingsSlinky.twilioVideo.mod.LocalTrackStats] = (typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteLocalTrackIds")(room.asInstanceOf[js.Any], trackStats.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.twilioVideo.mod.LocalTrackStats]]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.twilioVideo.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
