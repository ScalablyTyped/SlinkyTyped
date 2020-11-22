package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webXRMod {
  
  type XRAnchorSet = typingsSlinky.std.Set[typingsSlinky.three.webXRMod.XRAnchor]
  
  type XRAnimationLoopCallback = js.Function2[
    /* time */ scala.Double, 
    /* frame */ js.UndefOr[typingsSlinky.three.webXRMod.XRFrame], 
    scala.Unit
  ]
  
  type XRFrameRequestCallback = js.Function2[
    /* time */ scala.Double, 
    /* frame */ typingsSlinky.three.webXRMod.XRFrame, 
    scala.Unit
  ]
  
  type XRJointSpace = org.scalajs.dom.raw.EventTarget
  
  type XRPlaneSet = typingsSlinky.std.Set[typingsSlinky.three.webXRMod.XRPlane]
  
  type XRSpace = org.scalajs.dom.raw.EventTarget
}
