package typingsSlinky.webrtc

import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStream extends EventTarget {
  
  def addTrack(track: MediaStreamTrack): Unit = js.native
  
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getTrackById(trackId: String): MediaStreamTrack = js.native
  
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  
  def removeTrack(track: MediaStreamTrack): Unit = js.native
  
  def stop(): Unit = js.native
}
