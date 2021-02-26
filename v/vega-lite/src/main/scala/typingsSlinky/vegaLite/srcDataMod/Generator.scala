package typingsSlinky.vegaLite.srcDataMod

import typingsSlinky.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaLite.srcDataMod.SequenceGenerator
  - typingsSlinky.vegaLite.srcDataMod.SphereGenerator
  - typingsSlinky.vegaLite.srcDataMod.GraticuleGenerator
*/
trait Generator extends Data
object Generator {
  
  @scala.inline
  def GraticuleGenerator(graticule: `true` | GraticuleParams): typingsSlinky.vegaLite.srcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.GraticuleGenerator]
  }
  
  @scala.inline
  def SequenceGenerator(sequence: SequenceParams): typingsSlinky.vegaLite.srcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.SequenceGenerator]
  }
  
  @scala.inline
  def SphereGenerator(sphere: `true` | js.Object): typingsSlinky.vegaLite.srcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.srcDataMod.SphereGenerator]
  }
}
