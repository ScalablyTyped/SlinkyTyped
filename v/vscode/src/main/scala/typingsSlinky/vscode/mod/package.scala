package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type DefinitionLink = typingsSlinky.vscode.mod.LocationLink
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[typingsSlinky.vscode.mod.Disposable]], 
    typingsSlinky.vscode.mod.Disposable
  ]
}
