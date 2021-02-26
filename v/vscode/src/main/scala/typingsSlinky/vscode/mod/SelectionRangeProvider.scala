package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRangeProvider extends StObject {
  
  /**
    * Provide selection ranges for the given positions.
    *
    * Selection ranges should be computed individually and independent for each position. The editor will merge
    * and deduplicate ranges but providers must return hierarchies of selection ranges so that a range
    * is [contained](#Range.contains) by its parent.
    *
    * @param document The document in which the command was invoked.
    * @param positions The positions at which the command was invoked.
    * @param token A cancellation token.
    * @return Selection ranges or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideSelectionRanges(document: TextDocument, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[SelectionRange]] = js.native
}
object SelectionRangeProvider {
  
  @scala.inline
  def apply(
    provideSelectionRanges: (TextDocument, js.Array[Position], CancellationToken) => ProviderResult[js.Array[SelectionRange]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal(provideSelectionRanges = js.Any.fromFunction3(provideSelectionRanges))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
  
  @scala.inline
  implicit class SelectionRangeProviderMutableBuilder[Self <: SelectionRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideSelectionRanges(
      value: (TextDocument, js.Array[Position], CancellationToken) => ProviderResult[js.Array[SelectionRange]]
    ): Self = StObject.set(x, "provideSelectionRanges", js.Any.fromFunction3(value))
  }
}
