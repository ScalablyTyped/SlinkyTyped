package typingsSlinky.vscodeNotebookRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VSCodeEvent[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[typingsSlinky.vscodeNotebookRenderer.mod.Disposable]], 
    typingsSlinky.vscodeNotebookRenderer.mod.Disposable
  ]
}
