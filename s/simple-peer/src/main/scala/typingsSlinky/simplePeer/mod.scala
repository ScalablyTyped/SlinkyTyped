package typingsSlinky.simplePeer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.simplePeer.anon.Address
import typingsSlinky.simplePeer.simplePeerStrings.answer
import typingsSlinky.simplePeer.simplePeerStrings.offer
import typingsSlinky.simplePeer.simplePeerStrings.pranswer
import typingsSlinky.simplePeer.simplePeerStrings.rollback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  class ^ () extends Instance {
    def this(opts: Options) = this()
  }
  @JSImport("simple-peer", JSImport.Namespace)
  @js.native
  val ^ : SimplePeer = js.native
  
  @js.native
  trait Instance extends Duplex {
    
    def _debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
    // used for debug logging
    def _debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddstreamstream
    def addStream(stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddtracktrack-stream
    def addTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    def address(): Address = js.native
    
    // methods which are not documented
    val bufferSize: Double = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovestreamstream
    def removeStream(stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovetracktrack-stream
    def removeTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/blob/v9.6.1/index.js#L306
    def replaceTrack(oldTrack: MediaStreamTrack, newTrack: MediaStreamTrack, stream: MediaStream): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peersenddata
    def send(data: SimplePeerData): Unit = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peersignaldata
    def signal(data: String): Unit = js.native
    def signal(data: SignalData): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    // custom offer constraints (used by createOffer method)
    var answerConstraints: js.UndefOr[js.Object] = js.native
    
    // set to true if this is the initiating peer
    var channelConfig: js.UndefOr[js.Object] = js.native
    
    // custom webrtc data channel configuration (used by createDataChannel)
    var channelName: js.UndefOr[String] = js.native
    
    // custom webrtc data channel name
    var config: js.UndefOr[js.Object] = js.native
    
    // custom webrtc configuration (used by RTCPeerConnection constructor)
    var constraints: js.UndefOr[js.Object] = js.native
    
    var initiator: js.UndefOr[Boolean] = js.native
    
    // RTCPeerConnection/RTCSessionDescription/RTCIceCandidate
    var objectMode: js.UndefOr[Boolean] = js.native
    
    // custom webrtc video/voice constraints (used by RTCPeerConnection constructor)
    var offerConstraints: js.UndefOr[js.Object] = js.native
    
    // custom answer constraints (used by createAnswer method)
    var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.native
    
    // function to transform the generated SDP signaling data (for advanced users)
    var stream: js.UndefOr[MediaStream] = js.native
    
    // if video/voice is desired, pass stream returned from getUserMedia
    var trickle: js.UndefOr[Boolean] = js.native
    
    // set to false to disable trickle ICE and get a single 'signal' event (slower)
    var wrtc: js.UndefOr[js.Object] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswerConstraints(value: js.Object): Self = StObject.set(x, "answerConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnswerConstraintsUndefined: Self = StObject.set(x, "answerConstraints", js.undefined)
      
      @scala.inline
      def setChannelConfig(value: js.Object): Self = StObject.set(x, "channelConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelConfigUndefined: Self = StObject.set(x, "channelConfig", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setInitiator(value: Boolean): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setOfferConstraints(value: js.Object): Self = StObject.set(x, "offerConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfferConstraintsUndefined: Self = StObject.set(x, "offerConstraints", js.undefined)
      
      @scala.inline
      def setSdpTransform(value: /* sdp */ js.Any => _): Self = StObject.set(x, "sdpTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSdpTransformUndefined: Self = StObject.set(x, "sdpTransform", js.undefined)
      
      @scala.inline
      def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
      
      @scala.inline
      def setWrtc(value: js.Object): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  @js.native
  trait SignalData extends StObject {
    
    var candidate: js.UndefOr[js.Any] = js.native
    
    var sdp: js.UndefOr[js.Any] = js.native
    
    var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.native
  }
  object SignalData {
    
    @scala.inline
    def apply(): SignalData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignalData]
    }
    
    @scala.inline
    implicit class SignalDataMutableBuilder[Self <: SignalData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidate(value: js.Any): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidateUndefined: Self = StObject.set(x, "candidate", js.undefined)
      
      @scala.inline
      def setSdp(value: js.Any): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
      
      @scala.inline
      def setType(value: offer | pranswer | answer | rollback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // https://github.com/feross/simple-peer/tree/v6.1.5#peer--new-simplepeeropts
  @js.native
  trait SimplePeer
    extends Instantiable0[Instance]
       with Instantiable1[/* opts */ Options, Instance] {
    
    def apply(): Instance = js.native
    def apply(opts: Options): Instance = js.native
    
    // https://github.com/feross/simple-peer/tree/v6.1.5#peerwebrtc_support
    val WEBRTC_SUPPORT: Boolean = js.native
  }
  
  type SimplePeerData = String | Buffer | TypedArray | js.typedarray.ArrayBuffer | Blob
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  type _To = SimplePeer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SimplePeer = ^
}
