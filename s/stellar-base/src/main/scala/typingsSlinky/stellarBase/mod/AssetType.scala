package typingsSlinky.stellarBase.mod

import typingsSlinky.stellarBase.stellarBaseStrings.credit_alphanum12
import typingsSlinky.stellarBase.stellarBaseStrings.credit_alphanum4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stellarBase.mod.AssetType.native
  - typingsSlinky.stellarBase.mod.AssetType.credit4
  - typingsSlinky.stellarBase.mod.AssetType.credit12
*/
trait AssetType extends js.Object

@JSImport("stellar-base", "AssetType")
@js.native
object AssetType extends js.Object {
  type credit12 = credit_alphanum12
  type credit4 = credit_alphanum4
  type native = typingsSlinky.stellarBase.stellarBaseStrings.native
}

