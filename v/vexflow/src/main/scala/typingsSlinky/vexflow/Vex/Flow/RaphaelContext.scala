package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelContext extends IRenderContext {
  
  @JSName("glow")
  def glow_RaphaelContext(): RaphaelContext = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setLineWidth")
  def setLineWidth_RaphaelContext(width: Double): RaphaelContext = js.native
  
  def setViewBox(viewBox: String): Unit = js.native
}
