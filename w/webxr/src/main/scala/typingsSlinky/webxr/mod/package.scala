package typingsSlinky.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type XRAnchorSet = typingsSlinky.std.Set[typingsSlinky.webxr.mod.XRAnchor]
  
  type XREventHandler = typingsSlinky.std.EventHandlerNonNull
  
  type XRFrameRequestCallback = js.Function2[
    /* time */ typingsSlinky.std.DOMHighResTimeStamp, 
    /* frame */ typingsSlinky.webxr.mod.XRFrame, 
    scala.Unit
  ]
  
  type XRInputSourceArray = js.Array[typingsSlinky.webxr.mod.XRInputSource]
  
  type XRJointSpace = org.scalajs.dom.raw.EventTarget
  
  type XRLayer = org.scalajs.dom.raw.EventTarget
  
  type XRPlaneSet = typingsSlinky.std.Set[typingsSlinky.webxr.mod.XRPlane]
  
  type XRSpace = org.scalajs.dom.raw.EventTarget
}
