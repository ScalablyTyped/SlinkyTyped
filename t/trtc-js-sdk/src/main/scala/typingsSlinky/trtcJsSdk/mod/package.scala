package typingsSlinky.trtcJsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function1[/* event */ T, scala.Unit]
  
  type LocalAudioStats = typingsSlinky.trtcJsSdk.mod.SentMediaStats
  
  type LocalAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.LocalAudioStats]
  
  type LocalVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.LocalVideoStats]
  
  type Nullable[T] = T | scala.Null
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type RemoteAudioStats = typingsSlinky.trtcJsSdk.mod.ReceivedMediaStats
  
  type RemoteAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.RemoteAudioStats]
  
  type RemoteVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.RemoteVideoStats]
  
  @scala.inline
  def VERSION: java.lang.String = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def checkSystemRequirements(): js.Promise[scala.Boolean] = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[js.Promise[scala.Boolean]]
  
  @scala.inline
  def createClient(config: typingsSlinky.trtcJsSdk.mod.ClientConfig): typingsSlinky.trtcJsSdk.mod.Client = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.trtcJsSdk.mod.Client]
  
  @scala.inline
  def createStream(config: typingsSlinky.trtcJsSdk.mod.StreamConfig): typingsSlinky.trtcJsSdk.mod.LocalStream = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.trtcJsSdk.mod.LocalStream]
  
  @scala.inline
  def getCameras(): js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]] = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")().asInstanceOf[js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]]]
  
  @scala.inline
  def getDevices(): js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]] = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]]]
  
  @scala.inline
  def getMicrophones(): js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]] = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMicrophones")().asInstanceOf[js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]]]
  
  @scala.inline
  def getSpeakers(): js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]] = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSpeakers")().asInstanceOf[js.Promise[js.Array[org.scalajs.dom.experimental.mediastream.MediaDeviceInfo]]]
  
  @scala.inline
  def isScreenShareSupported(): scala.Boolean = typingsSlinky.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isScreenShareSupported")().asInstanceOf[scala.Boolean]
}
