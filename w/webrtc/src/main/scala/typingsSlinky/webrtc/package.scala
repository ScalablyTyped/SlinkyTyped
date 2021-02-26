package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webrtc {
  
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
  type DataChannelEventHandler[E /* <: org.scalajs.dom.raw.Event */] = (js.ThisFunction1[/* this */ typingsSlinky.webrtc.RTCDataChannel, /* ev */ E, js.Any]) | scala.Null
  
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
  type DtlsTransportEventHandler = (js.ThisFunction1[
    /* this */ typingsSlinky.webrtc.RTCDtlsTransport, 
    /* ev */ org.scalajs.dom.raw.Event, 
    js.Any
  ]) | scala.Null
  
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
  type IceTransportEventHandler = (js.ThisFunction1[
    /* this */ typingsSlinky.webrtc.RTCIceTransport, 
    /* ev */ org.scalajs.dom.raw.Event, 
    js.Any
  ]) | scala.Null
  
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ typingsSlinky.webrtc.MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ typingsSlinky.webrtc.MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ typingsSlinky.std.MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
  type PeerConnectionEventHandler[E /* <: org.scalajs.dom.raw.Event */] = (js.ThisFunction1[/* this */ typingsSlinky.webrtc.RTCPeerConnection, /* ev */ E, js.Any]) | scala.Null
  
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = typingsSlinky.webrtc.RTCConfiguration
}
