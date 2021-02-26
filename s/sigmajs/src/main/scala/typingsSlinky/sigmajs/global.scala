package typingsSlinky.sigmajs

import org.scalajs.dom.raw.Element
import typingsSlinky.sigmajs.SigmaJs.CustomShapes
import typingsSlinky.sigmajs.SigmaJs.Sigma
import typingsSlinky.sigmajs.SigmaJs.SigmaConfigs
import typingsSlinky.sigmajs.SigmaJs.SigmaFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("CustomShapes")
  @js.native
  def CustomShapes: typingsSlinky.sigmajs.SigmaJs.CustomShapes = js.native
  @scala.inline
  def CustomShapes_=(x: CustomShapes): Unit = js.Dynamic.global.updateDynamic("CustomShapes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ShapeLibrary")
  @js.native
  def ShapeLibrary: CustomShapes = js.native
  @scala.inline
  def ShapeLibrary_=(x: CustomShapes): Unit = js.Dynamic.global.updateDynamic("ShapeLibrary")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("sigma")
  @js.native
  class sigma () extends Sigma {
    def this(configuration: SigmaConfigs) = this()
    def this(container: String) = this()
    def this(container: Element) = this()
  }
  @JSGlobal("sigma")
  @js.native
  def sigma: SigmaFactory = js.native
  @scala.inline
  def sigma_=(x: SigmaFactory): Unit = js.Dynamic.global.updateDynamic("sigma")(x.asInstanceOf[js.Any])
}
