package typingsSlinky.xstream.fromDiagramMod

import typingsSlinky.xstream.mod.InternalProducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstream/extra/fromDiagram", "DiagramProducer")
@js.native
class DiagramProducer protected ()
  extends InternalProducer[js.Any] {
  def this(diagram: String) = this()
  def this(diagram: String, opt: FromDiagramOptions) = this()
  
  var diagram: js.Any = js.native
  
  var errorVal: js.Any = js.native
  
  var schedule: js.Any = js.native
  
  var tasks: js.Any = js.native
  
  var timeUnit: js.Any = js.native
  
  var values: js.Any = js.native
}
