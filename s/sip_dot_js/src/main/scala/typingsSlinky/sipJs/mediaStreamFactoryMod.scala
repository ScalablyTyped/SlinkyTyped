package typingsSlinky.sipJs

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import typingsSlinky.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaStreamFactoryMod {
  
  type MediaStreamFactory = js.Function2[
    /* constraints */ MediaStreamConstraints, 
    /* sessionDescriptionHandler */ SessionDescriptionHandler, 
    js.Promise[MediaStream]
  ]
}
