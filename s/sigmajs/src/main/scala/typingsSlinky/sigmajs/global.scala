package typingsSlinky.sigmajs

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsSlinky.sigmajs.SigmaJs.CustomShapes
import typingsSlinky.sigmajs.SigmaJs.Sigma
import typingsSlinky.sigmajs.SigmaJs.SigmaConfigs
import typingsSlinky.sigmajs.SigmaJs.SigmaFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class sigma () extends Sigma {
    def this(configuration: SigmaConfigs) = this()
    def this(container: String) = this()
    def this(container: Element) = this()
  }
  
  var CustomShapes: typingsSlinky.sigmajs.SigmaJs.CustomShapes = js.native
  var ShapeLibrary: CustomShapes = js.native
  @js.native
  object sigma extends TopLevel[SigmaFactory]
  
}

