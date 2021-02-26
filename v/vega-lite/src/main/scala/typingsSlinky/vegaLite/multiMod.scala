package typingsSlinky.vegaLite

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.vegaLite.anon.On
import typingsSlinky.vegaLite.selectionMod.SelectionCompiler
import typingsSlinky.vegaLite.selectionMod.SelectionComponent
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.multi
import typingsSlinky.vegaLite.vegaLiteStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/multi", JSImport.Default)
  @js.native
  val default: SelectionCompiler[multi] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/multi", "singleOrMultiSignals")
  @js.native
  def singleOrMultiSignals(model: UnitModel, selCmpt: SelectionComponent[single | multi]): js.Array[On] = js.native
  
  type _To = SelectionCompiler[multi]
  
  /* This means you don't have to write `default`, but can instead just say `multiMod.foo` */
  override def _to: SelectionCompiler[multi] = default
}
