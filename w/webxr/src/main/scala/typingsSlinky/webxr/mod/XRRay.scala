package typingsSlinky.webxr.mod

import typingsSlinky.std.DOMPointInit
import typingsSlinky.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webxr", "XRRay")
@js.native
class XRRay protected () extends js.Object {
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform, direction: DOMPointInit) = this()
  
  var direction: DOMPointReadOnly = js.native
  
  var matrix: js.typedarray.Float32Array = js.native
  
  var origin: DOMPointReadOnly = js.native
}
