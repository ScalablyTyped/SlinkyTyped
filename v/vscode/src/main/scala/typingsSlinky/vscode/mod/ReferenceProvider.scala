package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceProvider extends StObject {
  
  /**
    * Provide a set of project-wide references for the given position and document.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    *
    * @return An array of locations or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}
object ReferenceProvider {
  
  @scala.inline
  def apply(
    provideReferences: (TextDocument, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
    __obj.asInstanceOf[ReferenceProvider]
  }
  
  @scala.inline
  implicit class ReferenceProviderMutableBuilder[Self <: ReferenceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideReferences(
      value: (TextDocument, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
    ): Self = StObject.set(x, "provideReferences", js.Any.fromFunction4(value))
  }
}
