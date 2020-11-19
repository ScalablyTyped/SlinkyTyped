package typingsSlinky.semanticUiReact.gridGridMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.gridColumnMod.GridColumnProps
import typingsSlinky.semanticUiReact.gridRowMod.GridRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridComponent extends FunctionComponent[GridProps] {
  
  var Column: ReactComponentClass[GridColumnProps] = js.native
  
  var Row: ReactComponentClass[GridRowProps] = js.native
}
