package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtc {
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ typingsSlinky.webrtc.MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ typingsSlinky.webrtc.MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ typingsSlinky.std.MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = typingsSlinky.webrtc.RTCConfiguration
}
