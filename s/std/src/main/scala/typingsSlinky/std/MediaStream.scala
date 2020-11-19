package typingsSlinky.std

import typingsSlinky.std.stdStrings.addtrack
import typingsSlinky.std.stdStrings.removetrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A stream of media content. A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of MediaStreamTrack. */
@js.native
trait MediaStream extends EventTarget {
  
  val active: scala.Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def addTrack(track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Unit = js.native
  
  def getAudioTracks(): js.Array[org.scalajs.dom.experimental.mediastream.MediaStreamTrack] = js.native
  
  def getTrackById(trackId: java.lang.String): org.scalajs.dom.experimental.mediastream.MediaStreamTrack | Null = js.native
  
  def getTracks(): js.Array[org.scalajs.dom.experimental.mediastream.MediaStreamTrack] = js.native
  
  def getVideoTracks(): js.Array[org.scalajs.dom.experimental.mediastream.MediaStreamTrack] = js.native
  
  val id: java.lang.String = js.native
  
  var onaddtrack: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
    _
  ]) | Null = js.native
  
  var onremovetrack: (js.ThisFunction1[
    /* this */ this.type, 
    /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
    _
  ]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ org.scalajs.dom.experimental.mediastream.MediaStreamTrackEvent, 
      _
    ],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  
  def removeTrack(track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Unit = js.native
}
